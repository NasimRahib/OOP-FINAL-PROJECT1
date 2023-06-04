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
import user.UserDashboard;

public class User {

    public void userManage(String op, int id, String name, String email, String password, String phone,
            String uiversityId, String degree, String address, String status) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (op == "insert") {
            String sql = "INSERT INTO user VALUES (?,?,?,?,?,?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, email);
                ps.setString(4, password);
                ps.setString(5, phone);
                ps.setString(6, uiversityId);
                ps.setString(7, degree);
                ps.setString(8, address);
                ps.setString(9, status);
                if (ps.executeUpdate() > 0) {
                    if (status.equals("Approve")) {
                        JOptionPane.showMessageDialog(null, "User Added Successfully");
                    } else if (status.equals("Pending")) {
                        JOptionPane.showMessageDialog(null, "Account successfully created! Please wait for administrator approval");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "update") {
            try {
                ps = con.prepareStatement("UPDATE user SET name = ?,email = ?, password = ?,phone = ?, university_id = ?, degree_program = ?, address = ? WHERE user_id = ?");
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, phone);
                ps.setString(5, uiversityId);
                ps.setString(6, degree);
                ps.setString(7, address);
                ps.setInt(8, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "User Data Update");
                }
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Borrowing and all other information will be also deleted", "Delete User", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    ps = con.prepareStatement("DELETE FROM user WHERE user_id = ?");
                    ps.setInt(1, id);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "User Deleted");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public boolean isPhoneExist(String phone) {
        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE phone = ?");
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }

    public boolean isEmailExist(String email) {
        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }

    public void getUserTableValue(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        String sql = "SELECT * FROM user WHERE CONCAT (user_id,name,email,phone)LIKE ? and status = 'Approve' order by user_id desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getPendingValue(JTable table) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "SELECT * FROM user WHERE status = 'Pending' order by user_id desc";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[4];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(9);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getApprove(int id) {
        int choose = JOptionPane.showConfirmDialog(null, "Do you want to approve this user?", "", JOptionPane.YES_NO_OPTION, 0);
        if (choose == JOptionPane.YES_OPTION) {
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("UPDATE user SET status = 'Approve' WHERE user_id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "User successfully approved");
                }
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getId() {
        int id = 0;
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT max(user_id) from user");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;

    }

    public int getUserId(String email) {
        int id = 0;
        UserDashboard userDashboard = new UserDashboard();
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT user_id from user where email ='" + email + "'");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    public void getAllUserTableValue(JTable table) {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        String sql = "SELECT * FROM user where status = 'Approve' order by user_id desc";

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[9];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String[] getUserValue(int id) {
        String[] value = new String[7];
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String sql = "select name,email,password,phone,university_id,degree_program,address from user where user_id = " + id + "";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                value[0] = rs.getString(1);
                value[1] = rs.getString(2);
                value[2] = rs.getString(3);
                value[3] = rs.getString(4);
                value[4] = rs.getString(5);
                value[5] = rs.getString(6);
                value[6] = rs.getString(7);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

    public boolean userDelete(int id) {
        boolean x = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Borrowing and all other information will be also deleted", "Delete User", JOptionPane.OK_CANCEL_OPTION, 0);
        if (YesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("DELETE FROM user WHERE user_id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    x = true;
                    JOptionPane.showMessageDialog(null, "User Deleted");
                }

            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return x;
    }
}
