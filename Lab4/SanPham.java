/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {

    String tenSp = "sp001";
    double donGia = 10;
    double giamGia = 1;

    SanPham() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Ten san pham: ");
        tenSp = s.nextLine();
        s.nextLine();
        System.out.printf("Gia san pham: ");
        donGia = s.nextDouble();
        System.out.printf("Mã giam giá: ");
        giamGia = s.nextDouble();
    }

    public void xuat() {
        System.out.println("tên Sp: " + tenSp);
        System.out.println("Gia: " + donGia);
        System.out.println("Sale off: " + giamGia);
        System.out.println("Thue: " + thueNK());
    }

    public double thueNK() {
        double thue = 0;
        thue = 10 % donGia;
        return thue;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    void nhap(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
