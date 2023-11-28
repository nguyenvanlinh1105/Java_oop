/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public abstract class KHACHHANG implements ITIENDIEN{
    private String maKhachHang;
    private String hoTen;
    private Date ngayRaHoaDon;
    private float soLuong;
    private float donGia;
    protected Scanner sc;

    public KHACHHANG(String maKhachHang, String hoTen, Date ngayRaHoaDon, float soLuong, float donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public KHACHHANG() {
        sc= new Scanner(System.in);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public void Nhap(){
        System.out.print("Nhap ma khach hang: ");  this.maKhachHang= sc.nextLine();
        System.out.print("Nhap ho ten cua khach hang:");this.hoTen= sc.nextLine();
        System.out.print("Nhap ngay xuat ra don hang:"); 
        DateFormat df= new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngayRaHoaDon= df.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(KHACHHANG.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("Nhap so luong: "); this.soLuong= sc.nextFloat(); sc.nextLine();
        System.out.print("Nhap don gia :"); this.donGia= sc.nextFloat(); 
    }
    public void Xuat(){
    System.out.println("Mã khách hàng: " + this.maKhachHang);  
    System.out.println("Họ tên khách hàng: " + this.hoTen);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
    System.out.println("Ngày xuất đơn hàng: " +df.format(this.ngayRaHoaDon));
    System.out.println("Số lượng: " + this.soLuong);
    System.out.println("Đơn giá: " + this.donGia);
}
    public void capNhat(){
        System.out.print("Nhap ho ten cua khach hang:");this.hoTen= sc.nextLine();
        System.out.print("Nhap ngay xuat ra don hang:"); 
        DateFormat df= new SimpleDateFormat("dd/mm/yyyy");
        try {
            this.ngayRaHoaDon= df.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(KHACHHANG.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("Nhap so luong: "); this.soLuong= sc.nextFloat(); sc.nextLine();
    } 

    public abstract float TinhThanhTien();
}
