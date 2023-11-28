/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            DSTaiLieu DSTaiLieu = new DSTaiLieu();
            int luaChon;
            do{
                System.out.println("=====MENU=====");
                System.out.println("1-- Thêm n quyển sách:");
                System.out.println("2-- In ra toàn bộ sách trong DS:");
                System.out.println("3--Tim kiếm nhân viên theo số phát hành:");
                System.out.println("4--Thoát");
                luaChon= sc.nextInt();
                sc.nextLine();
                switch(luaChon){
                    case 1:
                        DSTaiLieu.ThemSach();
                        break;
                    
                    case 2:
                        DSTaiLieu.inDanhSach();
                        break;
                    case 3:
                        System.out.println("Nhập số phát hành của sách cần tìm:");
                        String soPhatHanh= sc.nextLine();
                        DSTaiLieu.TimKiem(soPhatHanh);
                        break;
                }
            }while(luaChon!=4);
    }
}
