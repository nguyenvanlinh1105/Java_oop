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
public class khachHangVietNam extends KHACHHANG{
    private String doiTuongKH;
    private float dinhMuc;

    public khachHangVietNam(String doiTuongKH, float dinhMuc, String maKhachHang, String hoTen, Date ngayRaHoaDon, float soLuong, float donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    
    public khachHangVietNam(String doiTuongKH, float dinhMuc) {
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public khachHangVietNam() {
        
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public void NhapKhachHangVN(){
        super.Nhap();
        sc.nextLine();
        System.out.print("Nhap doi tuong khach hang:"); this.doiTuongKH= sc.nextLine();
        System.out.println("Nhap dinh muc cua khach hang: "); this.dinhMuc= sc.nextFloat();
    }
    public void XuatKHVN(){
        super.Xuat();
        System.out.println("Doi tuong khach hang la: "+this.doiTuongKH);
        System.out.println("Dinh muc cua khach hang la: "+this.dinhMuc);
    }
    public void capNhatKHVN(){
        super.capNhat();
        System.out.print("Nhap doi tuong khach hang:"); this.doiTuongKH= sc.nextLine();
        System.out.println("Nhap dinh muc cua khach hang: "); this.dinhMuc= sc.nextFloat();
    }
    @Override
    public float TinhThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
