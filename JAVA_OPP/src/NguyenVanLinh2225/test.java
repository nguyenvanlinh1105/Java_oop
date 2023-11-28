/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class test {
    public static void main(String[] args) {
        QLCB DSCB = new QLCB();
        Scanner sc = new Scanner(System.in);
        int luaChon= 0;
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap  can bo");
            System.out.println("2. Tim kiem can bo theo ten");
            System.out.println("3. Hien thi thong tin tat ca can bo");
            System.out.println("0. Thoat chuong trinh");
            luaChon = sc.nextInt(); sc.nextLine();
            switch(luaChon){
                case 1:
                    int luaChon1= 0;
                        do{
                        System.out.println("1. Them mot cong nhan");
                        System.out.println("2. them mot ki su");
                        System.out.println("3. Them mot nhan Vien");
                            System.out.println("0. Thoai chuong trinh");
                        luaChon1 = sc.nextInt(); sc.nextLine();
                        switch(luaChon1){
                            case 1:
                                canBo  cb = new congNhan();
                                congNhan cn  = (congNhan)cb;
                                cn.Nhap();
                                DSCB.themCB(cn);
                                break;
                            case 2:
                                canBo  cb1 = new kiSu();
                                kiSu cn1  = (kiSu)cb1;
                                cn1.Nhap();
                                DSCB.themCB(cn1);
                                break;
                            case 3:
                                canBo  cb2 = new nhanVien();
                                nhanVien cn2  = (nhanVien)cb2;
                                cn2.Nhap();
                                DSCB.themCB(cn2);
                                break;
                        }
                    }while(luaChon1!=0);
                break;
                case 2:
                    String hoTen;
                    System.out.println("Nhap ten muon tim: ");
                    hoTen = sc.nextLine();
                    DSCB.timKiem(hoTen);
                    break;
                case 3:
                    DSCB.hienThi();
                    break;
            }
        }while(luaChon !=0);
    }
}
