package cf.wyderekk.main;

import cf.wyderekk.config.Config;
import cf.wyderekk.database.SQLHandler;
import cf.wyderekk.utils.ImageUtils;
import cf.wyderekk.utils.StringUtils;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Gui extends javax.swing.JFrame {
    
    public Gui() {
        Image img = ImageUtils.getImgFromUrl("https://cdn.discordapp.com/attachments/997440120896639089/1077920680391213086/icon.png", 256, 256);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        addUser = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        postalCodeField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        removeUser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        phoneNumber2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        changeUserData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        newDataField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        phoneNumber3 = new javax.swing.JTextField();
        userList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        settingsPanel = new javax.swing.JPanel();
        themeToggle = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pathField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setAlignmentX(0.0F);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel3.setText("Imię");

        jLabel4.setText("Nazwisko");

        jLabel5.setText("Adres");

        jLabel6.setText("Numer Telefonu");

        jLabel7.setText("Kod Pocztowy");

        jButton1.setText("Potwierdź");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUserLayout = new javax.swing.GroupLayout(addUser);
        addUser.setLayout(addUserLayout);
        addUserLayout.setHorizontalGroup(
            addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap(809, Short.MAX_VALUE))
        );
        addUserLayout.setVerticalGroup(
            addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dodaj użytkownika", addUser);

        jLabel2.setText("Numer telefonu");

        jButton2.setText("Potwierdź");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeUserLayout = new javax.swing.GroupLayout(removeUser);
        removeUser.setLayout(removeUserLayout);
        removeUserLayout.setHorizontalGroup(
            removeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(removeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(phoneNumber2))
                .addContainerGap(809, Short.MAX_VALUE))
        );
        removeUserLayout.setVerticalGroup(
            removeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuń użytkownika", removeUser);

        jLabel1.setText("Ktorą wartość chcesz zmienic?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imię", "Nazwisko", "Adres", "Kod Pocztowy", "Numer Telefonu" }));

        jLabel8.setText("Nowa wartość");

        jButton3.setText("Potwierdź");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Numer użytkownika");

        javax.swing.GroupLayout changeUserDataLayout = new javax.swing.GroupLayout(changeUserData);
        changeUserData.setLayout(changeUserDataLayout);
        changeUserDataLayout.setHorizontalGroup(
            changeUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeUserDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(changeUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addGroup(changeUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(phoneNumber3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                        .addComponent(newDataField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(783, Short.MAX_VALUE))
        );
        changeUserDataLayout.setVerticalGroup(
            changeUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newDataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Zmień informacje", changeUserData);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
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

        javax.swing.GroupLayout userListLayout = new javax.swing.GroupLayout(userList);
        userList.setLayout(userListLayout);
        userListLayout.setHorizontalGroup(
            userListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        userListLayout.setVerticalGroup(
            userListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista użytkowników", userList);

        themeToggle.setText("Czarny");
        themeToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themeToggleActionPerformed(evt);
            }
        });

        jLabel10.setText("Kolor motywu");
        jLabel10.setHorizontalAlignment(SwingConstants.LEADING);

        jLabel11.setText("Usuń wszystkie dane");

        jButton4.setText("Usuń");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exportuj");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Exportuj do pliku Excel");

        jLabel12.setText("Scieżka Bazy Danych");

        pathField.setText(Config.getPath());

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(themeToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themeToggle)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(478, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ustawienia", settingsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
            Client.add(rootPane, name, surname, address, postalCode, phoneNumber);
            nameField.setText("");
            surnameField.setText("");
            addressField.setText("");
            postalCodeField.setText("");
            phoneNumberField.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String phoneNumber = phoneNumber2.getText().trim();
        if(phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Pole nie moze byc puste!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(phoneNumber.length() != 9 || StringUtils.containsLetter(phoneNumber)) {
            JOptionPane.showMessageDialog(rootPane, "Podany numer jest bledny!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Client.remove(rootPane, phoneNumber);
            phoneNumber2.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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

    private void themeToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themeToggleActionPerformed
        if(themeToggle.getText().equalsIgnoreCase("czarny")) {
            try {
                UIManager.setLookAndFeel(new FlatMacLightLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            themeToggle.setText("Biały");
        } else {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            themeToggle.setText("Czarny");
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_themeToggleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int option = JOptionPane.showConfirmDialog(rootPane, "Czy jesteś tego pewny?");
        if(option == JOptionPane.OK_OPTION) {
            SQLHandler.clearTable();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = source.columnAtPoint(evt.getPoint());
        if (!source.isRowSelected(row))
            source.changeSelection(row, column, false, false);
        JPopupMenu popup = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("Kopiuj");
        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                StringSelection stringSelection = new StringSelection(jTable1.getValueAt(row, column).toString());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
        popup.add(copyItem);
        popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        initTable();
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    
    private void initTable() {
        SQLHandler sql = new SQLHandler();
        sql.getAllUsers(jTable1);
    }
    
    public static void initializeGui() {
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUser;
    private javax.swing.JTextField addressField;
    private javax.swing.JPanel changeUserData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField newDataField;
    private javax.swing.JTextField pathField;
    private javax.swing.JTextField phoneNumber2;
    private javax.swing.JTextField phoneNumber3;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JPanel removeUser;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JToggleButton themeToggle;
    private javax.swing.JPanel userList;
    // End of variables declaration//GEN-END:variables
}
