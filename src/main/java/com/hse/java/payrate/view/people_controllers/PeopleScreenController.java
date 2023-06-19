package com.hse.java.payrate.view.people_controllers;

import com.hse.java.payrate.view.navigation.NavigationConfig;
import com.hse.java.payrate.view.navigation.SceneManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PeopleScreenController {

    @FXML
    private Button Exit;
    @FXML
    private ListView<String> taskList;

    @FXML
    private Button taskAdd;
    @FXML
    private Button taskDelete;

    @FXML
    private TextField taskWrite;

    private ObservableList<String> tasks;


    @FXML
    void initialize() {
        tasks = FXCollections.observableArrayList();
        tasks.addAll(TaskListStorage.load());
        taskList.setItems(tasks);

        taskAdd.setOnAction(event -> {
            String task = taskWrite.getText();
            tasks.add(task);
            taskWrite.clear();
            TaskListStorage.save(tasks);
        });

        taskDelete.setOnAction(event -> deleteTask());

        Exit.setOnAction(event -> {
            SceneManager.popScene();
        });
    }

    @FXML
    void deleteTask() {
        String selectedTask = taskList.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            tasks.remove(selectedTask);
            TaskListStorage.save(tasks);
        }
    }
}