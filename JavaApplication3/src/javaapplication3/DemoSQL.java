/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tinh
 */
public class DemoSQL {
    public static void main(String[] args) {
        try{
            //1. Nạp driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Loaded ...");
            
            //2. Định nghĩa  Connection URL
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EMPDB";
            String user="sa";
            String password="123";
            
            //3. Kết nối CSDL bằng đối tượng Connection
            Connection con = DriverManager.getConnection(connectionUrl, user, password);
            System.out.println("Connected ...");
            
            //4. Tạo đối tượng Statement
            Statement stm = con.createStatement();
            
            //5. Thi hành câu truy vấn
            String sql = "Select * from Employee";
            ResultSet rs = stm.executeQuery(sql);
            
            //6. Xử lý kết quả trả về
            while(rs.next()){
                int id = rs.getInt("id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                int age = rs.getInt(4);
                
                System.out.print("ID: "+id);
                System.out.println("first: "+first);
                System.out.println("last: "+last);
                System.out.println("age "+age);
            }
            //7. Đóng kết nối
            rs.close();
            stm.close();
            con.close();            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
