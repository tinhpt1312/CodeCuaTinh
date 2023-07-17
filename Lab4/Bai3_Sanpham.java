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
public class Bai3_Sanpham {
    String tenSp;
    double donGia;
    double giamGia;

    public Bai3_Sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    void nhapsp(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Ten san pham: ");
        tenSp = s.nextLine();
        s.nextLine();
        System.out.printf("Gia san pham: ");
        donGia = s.nextDouble();
        System.out.printf("Mã giam giá: ");
        giamGia = s.nextDouble();
    }
    void xuat(){
        System.out.println("tên Sp: " + tenSp);
        System.out.println("Gia: " + donGia);
        System.out.println("Sale off: " + giamGia);
    }
    public Bai3_Sanpham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    
}
