/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.STUDENTS;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Tinh
 */
public class StudentsDAO {

    public void insert(STUDENTS sv) {
        try (Connection con = KetNoiCSDL.openConnection();) {
            String sql = "insert into STUDENTS values(?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sv.getMaSV());
            st.setString(2, sv.getHoTen());
            st.setString(3, sv.geteMail());
            st.setString(4, sv.getSoDT());
            st.setInt(5, sv.getGioiTinh());
            st.setString(6, sv.getDiaChi());
            st.setString(7, sv.getHinh());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete(STUDENTS sv) {
        try (Connection con = KetNoiCSDL.openConnection();) {
            String sql = "delete from STUDENTS where MaSV = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sv.getMaSV());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void update(STUDENTS sv) {
        try (Connection con = KetNoiCSDL.openConnection();) {
            String sql = "update STUDENTS set hoten=?, email=?, sodt=?, gioitinh=?, diachi=?, hinh=? where masv=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sv.getHoTen());
            st.setString(2, sv.geteMail());
            st.setString(3,sv.getSoDT());
            st.setInt(4, sv.getGioiTinh());
            st.setString(5, sv.getDiaChi());
            st.setString(6, sv.getHinh());
            st.setString(7, sv.getMaSV());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
