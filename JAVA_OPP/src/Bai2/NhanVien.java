
package Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private int tuoi;
    private int luong;
    private String email;
    
    public NhanVien() {
        
    }

    public NhanVien(int tuoi, int luong, String email, String hoten, String gioitinh, String diachi, String sdt) {
        super(hoten, gioitinh, diachi, sdt);
        this.tuoi = tuoi;
        this.luong = luong;
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void Nhap() {
        super.Nhap();
        super.sc= new Scanner(System.in);
        do {
            System.out.println("nhap tuoi:");
            this.tuoi= super.sc.nextInt();
        }
        while (tuoi<20 || tuoi >60);
        
        do {
            System.out.println("nhap luong:");
            this.luong= super.sc.nextInt();
            super.sc.nextLine();
        }
        while (luong<1 || luong>5);
        
        do {
            System.out.println("nhap email:");
            this.email=super.sc.nextLine();
        }
        while ((!email.contains("@")) || (email.contains(" ")));
    }
    
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("NhanVien{" + "tuoi=" + tuoi + ", luong=" + luong + ", email=" + email + '}');
    }

  
    
    
    
    
}
