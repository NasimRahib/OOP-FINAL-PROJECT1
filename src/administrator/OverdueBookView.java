package administrator;
import daoClass.Overdue;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class OverdueBookView extends javax.swing.JPanel {

    DefaultTableModel model;
    Overdue over = new Overdue();
   
    public OverdueBookView() {
        initComponents();
        tableView();
    }

   public void tableView() {
        over.viewReturnBook(overdueBookViewTable);
        model = (DefaultTableModel) overdueBookViewTable.getModel();
        overdueBookViewTable.setRowHeight(30);
        overdueBookViewTable.setShowGrid(true);
        overdueBookViewTable.setGridColor(Color.black);
        overdueBookViewTable.setBackground(Color.white);
        overdueBookViewTable.setSelectionBackground(Color.gray);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        overdueBookViewTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(114, 208, 235));

        overdueBookViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Phone", "University ID", "Degree Program", "Address", "Book ID", "Book Name", "Issue Date", "Due Date", "Return Date", "Fine", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        overdueBookViewTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(overdueBookViewTable);
        if (overdueBookViewTable.getColumnModel().getColumnCount() > 0) {
            overdueBookViewTable.getColumnModel().getColumn(1).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    public void refresh(){
        overdueBookViewTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Email","Phone","University ID","Degree Program","Address","Book Id","Book Name", "Issue Date", "Due Date","Return Date", "Status"}));
        over.viewReturnBook(overdueBookViewTable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable overdueBookViewTable;
    // End of variables declaration//GEN-END:variables
}
