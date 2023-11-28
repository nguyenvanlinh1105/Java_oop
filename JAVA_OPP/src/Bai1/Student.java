package Bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person {
    private String maSinhVien;
    private float diemTrungBinh;
    private String Email;
    protected Scanner sc;

    public Student(){
        
    }
    public Student(String maSinhVien, float diemTrungBinh, String Email, String ten, String gioiTinh, String diaChi, LocalDate ngaySinh) {
        super(ten, gioiTinh, diaChi, ngaySinh);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.Email = Email;
        sc = new Scanner(System.in);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    @Override
    public void Nhap(){
        System.out.println("Nhap thong tin sinh vien!\n");
        super.Nhap();
        System.out.println("Nhap ma sinh vien: ");
        this.maSinhVien =  super.sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        this.diemTrungBinh =  Float.parseFloat(super.sc.nextLine());
        System.out.println("Nhap email: ");
        this.Email = super.sc.nextLine();
    }


    @Override
    public void Xuat(){
        System.out.println("\nThong tin sinh vien :");
        super.Xuat();
        System.out.println("Ma sinh vien: " + this.maSinhVien);
        System.out.println("Diem trung binh: " + this.diemTrungBinh);
        System.out.println("Email: " + this.Email);
   
    }
    
    public void Kiemtra(){
        if(this.diemTrungBinh > 8.5)
        {
            System.out.println("\nSinh vien duoc hoc bong!");
            Xuat();
        }
        else
            System.out.println("\nSinh vien khong duoc hoc bong!");
    }
}
