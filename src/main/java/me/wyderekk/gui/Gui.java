package me.wyderekk.gui;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import me.wyderekk.config.Config;
import me.wyderekk.data.ClientManager;
import me.wyderekk.database.SQLHandler;
import me.wyderekk.utils.ImageUtils;
import me.wyderekk.utils.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Gui extends JFrame {
    
    public Gui() {
        Image img = ImageUtils.downloadImage("https://cdn.discordapp.com/attachments/997440120896639089/1077920680391213086/icon.png", 256, 256);
        setSize(960, 560);
        setResizable(false);
        setIconImage(img);
        initComponents();
        initTable();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new JTabbedPane();
        addUser = new JPanel();
        jLabel3 = new JLabel();
        nameField = new JTextField();
        jLabel4 = new JLabel();
        surnameField = new JTextField();
        jLabel5 = new JLabel();
        addressField = new JTextField();
        jLabel6 = new JLabel();
        phoneNumberField = new JTextField();
        jLabel7 = new JLabel();
        postalCodeField = new JTextField();
        jButton1 = new JButton();
        removeUser = new JPanel();
        jLabel2 = new JLabel();
        phoneNumber2 = new JTextField();
        jButton2 = new JButton();
        changeUserData = new JPanel();
        jLabel1 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel8 = new JLabel();
        newDataField = new JTextField();
        jButton3 = new JButton();
        jLabel9 = new JLabel();
        phoneNumber3 = new JTextField();
        userList = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        settingsPanel = new JPanel();
        themeToggle = new JToggleButton();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel14 = new JLabel();
        jLabel12 = new JLabel();
        pathField = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setAlignmentX(0.0F);
        jTabbedPane1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel3.setText("Imię");

        jLabel4.setText("Nazwisko");

        jLabel5.setText("Adres");

        jLabel6.setText("Numer Telefonu");

        jLabel7.setText("Kod Pocztowy");

        jButton1.setText("Potwierdź");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        GroupLayout addUserLayout = new GroupLayout(addUser);
        addUser.setLayout(addUserLayout);
        addUserLayout.setHorizontalGroup(
            addUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(nameField)
                    .addComponent(surnameField)
                    .addComponent(addressField)
                    .addComponent(postalCodeField)
                    .addComponent(phoneNumberField)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(809, Short.MAX_VALUE))
        );
        addUserLayout.setVerticalGroup(
            addUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(addUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postalCodeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dodaj użytkownika", addUser);

        jLabel2.setText("Numer telefonu");

        jButton2.setText("Potwierdź");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        GroupLayout removeUserLayout = new GroupLayout(removeUser);
        removeUser.setLayout(removeUserLayout);
        removeUserLayout.setHorizontalGroup(
            removeUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(removeUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(removeUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(phoneNumber2))
                .addContainerGap(809, Short.MAX_VALUE))
        );
        removeUserLayout.setVerticalGroup(
            removeUserLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(removeUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuń użytkownika", removeUser);

        jLabel1.setText("Ktorą wartość chcesz zmienic?");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Imię", "Nazwisko", "Adres", "Kod Pocztowy", "Numer Telefonu" }));

        jLabel8.setText("Nowa wartość");

        jButton3.setText("Potwierdź");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel9.setText("Numer użytkownika");

        GroupLayout changeUserDataLayout = new GroupLayout(changeUserData);
        changeUserData.setLayout(changeUserDataLayout);
        changeUserDataLayout.setHorizontalGroup(
            changeUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(changeUserDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(changeUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addGroup(changeUserDataLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(phoneNumber3, GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                        .addComponent(newDataField, GroupLayout.Alignment.LEADING)))
                .addContainerGap(783, Short.MAX_VALUE))
        );
        changeUserDataLayout.setVerticalGroup(
            changeUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(changeUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newDataField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Zmień informacje", changeUserData);

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Imię", "Nazwisko", "Adres", "Numer Telefonu", "Kod Pocztowy", "UUID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        GroupLayout userListLayout = new GroupLayout(userList);
        userList.setLayout(userListLayout);
        userListLayout.setHorizontalGroup(
            userListLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        userListLayout.setVerticalGroup(
            userListLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista użytkowników", userList);

        themeToggle.setText("Czarny");
        themeToggle.addActionListener(this::themeToggleActionPerformed);

        jLabel10.setText("Kolor motywu");
        jLabel10.setHorizontalAlignment(SwingConstants.LEADING);

        jLabel11.setText("Usuń wszystkie dane");

        jButton4.setText("Usuń");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("Exportuj");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jLabel14.setText("Exportuj do pliku Excel");

        jLabel12.setText("Scieżka Bazy Danych");

        pathField.setText(Config.getPath());

        GroupLayout settingsPanelLayout = new GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(themeToggle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pathField, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(themeToggle)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(pathField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(478, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ustawienia", settingsPanel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = nameField.getText().trim();
        String surname = surnameField.getText().trim();
        String address = addressField.getText().trim();
        String postalCode = postalCodeField.getText().trim();
        String phoneNumber = phoneNumberField.getText().trim();
        if(name.isBlank() && surname.isBlank() && address.isBlank() && postalCode.isBlank() && phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Pola nie moga byc puste!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(StringUtils.validName(name)) {
            JOptionPane.showMessageDialog(rootPane, "Imie nie moze zawierac cyfr!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(StringUtils.validSurname(surname)) {
            JOptionPane.showMessageDialog(rootPane, "Nazwisko nie moze zawierac cyfr!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(StringUtils.validPhoneNumber(phoneNumber)) {
            JOptionPane.showMessageDialog(rootPane, "Bledny numer telefonu!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(StringUtils.validPostalCode(postalCode)){
            JOptionPane.showMessageDialog(rootPane, "Bledny kod pocztowy!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ClientManager.add(rootPane, name, surname, address, postalCode, phoneNumber);
            nameField.setText("");
            surnameField.setText("");
            addressField.setText("");
            postalCodeField.setText("");
            phoneNumberField.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String phoneNumber = phoneNumber2.getText().trim();
        if(phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Pole nie moze byc puste!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(phoneNumber.length() != 9 || StringUtils.containsLetter(phoneNumber)) {
            JOptionPane.showMessageDialog(rootPane, "Podany numer jest bledny!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ClientManager.remove(rootPane, phoneNumber);
            phoneNumber2.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String newData = newDataField.getText().trim();
        String selected = jComboBox1.getSelectedItem().toString();
        String phoneNumber = phoneNumber3.getText().trim();
        if(newData.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Pole nie moze byc puste!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            SQLHandler.changeUserData(rootPane, phoneNumber, selected, newData);
            phoneNumber3.setText("");
            newDataField.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void themeToggleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_themeToggleActionPerformed
        String newThemeText;
        LookAndFeel newLookAndFeel;

        if (themeToggle.getText().equalsIgnoreCase("czarny")) {
            newLookAndFeel = new FlatMacLightLaf();
            newThemeText = "Biały";
        } else {
            newLookAndFeel = new FlatMacDarkLaf();
            newThemeText = "Czarny";
        }

        try {
            UIManager.setLookAndFeel(newLookAndFeel);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        themeToggle.setText(newThemeText);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_themeToggleActionPerformed

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Czy jesteś tego pewny?");
        if(option == JOptionPane.OK_OPTION) {
            SQLHandler.clearTable();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            JTable source = (JTable) evt.getSource();
            int row = source.rowAtPoint(evt.getPoint());
            int column = source.columnAtPoint(evt.getPoint());
            if (!source.isRowSelected(row)) {
                source.changeSelection(row, column, false, false);
            }
            JPopupMenu popup = new JPopupMenu();
            JMenuItem copyItem = new JMenuItem("Kopiuj");

            copyItem.addActionListener(e -> {
                StringSelection stringSelection = new StringSelection(jTable1.getValueAt(row, column).toString());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            });
            popup.add(copyItem);
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plik Excel", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Zapisz jako...");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getAbsolutePath().endsWith(".xlsx")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".xlsx");
            }
            try (FileOutputStream fos = new FileOutputStream(fileToSave)) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Data");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int rowCount = model.getRowCount();
                int columnCount = model.getColumnCount();
                XSSFRow headerRow = sheet.createRow(0);
                for (int i = 0; i < columnCount; i++) {
                    XSSFCell cell = headerRow.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }
                for (int i = 0; i < rowCount; i++) {
                    XSSFRow row = sheet.createRow(i + 1);
                    for (int j = 0; j < columnCount; j++) {
                        XSSFCell cell = row.createCell(j);
                        Object value = model.getValueAt(i, j);
                        if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }
                workbook.write(fos);
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTabbedPane1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        initTable();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void initTable() {
        SQLHandler sql = new SQLHandler();
        sql.getAllUsers(jTable1);
    }
    
    public static void initializeGui() {
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> new Gui().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel addUser;
    private JTextField addressField;
    private JPanel changeUserData;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JTabbedPane jTabbedPane1;
    private JTable jTable1;
    private JTextField nameField;
    private JTextField newDataField;
    private JTextField pathField;
    private JTextField phoneNumber2;
    private JTextField phoneNumber3;
    private JTextField phoneNumberField;
    private JTextField postalCodeField;
    private JPanel removeUser;
    private JPanel settingsPanel;
    private JTextField surnameField;
    private JToggleButton themeToggle;
    private JPanel userList;
    // End of variables declaration//GEN-END:variables
}
