package cf.wyderekk.main;

import cf.wyderekk.database.SQLHandler;
import java.awt.Component;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Client {

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String phoneNumber;
    private String id;

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
    
    public Client(String name, String surname, String address, String postalCode, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.id = UUID.randomUUID().toString();
    }

    public Client(String name, String surname, String address, String postalCode, String phoneNumber, String id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
