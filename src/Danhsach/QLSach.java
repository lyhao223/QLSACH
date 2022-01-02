package Danhsach;

import Thuoctinh.Sach;
import Chuongtrinh.main;
import Thuoctinh.SGK;
import Thuoctinh.Tailieu;
import Thuoctinh.Truyentranh;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.constant.ConstantDescs.NULL;
import java.util.ArrayList;
import java.util.Scanner;

public class QLSach {
    QLDanhsach ql = new QLDanhsach();
    Scanner sc = new Scanner(System.in);
     public void menu() throws IOException  {
        do {
            System.out.println();
            System.out.println("              QUẢN LÝ SÁCH               ");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Thêm sách.                       |");
            System.out.println("|   2. Sửa thông tin.                   |");
            System.out.println("|   3. Xóa sách                         |");
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

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ SÁCH------------------\n");
        } while (true);
    }
     
      public void them(){
          System.out.println("Nhập số lượng sách cần nhập:");          
          int n;
          n=Integer.parseInt(sc.nextLine());
          
          for(int i=0;i<n;i++){ 
              System.out.print("nhập 1 để thêm SGK - 2 để thêm truyện tranh - 3 để thêm tài liệu ");
              int chon;
              chon=Integer.parseInt(sc.nextLine());
              switch(chon){
                  case 1:
                      Sach a = new SGK();
                      a.nhap();
                      ql.sgk.add((SGK) a);
                      ql.s.add((SGK) a);
                      break;
                  case 2:
                      Sach b = new Truyentranh();
                      b.nhap();
                      ql.tr.add((Truyentranh) b);
                      ql.s.add((Truyentranh) b);
                      break;
                  case 3:
                      Sach c = new Tailieu();
                      c.nhap();
                      ql.tl.add((Tailieu) c);
                      ql.s.add((Tailieu) c);
                      break;
              }
              }     
          }

      public void sua(){
          
           
              System.out.print("nhập 1 để thêm SGK - 2 để thêm truyện tranh - 3 để thêm tài liệu ");
              int chon;
              chon=Integer.parseInt(sc.nextLine());
              switch(chon){
                  case 1:
                      System.out.println("Nhập mã SGK: ");
                      String str = sc.nextLine();
                        for(int k=0;k<ql.sgk.size();k++){
                            if(str.compareTo(ql.sgk.get(k).getMasach())==0){
                                    ql.sgk.get(k).nhap();
                                    System.out.println("Sửa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
                      break;
                  case 2:
                      System.out.println("Nhập mã Truyện tranh: ");
                      String str2 = sc.nextLine();
                        for(int k=0;k<ql.tr.size();k++){
                            if(str2.compareTo(ql.tr.get(k).getMasach())==0){
                                    ql.tr.get(k).nhap();
                                    System.out.println("Sửa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
                        break;
                  case 3:
                      System.out.println("Nhập mã tài liệu: ");
                      String str3 = sc.nextLine();
                        for(int k=0;k<ql.tl.size();k++){
                            if(str3.compareTo(ql.tl.get(k).getMasach())==0){
                                    ql.tl.get(k).nhap();
                                    System.out.println("Sửa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
                        break;
              }
             
      }
      
      public void xoa(){
            
              System.out.print("nhập 1 để thêm SGK - 2 để thêm truyện tranh - 3 để thêm tài liệu ");
              int chon;
              chon=Integer.parseInt(sc.nextLine());
              switch(chon){
                  case 1:
                      System.out.println("Nhập mã SGK: ");
                      String str = sc.nextLine();
                        for(int k=0;k<ql.sgk.size();k++){
                            if(str.compareTo(ql.sgk.get(k).getMasach())==0){
                                    ql.sgk.remove(k);
                                    ql.s.remove(k);
                                    System.out.println("Xóa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
                      break;
                  case 2:
                      System.out.println("Nhập mã Truyện tranh: ");
                      String str2 = sc.nextLine();
                        for(int j=0;j<ql.tr.size();j++){
                            if(str2.compareTo(ql.tr.get(j).getMasach())==0){
                                    ql.tr.remove(j);
                                    ql.s.remove(j);
                                    System.out.println("Xóa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
                        break;
                  case 3:
                      System.out.println("Nhập mã tài liệu: ");
                      String str3 = sc.nextLine();
                        for(int o=0;o<ql.tl.size();o++){
                            if(str3.compareTo(ql.tl.get(o).getMasach())==0){
                                   ql.tl.remove(o);
                                   ql.s.remove(o);
                                    System.out.println("Xóa thành công");
                                }else{
                                    System.out.println("Không tìm thấy");
                                    break;
                                }
                 }
              }                     
      }
      
      public void xemDanhSach(){
          System.out.println("Danh sách sách: ");
          System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s |\n\n",
                "Mã sách",
                "Tên sách",
                "Tác giả",
                "Số lượng",
                "Giá bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
          for(int i=0;i<ql.sgk.size();i++){                             
                      ql.sgk.get(i).xuat();                     
                  }
          for(int k=0;k<ql.tr.size();k++){
              ql.tr.get(k).xuat();
          }
          for(int j=0;j<ql.tl.size();j++){
              ql.tl.get(j).xuat();
          }
          

              }
              
           
 
      
      public void timKiem(){
          System.out.print("nhập 1 để thêm SGK - 2 để thêm truyện tranh - 3 để thêm tài liệu ");
              int chon;
              chon=Integer.parseInt(sc.nextLine());
              switch(chon){
                  case 1:
                      System.out.println("Nhập mã SGK: ");
                      String str = sc.nextLine();
                        for(int i=0;i<ql.sgk.size();i++){
                        if(str.compareTo(ql.sgk.get(i).getMasach())==0){
                        System.out.println("Sách đã tìm thấy: ");
                        System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s |\n\n",
                             "Mã sách",
                             "Tên sách ",
                             "Tác giả",
                             "Số lượng",
                             "Giá bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                  ql.sgk.get(i).xuat();
              }else{
                  System.out.println("Không tìm thấy sách");
              }
          }
                      break;
                  case 2:
                      System.out.println("Nhập mã truyện tranh: ");
                       String str2 = sc.nextLine();
                        for(int i=0;i<ql.tr.size();i++){
                        if(str2.compareTo(ql.tr.get(i).getMasach())==0){
                        System.out.println("Sách đã tìm thấy: ");
                        System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s |\n\n",
                             "Mã sách",
                             "Tên sách ",
                             "Tác giả",
                             "Số lượng",
                             "Giá bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                  ql.tr.get(i).xuat();
              }else{
                  System.out.println("Không tìm thấy sách");
              }
          } 
                        break;
                  case 3:
                      System.out.println("Nhập mã tài liệu: ");
                      String str3 = sc.nextLine();
                        for(int i=0;i<ql.tr.size();i++){
                        if(str3.compareTo(ql.tl.get(i).getMasach())==0){
                        System.out.println("Sách đã tìm thấy: ");
                        System.out.printf("%-15s | %-15s | %-15S | %-15s| %-15s |\n\n",
                             "Mã sách",
                             "Tên sách ",
                             "Tác giả",
                             "Số lượng",
                             "Giá bán");
               
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                  ql.tl.get(i).xuat();
              }else{
                  System.out.println("Không tìm thấy sách");
              }
          } 
                        break;
          
      }
      }
      
      public void ghi() throws IOException{
          try {
              FileWriter f = new FileWriter("sach.txt");
              BufferedWriter b = new BufferedWriter(f);
              for(SGK i : ql.sgk){
                  b.write(i.toString());
                  b.newLine();
              }
              for(Truyentranh k : ql.tr){
                  b.write(k.toString());
                  b.newLine();
              }
              for(Tailieu o : ql.tl){
                  b.write(o.toString());
                  b.newLine();
              }
              b.close();
              f.close();
          } catch (Exception e) {
          }
    }
      
     public void doc(){
         try {
              FileReader f = new FileReader("sach.txt");
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
