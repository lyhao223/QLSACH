package Thuoctinh;

import java.util.Scanner;

public class Khachhang {
   private String maNguoiMuon, tenNguoiMuon,  diaChi, soDienThoai;
    public Khachhang() {
        this.maNguoiMuon = "";
        this.tenNguoiMuon = "";
        this.diaChi = "";
        this.soDienThoai = "";
    }
    
    public Khachhang(String maNguoiMuon,  String tenNguoiMuon, String diaChi, String soDienThoai) {
        this.maNguoiMuon = maNguoiMuon;
        this.tenNguoiMuon = tenNguoiMuon;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

      public String getmaNguoiMuon() {
        return maNguoiMuon;
    }

    public void setmaNguoiMuon(String maNguoiMuon) {
        this.maNguoiMuon = maNguoiMuon;
    }
    
    public String getTenNguoiMuon() {
        return tenNguoiMuon;
    }

    public void setTenNguoiMuon(String tenNguoiMuon) {
        this.tenNguoiMuon = tenNguoiMuon;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

   
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        maNguoiMuon = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        tenNguoiMuon = sc.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập SĐT khách hàng: ");
        soDienThoai = sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("%-15s | %-15s | %-15S | %-15s |\n",
                getmaNguoiMuon(),
                getTenNguoiMuon(),
                getSoDienThoai(),
                getDiaChi());             
    }
    
    @Override
    public String toString(){
        return maNguoiMuon + "\t" + tenNguoiMuon + "\t" +soDienThoai + "\t" + diaChi ;
    }
}
