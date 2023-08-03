/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.USERS;
import GUI.FormTong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tinh
 */
public class LoginDAO1 {

    public boolean Login(USERS us) {
        FormTong form = new FormTong();
        try (Connection con = KetNoiCSDL.openConnection();) {
            String sql = "select * from USERS where username=? and password=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, us.getUserName());
            stm.setString(2, us.getPassword());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                if (rs.getString("role").equals("can bo dao tao")) {
                    form.setVisible(true);
                    //lbSinhvien.setEnabled(false);
                    form.khoaDiem();

                } else if (rs.getString("role").equals("giang vien")) {
                    form.setVisible(true);
                    form.khoaSinhvien();

                }
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu sai");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
