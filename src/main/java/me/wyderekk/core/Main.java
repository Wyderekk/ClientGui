package me.wyderekk.core;

import me.wyderekk.database.SQLHandler;
import me.wyderekk.gui.Gui;

public class Main {

    public static void main(String[] args) {
        SQLHandler.connect();
        Gui.initializeGui();
    }

}
