/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Tinh
 */
public class QLCD {
    private String CD, TieuDe, LoaiDia;
    private int NamXB;

    public QLCD() {
    }

    public QLCD(String CD, String TieuDe, String LoaiDia, int NamXB) {
        this.CD = CD;
        this.TieuDe = TieuDe;
        this.LoaiDia = LoaiDia;
        this.NamXB = NamXB;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getLoaiDia() {
        return LoaiDia;
    }

    public void setLoaiDia(String LoaiDia) {
        this.LoaiDia = LoaiDia;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }
    
    
}
