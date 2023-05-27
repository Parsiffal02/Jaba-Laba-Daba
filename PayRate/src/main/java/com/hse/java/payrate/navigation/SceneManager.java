package com.hse.java.payrate.navigation;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;

public class SceneManager {
    private final Stack<Scene> sceneStack;
    private final Stage primaryStage;

    public SceneManager(Stage stage) {
        this.primaryStage = stage;
        sceneStack = new Stack<>();
    }

    public void pushScene(Scene scene) {
        sceneStack.push(scene);
        showScene(scene);
    }

    public void popScene() {
        sceneStack.pop();
        showScene(sceneStack.peek());
    }

    private void showScene(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
