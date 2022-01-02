package Thuoctinh;

import java.util.Scanner;

public class Truyentranh extends Sach{
        String theloai;
    public Truyentranh(){
        super();
        this.theloai = "";
    }
    public Truyentranh(String masach,  String tensach, String tacgia, String soluong,String giaban, String theloai){
        super(masach,tensach,tacgia,soluong,giaban);
        this.theloai = theloai;
    }
    public void setTheloai(String theloai){
        this.theloai = theloai;
    }
    public String getTheloai(){
        return theloai;
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        masach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tensach = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        tacgia = sc.nextLine();
        System.out.print("Nhập số lượng: ");
        soluong = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        giaban = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        theloai = sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s |\n",
                getMasach(),
                getTensach(),
                getTacgia(),
                getSoluong(),
                getGiaban(),
                getTheloai()); 
    }
        @Override
    public String toString(){
        return masach + "\t" + tensach + "\t" +tacgia + "\t" + soluong + "\t" +giaban + "\t" +theloai;
    }
}
