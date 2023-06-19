package com.hse.java.payrate.view.main_screen_controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskListStorage {
    private static final String FILE_PATH = "tasks.txt";

    public static void save(List<String> tasks) {
        try {
            Path filePath = Paths.get(FILE_PATH);
            Files.write(filePath, tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> load() {
        List<String> tasks = new ArrayList<>();
        try {
            Path filePath = Paths.get(FILE_PATH);
            if (Files.exists(filePath)) {
                tasks = Files.readAllLines(filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}