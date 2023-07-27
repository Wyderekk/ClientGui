package me.wyderekk.data;

import me.wyderekk.database.SQLHandler;

import javax.swing.*;
import java.awt.*;

public class ClientManager {

    public static void add(Component parentComponent, String name, String surname, String address, String postalCode, String phoneNumber) {
        if(SQLHandler.findUserByPhoneNumber(phoneNumber) != null) {
            JOptionPane.showMessageDialog(parentComponent, "Użytkownik z tym numerem telefonu juz istnieje!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Client client = new Client(name, surname, address, postalCode, phoneNumber);
            SQLHandler.createUser(client);
            JOptionPane.showMessageDialog(parentComponent, "Pomyślnie utworzono uzytkownika!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void remove(Component parentComponent, String phoneNumber) {
        SQLHandler.removeUser(SQLHandler.findUserByPhoneNumber(phoneNumber));
        JOptionPane.showMessageDialog(parentComponent, "Pomyślnie usunięto uzytkownika!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
