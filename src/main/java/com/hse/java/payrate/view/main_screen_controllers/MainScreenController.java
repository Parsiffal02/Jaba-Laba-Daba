package com.hse.java.payrate.view.main_screen_controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import java.net.URL;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class MainScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane calendar;

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
        LocalDate currentDate = LocalDate.now();

        YearMonth yearMonth = YearMonth.from(currentDate);

        int daysInMonth = yearMonth.lengthOfMonth();

        int firstDayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();

        int dayOfMonth = 1;
        for (int row = 1; row < 7; row++) {
            for (int column = 1; column < 8; column++) {
                if (row == 1 && column < firstDayOfWeek) {
                    continue;
                }
                if (dayOfMonth > daysInMonth) {
                    continue;
                }

                Label dayLabel = new Label(String.valueOf(dayOfMonth));
                calendar.add(dayLabel, column, row);
                dayOfMonth++;
            }
        }
        String[] daysOfWeek = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};

        for (int i = 0; i < daysOfWeek.length; i++) {
            Label dayOfWeekLabel = new Label(daysOfWeek[i]);
            calendar.add(dayOfWeekLabel, i + 1, 0);
        }

        String monthName = yearMonth.getMonth().toString();

        Label monthLabel = new Label(monthName);
        calendar.add(monthLabel, 1, 0, 7, 1);

        calendar.setHgap(10);
        calendar.setVgap(10);

        Insets monthLabelInsets = new Insets(0, 0, 50, 0);
        GridPane.setMargin(monthLabel, monthLabelInsets);

        Insets dayOfWeekLabelInsets = new Insets(0, 0, 5, 0);
        for (int i = 0; i < daysOfWeek.length; i++) {
            Label dayOfWeekLabel = new Label(daysOfWeek[i]);
            calendar.add(dayOfWeekLabel, i + 1, 0);
            GridPane.setMargin(dayOfWeekLabel, dayOfWeekLabelInsets);
        }

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