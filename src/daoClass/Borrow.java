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

public class Borrow {

    public void borrowBook(int borrowId, int bookId, String bookName, int userId,
            String issueDate, String dueDate, String status) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO borrowbook VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, borrowId);
            ps.setInt(2, bookId);
            ps.setString(3, bookName);
            ps.setInt(4, userId);
            ps.setString(5, issueDate);
            ps.setString(6, dueDate);
            ps.setString(7, status);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Book Borrowed Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateQty(int qty, int bookId) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE book SET quantity = ? WHERE book_id = ?");
            ps.setInt(1, qty);
            ps.setInt(2, bookId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        int id = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(borrow_id) from borrowbook");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;

    }

    public boolean isUserIdNotExist(int id) {
        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE user_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }

    public boolean allredyBorrowing(int bookId, int userId, String status) {
        boolean isBorrow = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM borrowbook WHERE book_id = ? and user_id = ? and status = ?");
            ps.setInt(1, bookId);
            ps.setInt(2, userId);
            ps.setString(3, status);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isBorrow = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Borrow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isBorrow;
    }
}
