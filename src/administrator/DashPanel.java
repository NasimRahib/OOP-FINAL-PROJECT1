package administrator;

import daoClass.AnnouncementDao;
import daoClass.User;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import daoClass.MyFunction;

public class DashPanel extends javax.swing.JPanel {

    User user = new User();
    DefaultTableModel model;
    AnnouncementDao ad = new AnnouncementDao();

    public DashPanel() {
        initComponents();
        init();
    }

    public void init() {
        tableView1();
        tableView2();
        tableView3();
    }

    public void clear() {
        pendingUserTable.clearSelection();
        allUsersTable.clearSelection();
        messageTable.clearSelection();
        showDetails();
    }

    public void tableView1() {
        user.getPendingValue(pendingUserTable);
        model = (DefaultTableModel) pendingUserTable.getModel();
        pendingUserTable.setRowHeight(30);
        pendingUserTable.setShowGrid(true);
        pendingUserTable.setGridColor(Color.black);
        pendingUserTable.setBackground(Color.white);
        pendingUserTable.setSelectionBackground(Color.gray);
    }

    public void tableView2() {
        user.getAllUserTableValue(allUsersTable);
        model = (DefaultTableModel) allUsersTable.getModel();
        allUsersTable.setRowHeight(30);
        allUsersTable.setShowGrid(true);
        allUsersTable.setGridColor(Color.black);
        allUsersTable.setBackground(Color.white);
        allUsersTable.setSelectionBackground(Color.gray);
    }

    public void tableView3() {
        ad.getMessageTableValue(messageTable, "");
        model = (DefaultTableModel) messageTable.getModel();
        messageTable.setRowHeight(30);
        messageTable.setShowGrid(true);
        messageTable.setGridColor(Color.black);
        messageTable.setBackground(Color.white);
        messageTable.setSelectionBackground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingUserTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allUsersTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(114, 208, 235));

        pendingUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendingUserTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pendingUserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingUserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pendingUserTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Users Pending Request");

        allUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address", "Status"
            }
        ));
        jScrollPane2.setViewportView(allUsersTable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("All Users");

        messageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "View", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(messageTable);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Announcements");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(318, 318, 318)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pendingUserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingUserTableMouseClicked
        int rowIndex;
        model = (DefaultTableModel) pendingUserTable.getModel();
        rowIndex = pendingUserTable.getSelectedRow();
        int id = (int) model.getValueAt(rowIndex, 0);
        user.getApprove(id);
        refresh();
        clear();
    }//GEN-LAST:event_pendingUserTableMouseClicked

    public void refresh() {
        pendingUserTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Email", "Status"}));
        user.getPendingValue(pendingUserTable);
        allUsersTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Email", "Password", "Phone", "University ID", "Degree Program", "Address", "Status"}));
        user.getAllUserTableValue(allUsersTable);
        messageTable.setModel(new DefaultTableModel(null, new Object[]{"ID", "View", "Message", "Status"}));
        ad.getMessageTableValue(messageTable, "");
    }

    public void showDetails() {
        Dashboard.totalusers.setText(Integer.toString(MyFunction.countUserData()));
        Dashboard.bookCategoris.setText(Integer.toString(MyFunction.countData("book")));
        Dashboard.borrowbooks.setText(Integer.toString(MyFunction.countData("borrowbook")));
        Dashboard.overdue.setText(Integer.toString(MyFunction.countOverdueData()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allUsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable messageTable;
    private javax.swing.JTable pendingUserTable;
    // End of variables declaration//GEN-END:variables
}
