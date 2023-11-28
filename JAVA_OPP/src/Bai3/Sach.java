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
public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;
    private int thangPhatHanh;
    public Sach(String tenTacGia, int soTrang, int thangPhatHanh, String maTaiLieu, String tenTaiLieu, String tenNhaSanXuat, String soPhatHanh) {
        super(maTaiLieu, tenTaiLieu, tenNhaSanXuat, soPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.thangPhatHanh = thangPhatHanh;
    }

    public Sach() {

    }
    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    
    public void Nhap(){
        super.Nhap();
        do{
            System.out.println("Nhập tên tác giả:");
            this.tenTacGia= super.sc.nextLine();
        }while(this.tenTacGia.length()>20);
        
        do{
            System.out.println("Nhập số trang:");
            this.soTrang= super.sc.nextInt();
            sc.nextLine();
        }while(this.soTrang<=0);
        
        do{
            System.out.println("Nhập tháng phát hành:");
            this.thangPhatHanh = super.sc.nextInt();
            sc.nextLine();
        }while(this.thangPhatHanh>12 || this.thangPhatHanh<1);
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Nhập tên tác giả: "+this.tenTacGia);
        System.out.println("Nhập số trang: "+this.soTrang);
        System.out.println("Nhập tháng phát hàng: "+this.thangPhatHanh);

        
    }
    
    
}
