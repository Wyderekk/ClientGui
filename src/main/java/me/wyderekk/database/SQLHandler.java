package me.wyderekk.database;

import me.wyderekk.config.Config;
import me.wyderekk.data.Client;
import me.wyderekk.utils.StringUtils;
import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQLHandler {

    private static Connection con;

    public static void connect() {
        String URL = "jdbc:sqlite:" + Config.getPath();
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(URL);
            createTable();
            Runtime.getRuntime().addShutdownHook(new Thread(SQLHandler::disconnect));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void createUser(Client client) {
        PreparedStatement ps;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT phone_number FROM users WHERE phone_number='" + client.getPhoneNumber() + "'");
            if (!result.next()) {
                String sql = "INSERT INTO users (name, surname, address, postalcode, phone_number, id) VALUES (?, ?, ?, ?, ?, ?)";
                ps = SQLHandler.con.prepareStatement(sql);
                ps.setString(1, client.getName());
                ps.setString(2, client.getSurname());
                ps.setString(3, client.getAddress());
                ps.setString(4, client.getPostalCode());
                ps.setString(5, client.getPhoneNumber());
                ps.setString(6, client.getId());
                ps.executeUpdate();
            } else {
                System.err.println("ERR: User already exists!");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void removeUser(Client client) {
        PreparedStatement ps;
        try {
            String sql = "DELETE FROM users WHERE phone_number = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getPhoneNumber());
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(Client client) {
        PreparedStatement ps;
        try {
            String sql = "UPDATE users SET name = ?, surname = ?, address = ?, postalcode = ?, phone_number = ? WHERE phone_number = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getSurname());
            ps.setString(3, client.getAddress());
            ps.setString(4, client.getPostalCode());
            ps.setString(5, client.getPhoneNumber());
            ps.setString(6, client.getPhoneNumber());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateUser(Client client, String newPhoneNumber) {
        PreparedStatement ps;
        try {
            String sql = "UPDATE users SET name = ?, surname = ?, address = ?, postalcode = ?, phone_number = ? WHERE phone_number = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getSurname());
            ps.setString(3, client.getAddress());
            ps.setString(4, client.getPostalCode());
            ps.setString(5, newPhoneNumber);
            ps.setString(6, client.getPhoneNumber());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void clearTable() {
        String deleteSql = "DELETE FROM users";
        PreparedStatement ps;
        try {
            ps = SQLHandler.con.prepareStatement(deleteSql);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void changeUserData(Component component, String phoneNumber, String option, String newValue) {
        Client client = findUserByPhoneNumber(phoneNumber);
        if(client != null) {
            switch(option) {
                case "Imię" -> {
                    if(StringUtils.validName(newValue)) {
                        JOptionPane.showMessageDialog(component, "Imie nie moze zawierac cyfr!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(component, "Pomyslnie zmieniono imie!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        client.setName(newValue);
                        updateUser(client); 
                    }  
                }
                case "Nazwisko" -> {
                    if(StringUtils.validSurname(newValue)) {
                        JOptionPane.showMessageDialog(component, "Nazwisko nie moze zawierac cyfr!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(component, "Pomyslnie zmieniono nazwisko!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        client.setSurname(newValue);
                        updateUser(client); 
                    }  
                }
                case "Adres" -> {
                    JOptionPane.showMessageDialog(component, "Pomyslnie zmieniono adres!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    client.setAddress(newValue);
                    updateUser(client);
                }
                case "Kod Pocztowy" -> {
                    if(StringUtils.validPostalCode(newValue)) {
                        JOptionPane.showMessageDialog(component, "Bledny kod pocztowy!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(component, "Pomyslnie zmieniono kod pocztowy!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        client.setPostalCode(newValue);
                        updateUser(client);
                    }  
                }
                case "Numer Telefonu" -> {
                    if(StringUtils.validPhoneNumber(newValue)) {
                        JOptionPane.showMessageDialog(component, "Bledny numer telefonu!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(component, "Pomyslnie zmieniono numer telefonu!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        updateUser(client, newValue);
                        client.setPhoneNumber(newValue);
                    }  
                }
            }
        }
    }
    
    public static Client findUserByPhoneNumber(String phoneNumber) {
        PreparedStatement ps;
        String sql = "SELECT * FROM users WHERE phone_number=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, phoneNumber);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return new Client(result.getString("name"), result.getString("surname"), result.getString("address"), result.getString("postalcode"), result.getString("phone_number"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void getAllUsers(JTable table)  {
        try {
            String query = "SELECT * FROM users";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new Object[]{"Imię", "Nazwisko", "Kod pocztowy", "Numer Telefonu", "ID"}, 0);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String postalCode = resultSet.getString("postalcode");
                String phoneNumber = resultSet.getString("phone_number");
                String id = resultSet.getString("id");
                model.addRow(new Object[]{name, surname, postalCode, phoneNumber, id});
            }
            table.setCellSelectionEnabled(false);
            table.setDefaultEditor(Object.class, null);
            table.setEnabled(false);
            table.getTableHeader().setReorderingAllowed(false);
            table.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void createTable() {
        Config.createDatabase();
        try (PreparedStatement ps = con.prepareStatement(
                "CREATE TABLE IF NOT EXISTS users (name TEXT, surname TEXT, address TEXT, postalcode TEXT, phone_number TEXT, id TEXT)"
        )) {
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
