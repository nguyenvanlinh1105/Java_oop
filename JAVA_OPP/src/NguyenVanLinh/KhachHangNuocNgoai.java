/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh;

import java.util.Date;

/**
 *
 * @author HP
 */
public class KhachHangNuocNgoai extends KHACHHANG{
    private String quocTich;

    public KhachHangNuocNgoai(String quocTich, String maKhachHang, String hoTen, Date ngayRaHoaDon, float soLuong, float donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai() {
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public void NhapKHNN(){
        super.Nhap();
        sc.nextLine();
        System.out.print("Nhap quoc tich: ");
        this.quocTich = sc.nextLine();
    }
    
    public void XuatKHNN(){
        super.Xuat();
    
        System.out.println("Quoc tich khach hang :"+this.quocTich); 
    }
    public void capNhatKHNN(){
        super.capNhat();
        System.out.print("Nhap quoc tich khach hang: "); this.quocTich= sc.nextLine();
    }
    @Override
    public float TinhThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
