package com.hse.java.payrate.navigation;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;

public class SceneManager {
    private static final Stack<Scene> sceneStack = new Stack<>();
    public static Stage primaryStage;


    public static void pushScene(Scene scene) {
        sceneStack.push(scene);
        showScene(scene);
    }

    public static void popScene() {
        sceneStack.pop();
        showScene(sceneStack.peek());
    }

    private static void showScene(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
