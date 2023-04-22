package cf.wyderekk.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Config {

    private static final String homeDirectory = System.getProperty("user.home");
    private static final File folder = new File(homeDirectory, ".config2");
    private static final File file = new File(folder, "config.txt");
    private static final File databaseFile = new File(folder, "database.db");

    public static String getPath() {
        makeFolder();
        try {
            if(!file.exists()) {
                boolean create = file.createNewFile();
                createNewConfig(file);
                getPath();
            } else {
                Scanner sc = new Scanner(file);
                if(sc.hasNext()) {
                    return sc.nextLine().split("=")[1];
                }
            }
        } catch (IOException ignored) {

        }
        return folder + "\\database.db";
    }

    public static void createDatabase() {
        makeFolder();
        try {
            if(!databaseFile.exists()) {
                boolean create = databaseFile.createNewFile();
            }
        } catch (IOException ignored) {

        }
    }

    private static void createNewConfig(File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.append("path=").append(folder.toString()).append("\\database.db");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeFolder() {
        if(!folder.exists()) {
            boolean create = folder.mkdir();
        }
    }
}
