/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh_22225;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("KHỞI TẠO MỘT MẢNG:");
        System.out.println("Nhập số lượng hình của mảng");
        int m = sc.nextInt();
        DSShape1 DSShape1 = new DSShape1(m);
        int luaChon = 0;
        do{
            System.out.println("------MENU-----");
            System.out.println("Nhập lựa chọn của bạn ");
            System.out.println("1.Thêm hình");
            System.out.println("2.Hiển thị thông tin tổng của mỗi hình trong mảng:");
            System.out.println("3.Tổng các hình trong mảng:");
            System.out.println("0.thoát chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch(luaChon){
                case 1:
                    DSShape1.Nhap();
                    break;
                case 2:
                    DSShape1.ShowShapes();
                    break;
                case 3:
                    System.out.println("Tổng các hình có trong Array là : "+DSShape1.tinhtongdientich());
                    break;
            }
        }while(luaChon!=0);
        
    }
}
