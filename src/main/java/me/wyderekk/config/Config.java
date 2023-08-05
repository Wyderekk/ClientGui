package me.wyderekk.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Config {

    private static final String homeDirectory = System.getProperty("user.home");
    private static final File configFolder = new File(homeDirectory, ".config2");
    private static final File configFile = new File(configFolder, "config.txt");
    private static final File databaseFile = new File(configFile, "database.db");

    public static String getPath() {
        createFolder();
        try {
            if(!configFile.exists()) {
                configFile.createNewFile();
                createNewConfig();
                getPath();
            } else {
                Scanner sc = new Scanner(configFile);
                if(sc.hasNext()) {
                    return sc.nextLine().split("=")[1];
                }
            }
        } catch (IOException ignored) {

        }
        return configFolder + "\\database.db";
    }

    public static void createDatabase() {
        createFolder();
        try {
            if(!databaseFile.exists()) {
                databaseFile.createNewFile();
            }
        } catch (IOException ignored) {

        }
    }

    private static void createNewConfig() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(configFile))) {
            bufferedWriter.append("path=").append(configFolder.toString()).append("\\database.db");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFolder() {
        if(!configFolder.exists()) {
            configFolder.mkdir();
        }
    }
}
