package user;

import java.awt.Color;
import javax.swing.JOptionPane;

public class UserDashboard extends javax.swing.JFrame {

    UserBorrowBook userBorrowBook = new UserBorrowBook();
    UserReturnBook userReturnBook = new UserReturnBook();
    UserOverdueReturn userOverdueReturn = new UserOverdueReturn();
    ViewAnnouncement viewAnnouncement = new ViewAnnouncement();
    MyAccount myAccount = new MyAccount();
    UserReturnBookView userReturnBookView = new UserReturnBookView();
    UserOverdueBookView userOverdueBookView = new UserOverdueBookView();
    Color dashboardColor = new Color(102, 102, 102);
    Color selectionColor = new Color(53, 64, 77);
    Color primaryColor = new Color(42, 53, 66);

    public UserDashboard() {
        initComponents();
        init();
    }

    public void init() {
        componentPanel.add(userBorrowBook);
        componentPanel.add(userReturnBook);
        componentPanel.add(userOverdueReturn);
        componentPanel.add(viewAnnouncement);
        componentPanel.add(myAccount);
        componentPanel.add(userReturnBookView);
        componentPanel.add(userOverdueBookView);
        userBorrowBook.setVisible(true);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        borrowbookPanel.setBackground(selectionColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        componentPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        borrowbookPanel = new javax.swing.JPanel();
        managebookjLabel = new javax.swing.JLabel();
        returnbookPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        overdueReturnPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        viewAnnouncementPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        myAccountPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        returnbookViewPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        overduebookViewPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        bookCategoris = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        borrowbooks = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        overdue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        borrowbookPanel.setBackground(new java.awt.Color(42, 53, 66));

        managebookjLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        managebookjLabel.setForeground(new java.awt.Color(255, 255, 255));
        managebookjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/borrowbook.png"))); // NOI18N
        managebookjLabel.setText("  Borrow Books");
        managebookjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        managebookjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managebookjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout borrowbookPanelLayout = new javax.swing.GroupLayout(borrowbookPanel);
        borrowbookPanel.setLayout(borrowbookPanelLayout);
        borrowbookPanelLayout.setHorizontalGroup(
            borrowbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowbookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managebookjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        borrowbookPanelLayout.setVerticalGroup(
            borrowbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowbookPanelLayout.createSequentialGroup()
                .addComponent(managebookjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(borrowbookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 250, 40));

        returnbookPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/returnbook.png"))); // NOI18N
        jLabel7.setText("  Return Books");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout returnbookPanelLayout = new javax.swing.GroupLayout(returnbookPanel);
        returnbookPanel.setLayout(returnbookPanelLayout);
        returnbookPanelLayout.setHorizontalGroup(
            returnbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnbookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );
        returnbookPanelLayout.setVerticalGroup(
            returnbookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnbookPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(returnbookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 40));

        overdueReturnPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/overdue.png"))); // NOI18N
        jLabel8.setText("  Overdue Returns");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout overdueReturnPanelLayout = new javax.swing.GroupLayout(overdueReturnPanel);
        overdueReturnPanel.setLayout(overdueReturnPanelLayout);
        overdueReturnPanelLayout.setHorizontalGroup(
            overdueReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overdueReturnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        overdueReturnPanelLayout.setVerticalGroup(
            overdueReturnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(overdueReturnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 40));

        viewAnnouncementPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/announcement.png"))); // NOI18N
        jLabel9.setText("  View Announcements");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewAnnouncementPanelLayout = new javax.swing.GroupLayout(viewAnnouncementPanel);
        viewAnnouncementPanel.setLayout(viewAnnouncementPanelLayout);
        viewAnnouncementPanelLayout.setHorizontalGroup(
            viewAnnouncementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAnnouncementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        viewAnnouncementPanelLayout.setVerticalGroup(
            viewAnnouncementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAnnouncementPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(viewAnnouncementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 40));

        myAccountPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel10.setText("  My Account");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout myAccountPanelLayout = new javax.swing.GroupLayout(myAccountPanel);
        myAccountPanel.setLayout(myAccountPanelLayout);
        myAccountPanelLayout.setHorizontalGroup(
            myAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );
        myAccountPanelLayout.setVerticalGroup(
            myAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myAccountPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(myAccountPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, 40));

        returnbookViewPanel.setBackground(new java.awt.Color(42, 53, 66));

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

        javax.swing.GroupLayout returnbookViewPanelLayout = new javax.swing.GroupLayout(returnbookViewPanel);
        returnbookViewPanel.setLayout(returnbookViewPanelLayout);
        returnbookViewPanelLayout.setHorizontalGroup(
            returnbookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnbookViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        returnbookViewPanelLayout.setVerticalGroup(
            returnbookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(returnbookViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        overduebookViewPanel.setBackground(new java.awt.Color(42, 53, 66));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/overduelist.png"))); // NOI18N
        jLabel11.setText("  Overdue Books View");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout overduebookViewPanelLayout = new javax.swing.GroupLayout(overduebookViewPanel);
        overduebookViewPanel.setLayout(overduebookViewPanelLayout);
        overduebookViewPanelLayout.setHorizontalGroup(
            overduebookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overduebookViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );
        overduebookViewPanelLayout.setVerticalGroup(
            overduebookViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(overduebookViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

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
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1197, 2, 90, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minus.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library.png"))); // NOI18N
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LIBRARY MANAGEMENT");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 50));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel11.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 190, 30));

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

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jPanel4.setBackground(new java.awt.Color(0, 255, 51));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Book Categories");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bookCategoris.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        bookCategoris.setForeground(new java.awt.Color(255, 153, 0));
        bookCategoris.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookCategoris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookCategoris, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 200, 100));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Borrow Books");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        borrowbooks.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        borrowbooks.setForeground(new java.awt.Color(255, 255, 255));
        borrowbooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrowbooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowbooks, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 200, -1));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 255, 255));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Overdue");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        overdue.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        overdue.setForeground(new java.awt.Color(255, 0, 204));
        overdue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overdue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdue, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 200, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void managebookjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managebookjLabelMouseClicked

        userBorrowBook.setVisible(true);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(selectionColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(primaryColor);
        userBorrowBook.refresh();
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
        this.setExtendedState(UserDashboard.ICONIFIED);
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
        this.setExtendedState(UserDashboard.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(true);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(selectionColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(primaryColor);
        userReturnBook.refresh();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(true);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(selectionColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(primaryColor);
        userOverdueReturn.refresh();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(true);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(selectionColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(primaryColor);
        viewAnnouncement.refresh();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(true);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(selectionColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(primaryColor);
        myAccount.clear();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(true);
        userOverdueBookView.setVisible(false);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(selectionColor);
        overduebookViewPanel.setBackground(primaryColor);
        userReturnBook.refresh();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        userBorrowBook.setVisible(false);
        userReturnBook.setVisible(false);
        userOverdueReturn.setVisible(false);
        viewAnnouncement.setVisible(false);
        myAccount.setVisible(false);
        userReturnBookView.setVisible(false);
        userOverdueBookView.setVisible(true);
        borrowbookPanel.setBackground(primaryColor);
        returnbookPanel.setBackground(primaryColor);
        overdueReturnPanel.setBackground(primaryColor);
        viewAnnouncementPanel.setBackground(primaryColor);
        myAccountPanel.setBackground(primaryColor);
        returnbookViewPanel.setBackground(primaryColor);
        overduebookViewPanel.setBackground(selectionColor);
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel bookCategoris;
    private javax.swing.JPanel borrowbookPanel;
    public static javax.swing.JLabel borrowbooks;
    private javax.swing.JPanel componentPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel managebookjLabel;
    private javax.swing.JPanel myAccountPanel;
    public static javax.swing.JLabel overdue;
    private javax.swing.JPanel overdueReturnPanel;
    private javax.swing.JPanel overduebookViewPanel;
    private javax.swing.JPanel returnbookPanel;
    private javax.swing.JPanel returnbookViewPanel;
    public static javax.swing.JLabel username;
    private javax.swing.JPanel viewAnnouncementPanel;
    // End of variables declaration//GEN-END:variables
}
