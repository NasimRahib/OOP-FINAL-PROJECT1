package administrator;

import daoClass.User;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import daoClass.MyFunction;

public class ManageUsers extends javax.swing.JPanel {

    User user = new User();
    DefaultTableModel model;

    public ManageUsers() {
        initComponents();
        init();
    }

    public void init() {
        tableView();
        background();
        idField.setText(String.valueOf(user.getId()));
    }

    public void clear() {
        name.setText("");
        email.setText("");
        password.setText("");
        universityId.setText("");
        phone.setText("");
        degree.setSelectedIndex(0);
        address.setText("");
        manageuserTable.clearSelection();
        searchField.setText("");
        idField.setText(String.valueOf(user.getId()));
        showDetails();
    }

    public void tableView() {
        user.getUserTableValue(manageuserTable, "");
        model = (DefaultTableModel) manageuserTable.getModel();
        manageuserTable.setRowHeight(30);
        manageuserTable.setShowGrid(true);
        manageuserTable.setGridColor(Color.black);
        manageuserTable.setBackground(Color.white);
        manageuserTable.setSelectionBackground(Color.gray);
    }

    public boolean isEmpty() {
        String uEmail = email.getText();
        if (name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "User name is missing", "Warning", 2);
            return false;
        }
        if (uEmail.isEmpty() || !uEmail.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Warning", 2);
            return false;
        }
        if (password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password is missing", "Warning", 2);
            return false;
        }
        if (phone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phone number is missing", "Warning", 2);
            return false;
        }
        if (phone.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Phone number is too long", "Warning", 2);
            return false;
        }
        if (universityId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "University Id is missing", "Warning", 2);
            return false;
        }
        if (address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "User address is missing", "Warning", 2);
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        universityId = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        phone = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        update = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        degree = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        manageuserTable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(114, 208, 235));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("University ID");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Phone");

        name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        universityId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        universityId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                universityIdKeyTyped(evt);
            }
        });

        password.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(114, 208, 235));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        update.setText("Update");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancle.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cancle.setText("Clear");
        cancle.setBorder(null);
        cancle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Degree Program");

        degree.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        degree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor Programs", "Master Programs", "Doctoral Programs" }));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Address");

        manageuserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manageuserTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        manageuserTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageuserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(manageuserTable);

        delete.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(degree, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(universityId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(universityId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (isEmpty()) {
            if (!check()) {
                int id = Integer.parseInt(idField.getText());
                String uName = name.getText();
                String uEmail = email.getText();
                String uPassword = password.getText();
                String uUniersityId = universityId.getText();
                String uDegree = degree.getSelectedItem().toString();
                String uPhone = phone.getText();
                String uAddress = address.getText();
                user.userManage("update", id, uName, uEmail, uPassword, uPhone, uUniersityId, uDegree, uAddress, null);
                clear();
                refresh();
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        clear();
    }//GEN-LAST:event_cancleActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (idField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select a user first", "Warning", 2);
        } else {
            int id = Integer.parseInt(idField.getText());
            user.userManage("delete", id, null, null, null, null, null, null, null, null);
            clear();
            refresh();
        }
    }//GEN-LAST:event_deleteActionPerformed
    int rowIndex;
    private void manageuserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserTableMouseClicked
        model = (DefaultTableModel) manageuserTable.getModel();
        rowIndex = manageuserTable.getSelectedRow();
        idField.setText(model.getValueAt(rowIndex, 0).toString());
        name.setText(model.getValueAt(rowIndex, 1).toString());
        email.setText(model.getValueAt(rowIndex, 2).toString());
        password.setText(model.getValueAt(rowIndex, 3).toString());
        phone.setText(model.getValueAt(rowIndex, 4).toString());
        universityId.setText(model.getValueAt(rowIndex, 5).toString());
        if (model.getValueAt(rowIndex, 6).toString().equals("Bachelor Programs")) {
            degree.setSelectedIndex(0);
        } else if (model.getValueAt(rowIndex, 6).toString().equals("Master Programs")) {
            degree.setSelectedIndex(1);
        } else {
            degree.setSelectedIndex(2);
        }
        address.setText(model.getValueAt(rowIndex, 7).toString());
    }//GEN-LAST:event_manageuserTableMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        manageuserTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address"}));
        user.getUserTableValue(manageuserTable, "");
        searchField.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        manageuserTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address"}));
        user.getUserTableValue(manageuserTable, searchField.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_phoneKeyTyped

    private void universityIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_universityIdKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_universityIdKeyTyped

    public void refresh() {
        manageuserTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address"}));
        user.getUserTableValue(manageuserTable, "");
        idField.setText(String.valueOf(user.getId()));
    }

    public boolean check() {
        String newEmail = email.getText();
        String newPhone = phone.getText();
        String rowEmail = model.getValueAt(rowIndex, 2).toString();
        String rowPhone = model.getValueAt(rowIndex, 4).toString();

        if (newEmail.equals(rowEmail) && newPhone.equals(rowPhone)) {
            return false;
        } else {
            if (!newEmail.equals(rowEmail)) {
                boolean x = user.isEmailExist(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(null, "This Email Already Exists", "Warning", 2);
                }
                return x;
            }
            if (!newPhone.equals(rowPhone)) {
                boolean x = user.isPhoneExist(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(null, "This Phone Already Exists", "Warning", 2);
                }
                return x;
            }
            return false;
        }
    }

    public void background() {
        Color bg = new Color(235, 235, 235);
        idField.setBackground(bg);
    }

    public void showDetails() {
        Dashboard.totalusers.setText(Integer.toString(MyFunction.countUserData()));
        Dashboard.bookCategoris.setText(Integer.toString(MyFunction.countData("book")));
        Dashboard.borrowbooks.setText(Integer.toString(MyFunction.countData("borrowbook")));
        Dashboard.overdue.setText(Integer.toString(MyFunction.countOverdueData()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton cancle;
    private javax.swing.JComboBox<String> degree;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manageuserTable;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField universityId;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
