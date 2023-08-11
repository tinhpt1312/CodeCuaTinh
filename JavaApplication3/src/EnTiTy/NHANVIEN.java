/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnTiTy;

/**
 *
 * @author Tinh
 */
public class NHANVIEN {
    String MaNV, HoTen, SoDT;
    int NgayCong;

    public NHANVIEN() {
    }

    public NHANVIEN(String MaNV, String HoTen, String SoDT, int NgayCong) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.SoDT = SoDT;
        this.NgayCong = NgayCong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public int getNgayCong() {
        return NgayCong;
    }

    public void setNgayCong(int NgayCong) {
        this.NgayCong = NgayCong;
    }
    
    public int getLuong(){
        return NgayCong*150;
    }
}
