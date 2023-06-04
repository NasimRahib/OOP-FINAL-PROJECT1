package daoClass;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Book {

    public void bookManage(String op,int id, String book, String author, int qty) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (op == "insert") {
            String sql = "INSERT INTO book VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setString(2, book);
                ps.setString(3, author);
                ps.setInt(4, qty);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "update") {
           try {
                ps = con.prepareStatement("UPDATE book SET book_name = ?, author = ?, quantity = ? WHERE book_id = ?");
                ps.setString(1, book);
                ps.setString(2, author);
                ps.setInt(3, qty);
                ps.setInt(4, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book Update");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "All the data about this book will also be deleted", "Delete Book", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    ps = con.prepareStatement("DELETE FROM book WHERE book_id = ?");
                    ps.setInt(1, id);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Book Deleted");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void getBookTableValue(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT * FROM book WHERE CONCAT (book_id,book_name,author)LIKE ? order by book_id desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getId() {
        int id = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(book_id) from book");
            while (rs.next()) {
                id= rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id +1;
    }
}
