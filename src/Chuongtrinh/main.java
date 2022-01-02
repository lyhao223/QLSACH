package Chuongtrinh;

import java.io.IOException;
import java.util.Scanner;
import Danhsach.QLKhachhang;
import Danhsach.QLSach;
import Danhsach.QLHoadon;

public class main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws IOException{
       menu();
    }
    
    public static void menu() throws IOException{
        QLSach qlSach = new QLSach();
        QLKhachhang qlKhachhang = new QLKhachhang();
        QLHoadon qlHoadon = new QLHoadon();
        do {
            System.out.println();
            System.out.println("              QUẢN LÝ SÁCH                 ");
            System.out.println("-------------------***-------------------");
            System.out.println("|   1. Quán lý khách hàng.                 |");
            System.out.println("|   2. Quản lý sách.                       |");
            System.out.println("|   3. Quản lý hoá đơn.                    |");
            System.out.println("|   4. Thoát.                              |");
            System.out.print("Mời chọn chức năng: ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1 -> qlKhachhang.menu();
                case 2 -> qlSach.menu();
                case 3 -> qlHoadon.menu();
                case 4 -> System.exit(0);
            }

            System.out.println("\n---------------------KẾT THÚC MENU QUẢN LÝ ---------------------------\n");
        } while (true);
    }
}
