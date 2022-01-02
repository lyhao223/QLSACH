package Danhsach;

import Thuoctinh.Hoadon;
import Chuongtrinh.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHoadon {
    QLDanhsach ql = new QLDanhsach();
    Scanner sc = new Scanner(System.in);
     public void menu() throws IOException  {
        do {
            System.out.println();
            System.out.println("            QUẢN LÝ KHÁCH HÀNG");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Thêm hoá đơn.                    |");
            System.out.println("|   2. Sửa thông tin.                   |");
            System.out.println("|   3. Xóa hoá đơn.                     |");
            System.out.println("|   4. Xem danh sách.                   |");
            System.out.println("|   5. Tìm kiếm.                        |");
            System.out.println("|   6. Ghi File.                        |");
            System.out.println("|   7. Đọc File.                        |");
            System.out.println("|   8. Quay trở lại.                    |");
            System.out.println("|   9. Thoát.                           |");
            System.out.println("-----------------------------------------");
            System.out.print("Mời chọn chức năng: ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    xemDanhSach();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    ghi();
                case 7:
                    doc();
                case 8:
                   main.menu();
                case 9:
                    System.exit(0);
                    break;
            }

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ HOÁ ĐƠN------------------\n");
        } while (true);
    }
     
      public void them(){
          System.out.println("Nhập số lượng hoá đơn cần nhập:");          
          int n;
          n=Integer.parseInt(sc.nextLine());
          for(int i=0;i<n;i++){             
              Hoadon hdd = new Hoadon();
                  hdd.nhap();
                  ql.hd.add(hdd);
              }
                  
          }

      public void sua(){
          System.out.println("Nhập mã hoá đơn: ");
          String str = sc.nextLine();
          for(int i=0;i<ql.hd.size();i++){
              if(str.compareTo(ql.hd.get(i).getmaHoaDon())==0){
                  ql.hd.get(i).nhap();
                  System.out.println("Sửa thành công");
              }else{
                  System.out.println("Không tìm thấy hoá đơn");
                  break;
              }
          }
          
      }
      
      public void xoa(){
          
          System.out.println("Nhập mã hoá đơn: ");
          String str = sc.nextLine();
          for(int i=0;i<ql.hd.size();i++){
              if(str.compareTo(ql.hd.get(i).getmaHoaDon())==0){
                  ql.hd.remove(i);
                  System.out.println("Xóa thành công");
              }else{
                  System.out.println("Không tìm thấy hoá đơn");
              }
          }
      }
      
      public void xemDanhSach(){
          System.out.println("Dánh sách hoá đơn: ");
          System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s| %-15s| \n\n",
                "Mã hoá đơn",
                "Tên khách hàng ",
                "Số lượng",
                "Tên Sách",
                "Tổng tiền",
                "Ngày bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
          for(int i=0;i<ql.hd.size();i++){
              ql.hd.get(i).xuat();
          }
          
      }
      
      public void timKiem(){
          String str = sc.nextLine();
          for(int i=0;i<ql.hd.size();i++){
              if(str.compareTo(ql.hd.get(i).getmaHoaDon())==0){
                  System.out.println("Hoá đơn đã tìm thấy: ");
                  System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s| %-15s|\n\n",
                "Mã hoá đơn",
                "Tên khách hàng ",
                "Số lượng",
                "Tên Sách",
                "Tổng tiền",
                "Ngày bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                  ql.hd.get(i).xuat();
              }else{
                  System.out.println("Không tìm thấy hoá đơn");
              }
          }
      }
      
      public void ghi() throws IOException{
          try {
              FileWriter f = new FileWriter("hoadon.txt");
              BufferedWriter b = new BufferedWriter(f);
              for(Hoadon i : ql.hd){
                  b.write(i.toString());
                  b.newLine();
              }
              b.close();
              f.close();
          } catch (Exception e) {
          }
      }
      
      public void doc(){
         try {
              FileReader f = new FileReader("hoadon.txt");
              BufferedReader b = new BufferedReader(f);
              String line = "";
              while(true){
                  line = b.readLine();
                  if(line == null){
                      break;
                  }                  
                  System.out.println(line);
              }
          } catch (Exception e) {
          }
      }
}


