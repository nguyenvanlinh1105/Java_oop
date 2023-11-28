package Bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
    private String ten;
    private String gioiTinh;
    private String diaChi;
    private LocalDate ngaySinh;
    protected Scanner sc;

    public Person(String ten, String gioiTinh, String diaChi, LocalDate ngaySinh) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Person(){
        sc = new Scanner(System.in);
    }
    
    
    public void Nhap(){
        System.out.println("Nhap ten: " );
        this.ten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("Nhap ngay sinh theo dd/MM/yyyy: ");
        String ngaySinhStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.ngaySinh = LocalDate.parse(ngaySinhStr, formatter);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    
    public void Xuat(){
        System.out.println("Ten: " + this.ten);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Ngay sinh: " + this.ngaySinh);
    }
}


