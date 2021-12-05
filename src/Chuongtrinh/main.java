/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuongtrinh;


import Danhsach.QLKhachhang;
import java.io.IOException;
import java.util.Scanner;
import Thuoctinh.Khachhang;
import Danhsach.QLKhachhang;
/**
 *
 * @author lyhao
 */
public class main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws IOException{
       menu();
    }
    
    public static void menu() throws IOException{
        QLKhachhang qlKhachhang = new QLKhachhang();
        do {
            System.out.println();
            System.out.println("            QUẢN LÝ Sách");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Quán lý khách hàng.                 |");
            System.out.println("|   2. Quản lý Sách.                       |");
            System.out.println("|   3. Quản lý phiếu mượn.                 |");
            System.out.println("|   4. Thoát.                              |");
            System.out.print("Mời chọn chức năng: ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    qlKhachhang.menu();
                    break;
                case 2:                    
                   break;
                case 3:                  
                    break;     
                case 4:
                    System.exit(0);
                    break;
            }

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ NGƯỜI MƯỢN------------------\n");
        } while (true);
    }
}
