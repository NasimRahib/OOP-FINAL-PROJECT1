package administrator;
import daoClass.Return;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class ReturnBookView extends javax.swing.JPanel {

    DefaultTableModel model;
    Return ret = new Return();
   
    public ReturnBookView() {
        initComponents();
        tableView();
    }

   public void tableView() {
        ret.viewReturnBook(returnBookViewTable);
        model = (DefaultTableModel) returnBookViewTable.getModel();
        returnBookViewTable.setRowHeight(30);
        returnBookViewTable.setShowGrid(true);
        returnBookViewTable.setGridColor(Color.black);
        returnBookViewTable.setBackground(Color.white);
        returnBookViewTable.setSelectionBackground(Color.gray);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnBookViewTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(114, 208, 235));

        returnBookViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Phone", "University ID", "Degree Program", "Address", "Book ID", "Book Name", "Issue Date", "Due Date", "Return Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnBookViewTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        returnBookViewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookViewTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(returnBookViewTable);
        if (returnBookViewTable.getColumnModel().getColumnCount() > 0) {
            returnBookViewTable.getColumnModel().getColumn(1).setMinWidth(100);
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

    private void returnBookViewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookViewTableMouseClicked
      
    }//GEN-LAST:event_returnBookViewTableMouseClicked

    public void refresh(){
        returnBookViewTable.setModel(new DefaultTableModel(null, new Object[]{"ID","Name","Email","Phone","University ID","Degree Program","Address","Book Id","Book Name", "Issue Date", "Due Date","Return Date", "Status"}));
        ret.viewReturnBook(returnBookViewTable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable returnBookViewTable;
    // End of variables declaration//GEN-END:variables
}
