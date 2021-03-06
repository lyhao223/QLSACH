package Danhsach;

import Thuoctinh.Khachhang;
import Chuongtrinh.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QLKhachhang {
    QLDanhsach ql = new QLDanhsach();
    Scanner sc = new Scanner(System.in);
     public void menu() throws IOException  {
        do {
            System.out.println();
            System.out.println("            QUẢN LÝ KHÁCH HÀNG");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Thêm khách hàng.                 |");
            System.out.println("|   2. Sửa thông tin.                   |");
            System.out.println("|   3. Xóa người khách hàng.            |");
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

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ NGƯỜI MƯỢN------------------\n");
        } while (true);
    }
     
      public void them(){
          System.out.println("Nhập số lượng khách hàng cần nhập:");          
          int n;
          n=Integer.parseInt(sc.nextLine());
          for(int i=0;i<n;i++){             
              Khachhang khk = new Khachhang();
                  khk.nhap();
                  ql.kh.add(khk);
              }
                  
          }

      public void sua(){
          System.out.println("Nhập mã khách hàng: ");
          String str = sc.nextLine();
          for(int i=0;i<ql.kh.size();i++){
              if(str.compareTo(ql.kh.get(i).getmaNguoiMuon())==0){
                  ql.kh.get(i).nhap();
                  System.out.println("Sửa thành công");
              }else{
                  System.out.println("Không tìm thấy khách hàng");
                  break;
              }
          }
          
      }
      
      public void xoa(){
          
          System.out.println("Nhập mã khách hàng: ");
          String str = sc.nextLine();
          for(int i=0;i<ql.kh.size();i++){
              if(str.compareTo(ql.kh.get(i).getmaNguoiMuon())==0){
                  ql.kh.remove(i);
                  System.out.println("Xóa thành công");
              }else{
                  System.out.println("Không tìm thấy khách hàng");
              }
          }
      }
      
      public void xemDanhSach(){
          System.out.println("Dánh sách khách hàng: ");
          System.out.printf("%-15s | %-15s | %-15S | %-15s|\n\n",
                "Mã khách hàng",
                "Tên khách hàng ",
                "Địa chỉ",
                "Số điện thoại");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
          for(int i=0;i<ql.kh.size();i++){
              ql.kh.get(i).xuat();
          }
          
      }
      
      public void timKiem(){
          String str = sc.nextLine();
          for(int i=0;i<ql.kh.size();i++){
              if(str.compareTo(ql.kh.get(i).getmaNguoiMuon())==0){
                  System.out.println("Khách hàng đã tìm thấy: ");
                  System.out.printf("%-15s | %-15s | %-15S | %-15s|\n\n",
                "Mã khách hàng",
                "Tên khách hàng ",
                "Địa chỉ",
                "Số điện thoại");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                  ql.kh.get(i).xuat();
              }else{
                  System.out.println("Không tìm thấy khách hàng");
              }
          }
      }
      
      public void ghi() throws IOException{
          try {
              FileWriter f = new FileWriter("khachhang.txt");
              BufferedWriter b = new BufferedWriter(f);
              for(Khachhang i : ql.kh){
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
              FileReader f = new FileReader("khachhang.txt");
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
