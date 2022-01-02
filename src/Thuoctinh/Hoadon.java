package Thuoctinh;

import Danhsach.QLDanhsach;
import Danhsach.QLSach;
import java.util.Scanner;
import static java.lang.Math.*;
public class Hoadon {
    private String maHoaDon, tenKhachHang, tenSach, ngayBan, giaBan,soLuong;
    int tien;
    QLDanhsach ql = new QLDanhsach();
    Khachhang kh = new Khachhang();
     public Hoadon(){
         this.maHoaDon = "";
         this.tenKhachHang = "";
         this.soLuong = "";
         this.tenSach = "";
         this.ngayBan = "";
         this.giaBan = "";
     }
     public Hoadon(String maHoaDon, String tenKhachHang, String soLuong, String tenSach, String ngayBan, String giaBan){
         this.maHoaDon = maHoaDon;
         this.tenKhachHang = tenKhachHang;
         this.soLuong = soLuong;
         this.tenSach = tenSach;
         this.ngayBan = ngayBan;
         this.giaBan = giaBan;
     }
     public String getmaHoaDon() {
        return maHoaDon;
    }

    public void setmaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    
    public String gettenKhachHang() {
        return tenKhachHang;
    }

    public void settenKhachHang(String tenKhachHang) {
        
        this.tenKhachHang = tenKhachHang;
    }

    public String getsoLuong() {
        return soLuong;
    }

    public void setsoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String gettenSach() {
        return tenSach;
    }

    public void settenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    
    public String getngayBan() {
        return ngayBan;
    }

    public void setngayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
    
    public String getgiaBan() {
        return giaBan;
    }

    public void setgiaBan(String giaBan) {
        this.giaBan = giaBan;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hoá đơn: ");
        maHoaDon = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        tenKhachHang = sc.nextLine();
        for(int i=0; i<ql.kh.size();i++){
            if(tenKhachHang.compareTo(ql.kh.get(i).getTenNguoiMuon())!=0){
                System.out.println("Không có tên người mượn");
                   break;
            } else{
                 System.out.print("Nhập số lượng sách: ");
                    soLuong = sc.nextLine();
                    int a = Integer.parseInt(soLuong);
                    for(int j=0;j<ql.s.size();j++){
                        if(Integer.parseInt(ql.s.get(j).getSoluong())< a){
                            System.out.println("Không đủ số lượng");   
                            break;                          
                       }
       
                    }
        }
    }
        System.out.println("Nhập tên sách");
        tenSach = sc.nextLine();
        for(int h=0;h<ql.s.size();h++){
            if(tenSach.compareTo(ql.s.get(h).getTensach())!=0){
                System.out.println("Không có tên sách này");
                break;
            }
        }
        System.out.println("Nhập ngày bán");
        ngayBan = sc.nextLine();
        System.out.println("Nhập giá bán");
        giaBan = sc.nextLine();
}
    
    public void xuat(){
        System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s |%-15s |\n",
                getmaHoaDon(),
                gettenKhachHang(),
                getsoLuong(),
                gettenSach(),
                tong(),
                getngayBan());
    }
    
    @Override
    public String toString(){
        return maHoaDon + "\t" + tenKhachHang + "\t" +soLuong + "\t" + tenSach + "\t" + ngayBan + "\t" + "\t" +tong() ;
    }
    
    public int tong(){
        tien = Integer.parseInt(giaBan)*Integer.parseInt(soLuong);
        return tien;
    }
}
