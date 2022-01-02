package Thuoctinh;

import java.util.Scanner;

public class Tailieu extends Sach{
       String linhvuc;
    public Tailieu(){
        super();
        this.linhvuc = "";
    }
    public Tailieu(String masach,  String tensach, String tacgia, String soluong,String giaban, String linhvuc){
        super(masach,tensach,tacgia,soluong,giaban);
        this.linhvuc = linhvuc;
    }
    public void setLinhvuc(String linhvuc){
        this.linhvuc = linhvuc;
    }
    public String getLinhvuc(){
        return linhvuc;
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
        System.out.print("Nhập lĩnh vực: ");
        linhvuc = sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s |\n",
                getMasach(),
                getTensach(),
                getTacgia(),
                getSoluong(),
                getGiaban(),
                getLinhvuc()); 
    }
        @Override
    public String toString(){
        return masach + "\t" + tensach + "\t" +tacgia + "\t" + soluong + "\t" +giaban + "\t" +linhvuc;
    } 
}
