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
public class TaiLieu {
    private String maTaiLieu;
    private String tenTaiLieu;
    private String tenNhaSanXuat;
    private String soPhatHanh;
    protected Scanner sc;

    public TaiLieu(String maTaiLieu, String tenTaiLieu, String tenNhaSanXuat, String soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu() {
        sc = new Scanner(System.in);
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public TaiLieu(String soPhatHanh){
        this.soPhatHanh= soPhatHanh;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }
    public void Nhap(){
        System.out.println("Nhập mã tài liệu:");
        this.maTaiLieu= this.sc.nextLine();
        System.out.println("Nhập tên tài liệu:");
        this.tenTaiLieu = this.sc.nextLine();
        System.out.println("Nhập tên nhà sản xuất:");
        this.tenNhaSanXuat= this.sc.nextLine();
        System.out.println("Nhập số phát hành:");
        this.soPhatHanh= this.sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Mã tài liệu: "+this.maTaiLieu);
        System.out.println("Tên tài liệu: "+this.tenTaiLieu);
        System.out.println("Tên nhà sản xuất: "+this.tenNhaSanXuat);
        System.out.println("Số phát hành: "+this.soPhatHanh);
    }
}
