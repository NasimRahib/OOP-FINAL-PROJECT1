package administrator;

import daoClass.User;
import java.awt.Color;
import javax.swing.JOptionPane;

import user.UserLogin;

public class Dashboard extends javax.swing.JFrame {

    AddUser addUser = new AddUser();
    ManageUsers manageUsers = new ManageUsers();
    DashPanel dashPanel = new DashPanel();
    ManageBooks manageBooks = new ManageBooks();
    BorrowBooks borrowBooks = new BorrowBooks();
    ReturnBook returnBook = new ReturnBook();
    OverdueReturn over = new OverdueReturn();
    ReturnBookView returnBookView = new ReturnBookView();
    OverdueBookView overdueBookView = new OverdueBookView();
    Announcement announcement = new Announcement();
    User u = new User();

    Color dashboardColor = new Color(102, 102, 102);
    Color selectionColor = new Color(53, 64, 77);
    Color primaryColor = new Color(42, 53, 66);

    public Dashboard() {
        initComponents();
        init();
    }

    public void init() {
        componentPanel.add(addUser);
        componentPanel.add(manageUsers);
        componentPanel.add(dashPanel);
        componentPanel.add(manageBooks);
        componentPanel.add(borrowBooks);
        componentPanel.add(returnBook);
        componentPanel.add(over);
        componentPanel.add(returnBookView);
        componentPanel.add(overdueBookView);
        componentPanel.add(announcement);
        
        addUser.setVisible(false);
        manageUsers.setVisible(false);
        dashPanel.setVisible(true);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);
        dashboardPanel.setBackground(dashboardColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        componentPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        managebooksPanel = new javax.swing.JPanel();
        managebookjLabel = new javax.swing.JLabel();
        announcementPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        addUserPanel = new javax.swing.JPanel();
        AddUser = new javax.swing.JLabel();
        manageUserPanel = new javax.swing.JPanel();
        manageuser = new javax.swing.JLabel();
        borrowBookPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        returnBookPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        overdueReturnPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        returnBookViewPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        overdueBookViewPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        totalusers = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bookCategoris = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        borrowbooks = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        overdue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        componentPanel.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.add(componentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 1020, 530));

        jPanel3.setBackground(new java.awt.Color(42, 53, 66));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel5.setText("  DASHBOARD");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 40));

        managebooksPanel.setBackground(new java.awt.Color(42, 53, 66));

        managebookjLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        managebookjLabel.setForeground(new java.awt.Color(255, 255, 255));
        managebookjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/managebook.png"))); // NOI18N
        managebookjLabel.setText("  Manage Books");
        managebookjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        managebookjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managebookjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout managebooksPanelLayout = new javax.swing.GroupLayout(managebooksPanel);
        managebooksPanel.setLayout(managebooksPanelLayout);
        managebooksPanelLayout.setHorizontalGroup(
            managebooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managebooksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managebookjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        managebooksPanelLayout.setVerticalGroup(
            managebooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managebookjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(managebooksPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 250, 40));

        announcementPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/announcement.png"))); // NOI18N
        jLabel9.setText("  Manage Announcements");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout announcementPanelLayout = new javax.swing.GroupLayout(announcementPanel);
        announcementPanel.setLayout(announcementPanelLayout);
        announcementPanelLayout.setHorizontalGroup(
            announcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, announcementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        announcementPanelLayout.setVerticalGroup(
            announcementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(announcementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 40));

        addUserPanel.setBackground(new java.awt.Color(42, 53, 66));

        AddUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddUser.setForeground(new java.awt.Color(255, 255, 255));
        AddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_user.png"))); // NOI18N
        AddUser.setText("  Add User");
        AddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(addUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 40));

        manageUserPanel.setBackground(new java.awt.Color(42, 53, 66));

        manageuser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageuser.setForeground(new java.awt.Color(255, 255, 255));
        manageuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manage_user.png"))); // NOI18N
        manageuser.setText("  Manage Users");
        manageuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manageUserPanelLayout = new javax.swing.GroupLayout(manageUserPanel);
        manageUserPanel.setLayout(manageUserPanelLayout);
        manageUserPanelLayout.setHorizontalGroup(
            manageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageuser, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        manageUserPanelLayout.setVerticalGroup(
            manageUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageuser, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(manageUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 40));

        borrowBookPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/borrowbook.png"))); // NOI18N
        jLabel7.setText("  Borrow Books");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout borrowBookPanelLayout = new javax.swing.GroupLayout(borrowBookPanel);
        borrowBookPanel.setLayout(borrowBookPanelLayout);
        borrowBookPanelLayout.setHorizontalGroup(
            borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        borrowBookPanelLayout.setVerticalGroup(
            borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(borrowBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        returnBookPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/returnbook.png"))); // NOI18N
        jLabel10.setText("  Return Books");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout returnBookPanelLayout = new javax.swing.GroupLayout(returnBookPanel);
        returnBookPanel.setLayout(returnBookPanelLayout);
        returnBookPanelLayout.setHorizontalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        returnBookPanelLayout.setVerticalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(returnBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

        overdueReturnPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/overdue.png"))); // NOI18N
        jLabel11.setText("  Overdue Returns");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout overdueReturnPanelLayout = new javax.swing.GroupLayout(overdueReturnPanel);
        overdueReturnPanel.setLayout(overdueReturnPanelLayout);
        overdueReturnPanelLayout.setHorizontalGroup(
            overdueReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overdueReturnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        overdueReturnPanelLayout.setVerticalGroup(
            overdueReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(overdueReturnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 40));

        returnBookViewPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/returnbooklist.png"))); // NOI18N
        jLabel13.setText("  Return Books View");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout returnBookViewPanelLayout = new javax.swing.GroupLayout(returnBookViewPanel);
        returnBookViewPanel.setLayout(returnBookViewPanelLayout);
        returnBookViewPanelLayout.setHorizontalGroup(
            returnBookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        returnBookViewPanelLayout.setVerticalGroup(
            returnBookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(returnBookViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 40));

        overdueBookViewPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/overduelist.png"))); // NOI18N
        jLabel14.setText("  Overdue Books View");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout overdueBookViewPanelLayout = new javax.swing.GroupLayout(overdueBookViewPanel);
        overdueBookViewPanel.setLayout(overdueBookViewPanelLayout);
        overdueBookViewPanelLayout.setHorizontalGroup(
            overdueBookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overdueBookViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        overdueBookViewPanelLayout.setVerticalGroup(
            overdueBookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(overdueBookViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 670));

        jPanel11.setBackground(new java.awt.Color(114, 208, 235));
        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel11MouseDragged(evt);
            }
        });
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel1.setText("Logout");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 2, 90, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minus.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 2, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library.png"))); // NOI18N
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LIBRARY MANAGEMENT");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, -1, 40));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/administrator.png"))); // NOI18N
        jPanel11.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 170, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minus.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Users");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        totalusers.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        totalusers.setForeground(new java.awt.Color(51, 51, 255));
        totalusers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(totalusers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalusers, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 200, 100));

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));

        jPanel6.setBackground(new java.awt.Color(0, 255, 51));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Book Categories");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bookCategoris.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        bookCategoris.setForeground(new java.awt.Color(255, 153, 0));
        bookCategoris.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookCategoris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookCategoris, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 200, 100));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));

        jPanel10.setBackground(new java.awt.Color(0, 0, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Borrow Books");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        borrowbooks.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        borrowbooks.setForeground(new java.awt.Color(255, 255, 255));
        borrowbooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(borrowbooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowbooks, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 200, -1));

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));

        jPanel12.setBackground(new java.awt.Color(0, 255, 255));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Overdue");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        overdue.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        overdue.setForeground(new java.awt.Color(255, 0, 204));
        overdue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(overdue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdue, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, -1, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void managebookjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managebookjLabelMouseClicked
        manageBooks.setVisible(true);
        addUser.setVisible(false);
        manageUsers.setVisible(false);
        dashPanel.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        borrowBookPanel.setBackground(primaryColor);
        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(selectionColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
    }//GEN-LAST:event_managebookjLabelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            UserLogin ul = new UserLogin();
            ul.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(Dashboard.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked
    int xx, xy;
    private void jPanel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel11MouseDragged

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel11MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setExtendedState(Dashboard.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    }//GEN-LAST:event_jLabel12MouseClicked

    private void AddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserMouseClicked
        addUser.setVisible(true);
        manageUsers.setVisible(false);
        dashPanel.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(selectionColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        addUser.refresh();
    }//GEN-LAST:event_AddUserMouseClicked

    private void manageuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseClicked
        manageUsers.setVisible(true);
        addUser.setVisible(false);
        dashPanel.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(selectionColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        manageUsers.refresh();
    }//GEN-LAST:event_manageuserMouseClicked
 
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dashPanel.setVisible(true);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(selectionColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        dashPanel.refresh();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(true);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(selectionColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        overdueBookView.setVisible(false);
        borrowBooks.refresh();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(true);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(selectionColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        returnBook.refresh();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(true);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(selectionColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        over.refresh();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(true);
        overdueBookView.setVisible(false);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(selectionColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(primaryColor);
        returnBookView.refresh();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(true);
        announcement.setVisible(false);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(selectionColor);
        announcementPanel.setBackground(primaryColor);
        overdueBookView.refresh();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dashPanel.setVisible(false);
        manageUsers.setVisible(false);
        addUser.setVisible(false);
        manageBooks.setVisible(false);
        borrowBooks.setVisible(false);
        returnBook.setVisible(false);
        over.setVisible(false);
        returnBookView.setVisible(false);
        overdueBookView.setVisible(false);
        announcement.setVisible(true);

        addUserPanel.setBackground(primaryColor);
        dashboardPanel.setBackground(dashboardColor);
        manageUserPanel.setBackground(primaryColor);
        managebooksPanel.setBackground(primaryColor);
        borrowBookPanel.setBackground(primaryColor);
        returnBookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        returnBookViewPanel.setBackground(primaryColor);
        overdueBookViewPanel.setBackground(primaryColor);
        announcementPanel.setBackground(selectionColor);
        overdueBookView.refresh();
    }//GEN-LAST:event_jLabel9MouseClicked

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUser;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JPanel announcementPanel;
    public static javax.swing.JLabel bookCategoris;
    private javax.swing.JPanel borrowBookPanel;
    public static javax.swing.JLabel borrowbooks;
    private javax.swing.JPanel componentPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel manageUserPanel;
    private javax.swing.JLabel managebookjLabel;
    private javax.swing.JPanel managebooksPanel;
    private javax.swing.JLabel manageuser;
    public static javax.swing.JLabel overdue;
    private javax.swing.JPanel overdueBookViewPanel;
    private javax.swing.JPanel overdueReturnPanel;
    private javax.swing.JPanel returnBookPanel;
    private javax.swing.JPanel returnBookViewPanel;
    public static javax.swing.JLabel totalusers;
    public static javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

