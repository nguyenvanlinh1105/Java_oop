/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DSKHACHHANG {
    private ArrayList<KHACHHANG> DSKH;
    protected Scanner sc;

    public DSKHACHHANG() {
        DSKH = new ArrayList<KHACHHANG>();
        sc= new Scanner(System.in);
    }
    public void ThemKhachHang(){
          int luaChon = 0;
        System.out.println("Ban muon them Khach hang viet nam  hay them khach hang nuoc ngoai");
        System.out.println("1.Them khach hang viet nam");
        System.out.println("2.Them khach hang nuoc ngoai");
        luaChon= sc.nextInt();
        if(luaChon==1){
            int n;
            System.out.println("Them bao nhieu khach hang:");
            n= sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println("Nhap khach hang thu "+i);
                KHACHHANG kh= new khachHangVietNam();
                khachHangVietNam khvn= (khachHangVietNam) kh;
                khvn.NhapKhachHangVN();
                DSKH.add(khvn);
            }
        }else if(luaChon==2){
            int n;
            System.out.println("Them bao nhieu khach hang:");
            n= sc.nextInt();
            for(int i=1;i<=n;i++){
               System.out.println("Nhap khach hang thu "+i);
                KHACHHANG kh= new KhachHangNuocNgoai();
                KhachHangNuocNgoai khnn= (KhachHangNuocNgoai) kh;
                khnn.NhapKHNN();
                DSKH.add(khnn);
            }
        }else{
            return;
        }
        
    }
    public void XoaKH() {
    sc.nextLine();
    System.out.println("Ban muon xoa khach hang co ma khach hang nao?");
    String ma = sc.nextLine();

    Iterator<KHACHHANG> iterator = DSKH.iterator();

    while (iterator.hasNext()) {
        KHACHHANG kh = iterator.next();
        if (kh.getMaKhachHang().equals(ma)) {
            iterator.remove();
            System.out.println("Khach hang da duoc xoa.");
            return; 
        }
    }

    System.out.println("Khong tim thay khach hang voi ma khach hang " + ma);
}

public void timKiemKH() {
    System.out.println("Nhap vao ma khach hang can tim:");
    sc.nextLine(); 
    String maKH = sc.nextLine();
    
    int count = 0;

    for (KHACHHANG kh : DSKH) {
        if (kh.getMaKhachHang().equals(maKH)) {
            if (kh instanceof khachHangVietNam) {
                khachHangVietNam khvn = (khachHangVietNam) kh;
                khvn.XuatKHVN();
            } else if (kh instanceof KhachHangNuocNgoai) {
                KhachHangNuocNgoai khnn = (KhachHangNuocNgoai) kh;
                khnn.XuatKHNN();
            }
            count++;
        }
    }

    if (count == 0) {
        System.out.println("Khong co khach hang nao co ma khach hang " + maKH + " trong danh sach");
    }
}
    public void capNhatKH(){
        String maKH;
        System.out.println("Ban muon cap nhat khach hang co ma nao ");
        maKH= sc.nextLine();
        int dem=0;
        for(KHACHHANG kh: DSKH){
            if(maKH.equalsIgnoreCase(kh.getMaKhachHang())){
                if(kh instanceof khachHangVietNam){
                    khachHangVietNam khvn= (khachHangVietNam)kh;
                    khvn.capNhatKHVN();
                }else if(kh instanceof KhachHangNuocNgoai){
                    KhachHangNuocNgoai khnn= (KhachHangNuocNgoai) kh;
                    sc.nextLine();
                    khnn.capNhatKHNN();
                }
                dem++;
            }
        }
        if(dem==0){
            System.out.println("Khong tim thay khach hang co ma: "+maKH);
        }
    }
   

   public void TinhTongSoLuongChoTungLoaiKH(){
    float tongKHVN = 0;
    float tongKHNN = 0;
    
    for (KHACHHANG kh : DSKH) {
        if (kh instanceof khachHangVietNam) {
            khachHangVietNam khvn = (khachHangVietNam) kh;
            tongKHVN += khvn.getSoLuong();
        } else if (kh instanceof KhachHangNuocNgoai) {
            KhachHangNuocNgoai khnn = (KhachHangNuocNgoai) kh;
            tongKHNN += khnn.getSoLuong();
        }
    }

    System.out.println("Tổng số lượng khách hàng Việt Nam: " + tongKHVN);
    System.out.println("Tổng số lượng khách hàng Nước Ngoài: " + tongKHNN);
}
   public void HienThiDS(){
       int i=1;
       System.out.println("DANH SACH KHACH HANG: ");
       for (KHACHHANG kh : DSKH) {
           System.out.println("Khach hang thu "+i);
        if (kh instanceof khachHangVietNam) {
            khachHangVietNam khvn = (khachHangVietNam) kh;
            khvn.XuatKHVN();
            i++;
        } else if (kh instanceof KhachHangNuocNgoai) {
            KhachHangNuocNgoai khnn = (KhachHangNuocNgoai) kh;
            khnn.XuatKHNN();
            i++;
   }
   
    
}
   }
}
