package Thuoctinh;

import java.util.Scanner;

public class SGK extends Sach{
    String monhoc;
    public SGK(){
        super();
        this.monhoc = "";
    }
    public SGK(String masach,  String tensach, String tacgia, String soluong,String giaban, String monhoc){
        super(masach,tensach,tacgia,soluong,giaban);
        this.monhoc = monhoc;
    }
    public void setMonhoc(String monhoc){
        this.monhoc = monhoc;
    }
    public String getMonhoc(){
        return monhoc;
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
        System.out.print("Nhập môn học: ");
        monhoc = sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s |\n",
                getMasach(),
                getTensach(),
                getTacgia(),
                getSoluong(),
                getGiaban(),
                getMonhoc()); 
    }
        @Override
    public String toString(){
        return masach + "\t" + tensach + "\t" +tacgia + "\t" + soluong + "\t" +giaban + "\t" +monhoc;
    }
}
