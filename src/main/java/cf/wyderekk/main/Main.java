package cf.wyderekk.main;

import cf.wyderekk.database.SQLHandler;

public class Main {

    public static void main(String[] args) {
        SQLHandler.connect();
        MainGui.initializeGui();
    }
}
