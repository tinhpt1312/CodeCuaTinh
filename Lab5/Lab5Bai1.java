/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Tinh
 */
public class Lab5Bai1 { 
    public static void main(String[] args) {
        try{
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhvien;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from STUDENTS";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getString("MaSV") +", ");
                System.out.print(rs.getString("HoTen") +", ");
                System.out.print(rs.getString("Email") +", ");
                System.out.print(rs.getString("SoDT") +", ");
                System.out.println(rs.getString("GioiTinh"));
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
