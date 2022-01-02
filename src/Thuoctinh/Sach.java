package Thuoctinh;

import java.util.Scanner;

public abstract class Sach {
   String masach,tensach,tacgia;
   String soluong,giaban;
    public Sach() {
        this.masach = "";
        this.tensach = "";
        this.tacgia = "";
        this.soluong ="";
        this.giaban = "";
    }
    
    public Sach(String masach,  String tensach, String tacgia, String soluong,String giaban) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.soluong = soluong;
        this.giaban = giaban;
    }

      public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }
    public String getTensach() {
        return tensach;
    }

    public void setTenNguoiMuon(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
    public void setGiaban(String giaban){
        this.giaban = giaban;
    }
    public String getGiaban(){
        return giaban;
    }
    public abstract void nhap();
    public abstract void xuat();

}