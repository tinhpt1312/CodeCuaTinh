/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import EnTiTy.SANBANH;

/**
 *
 * @author Tinh
 */
public class DAONE {
    public void insert(SANBANH sb){
        try(Connection con = DAO.openConnection();){
            String sql = "insert into SANBANH values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sb.getTenDoi());
            st.setString(2, sb.getLoaiSan());
            st.setString(3, sb.getNgay());
            st.setString(4,sb.getSDT());
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void delete(SANBANH sb){
        try(Connection con = DAO.openConnection();){
            String sql = "delete from SANBANH where TenDoi = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sb.getTenDoi());
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void update(SANBANH sb){
        try(Connection con = DAO.openConnection();){
            String sql = "update SANBANH set LoaiSan = ?, SDT = ?, Ngay = ? where TenDoi = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, sb.getLoaiSan());
            st.setString(2,sb.getSDT());
            st.setString(3,sb.getNgay());
            st.setString(4, sb.getTenDoi());
            st.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
