
package Bai2;

import java.util.Scanner;

public class QLNhanVien {
    private NhanVien[] nvs = new NhanVien[100];
    private int sonv=1;
     
    public void nhapDSNV () {
                Scanner sc= new Scanner(System.in);
                System.out.println("nhap so luong nhan vien");
                int n = sc.nextInt();
                for (int i=1;i<=n;i++) {
                NhanVien nv =new NhanVien();
                nv.Nhap();
                nvs[sonv++]=nv;
                 }
            }
    public void xuatDSNV() {
                 for (int i=1;i<sonv;i++) {
                     System.out.println("Thong tin cua sinh vien "+i);
                        nvs[i].Xuat();
                 }
            }
            
    public void kiemtraTrungTen() {
            String hoten;
            Scanner sc= new Scanner(System.in);
             System.out.println("Nhap vao ho ten can tim kiem");
             
            hoten=sc.nextLine();
            for (int i=1;i<sonv;i++) {
                if (nvs[i].kiemtra(hoten)) {
                    System.out.println("Thong tin nhan vien tim kiem: ");
                       nvs[i].Xuat();
                }
                else 
                    System.out.println("Không tìm thay thong tin cua nhan vien");
            }
       }
}
