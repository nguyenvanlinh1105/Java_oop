/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class canBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    protected  Scanner sc ;

    public canBo(String hoTen, int tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public canBo() {
        sc = new Scanner (System.in);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "canBo{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", sc=" + sc + '}';
    }
    public void Nhap(){
        System.out.println("nhap ho ten: ");
        this.hoTen= sc.nextLine();
        System.out.println("nhap tuoi: ");
        this.tuoi= sc.nextInt(); sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioiTinh= sc.nextLine();
    }
    public void Xuat(){
        System.out.println("ho ten: "+this.hoTen);
        System.out.println("Tuoi: "+this.tuoi);
        System.out.println("Gioi tinh : "+this.gioiTinh);
    }
    
}
