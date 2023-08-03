/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.USERS;
import GUI.QLSV;
import GUI.quanlyDiem;
import GUI.Login;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tinh
 */
public class LoginDAO {

    public void Login(USERS us) {
        try (Connection con = KetNoiCSDL.openConnection();) {
            String sql = "select * from USERS where username=? and password=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, us.getUserName());
            stm.setString(2, us.getPassword());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                if (rs.getString("role").equals("can bo dao tao")) {
                    QLSV form1 = new QLSV();
                    form1.setVisible(true);
                } else if (rs.getString("role").equals("giang vien")) {
                    quanlyDiem form2 = new quanlyDiem();
                    form2.setVisible(true);
                }
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu sai");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
