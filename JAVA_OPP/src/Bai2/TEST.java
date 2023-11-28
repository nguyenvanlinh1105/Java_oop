package Bai2;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Xuất thông tin nhân viên");
            System.out.println("3. Tìm kiếm theo họ tên");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
 
            choice= sc.nextInt();
            sc.nextLine();
            QLNhanVien qlnv=new QLNhanVien();
            
            switch (choice) {
            case 1 ->  {
                qlnv.nhapDSNV();
            }
            case 2 ->  {
                qlnv.nhapDSNV();
                qlnv.xuatDSNV();
            }
            case 3 ->  {
                qlnv.nhapDSNV();
                qlnv.xuatDSNV();
                qlnv.kiemtraTrungTen();
            }
            case 4 -> {
              }
        }           
    }
}
