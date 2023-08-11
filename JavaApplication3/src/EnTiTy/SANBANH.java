/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnTiTy;

/**
 *
 * @author Tinh
 */
public class SANBANH {
    String TenDoi, LoaiSan, Ngay, SDT;
    int Tien;

    public SANBANH() {
    }

    public SANBANH(String TenDoi, String LoaiSan, String Ngay, String SDT, int Tien) {
        this.TenDoi = TenDoi;
        this.LoaiSan = LoaiSan;
        this.Ngay = Ngay;
        this.SDT = SDT;
        this.Tien = Tien;
    }

    public String getTenDoi() {
        return TenDoi;
    }

    public void setTenDoi(String TenDoi) {
        this.TenDoi = TenDoi;
    }

    public String getLoaiSan() {
        return LoaiSan;
    }

    public void setLoaiSan(String LoaiSan) {
        this.LoaiSan = LoaiSan;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getTien() {
        return Tien;
    }

    public void setTien(int Tien) {
        this.Tien = Tien;
    }
    
    
    
}
