package daoClass;

import connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Return {

    public void getBorrowTableValue(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String currentDate = df.format(date);
        String sql = "SELECT * FROM borrowbook WHERE CONCAT (borrow_id ,book_id,book_name,issue_date,due_date)LIKE ? and due_date > '" + currentDate + "'and status = 'Borrowing' order by borrow_id desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateQty(int bookId) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE book SET quantity = quantity + 1 WHERE book_id  = ?");
            ps.setInt(1, bookId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDate(int borrowId) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM borrowbook WHERE borrow_id = ?");
            ps.setInt(1, borrowId);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setReturnValues(int book_id, String book_name, int user_id, String issueDate, String dueDate,
            String returnDate, String status) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "INSERT INTO returnbook (book_id,book_name,user_id,issue_date,due_date,return_date,status) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, book_id);
            ps.setString(2, book_name);
            ps.setInt(3, user_id);
            ps.setString(4, issueDate);
            ps.setString(5, dueDate);
            ps.setString(6, returnDate);
            ps.setString(7, status);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Returned succeed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void viewReturnBook(JTable table) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("select u.user_id, u.name, u.email, u.phone, u.university_id, u.degree_program, u.address,r.book_id, r.book_name,r.issue_date,r.due_date,r.return_date,r.status\n"
                    + "from user as u\n"
                    + "inner join returnbook r\n"
                    + "on u.user_id=r.user_id order by book_id desc;");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[13];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getInt(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                row[10] = rs.getString(11);
                row[11] = rs.getString(12);
                row[12] = rs.getString(13);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // all the bellow part only for user

    public void getUserBorrowTableValue(JTable table, String valueToSearch, int id) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String currentDate = df.format(date);
        String sql = "SELECT borrow_id,book_id,book_name,issue_date,due_date,status FROM borrowbook WHERE CONCAT (borrow_id ,book_id,book_name,issue_date,due_date)LIKE ? and due_date > '" + currentDate + "'and status = 'Borrowing' and user_id =" + id + " order by borrow_id desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getUserReturnValue(JTable table, String valueToSearch, int id) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT * FROM returnbook WHERE user_id=" + id + "";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getUserOverdueValue(JTable table, String valueToSearch, int id) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT * FROM overduereturnbook WHERE user_id=" + id + "";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getInt(2);
                row[2] = rs.getString(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
