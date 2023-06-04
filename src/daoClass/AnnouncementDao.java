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

public class AnnouncementDao {

    public void manageAnnouncement(String op, int id, String view, String message, String status) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (op == "insert") {
            String sql = "INSERT INTO announcement(id,view,message,status) VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setString(2, view);
                ps.setString(3, message);
                ps.setString(4, status);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Announcement Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "update") {
            try {
                ps = con.prepareStatement("UPDATE announcement SET view = ?, message = ? WHERE id = ?");
                ps.setString(1, view);
                ps.setString(2, message);
                ps.setInt(3, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Data Updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "delete") {
            try {
                ps = con.prepareStatement("DELETE FROM announcement WHERE id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Data Deleted");
                }

            } catch (SQLException ex) {
                Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getId() {
        int id = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(id) from announcement");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;

    }

    public void getMessageTableValue(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT * FROM announcement WHERE CONCAT (id ,view,message,status)LIKE ? order by id desc";
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
                row[3] = rs.getString(4);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // all the bellow part only for user
    public void getUserMessageTableValue(JTable table, String valueToSearch, String id) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT message FROM announcement WHERE CONCAT (message)LIKE ? and view ='" + id + "' or view = 'all' order by id desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[1];
                row[0] = rs.getString(1);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void seenMessage(String id) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("UPDATE announcement SET status = ? WHERE view = ?");
            ps.setString(1, "Read");
            ps.setString(2, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thanks for read the message");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnnouncementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
