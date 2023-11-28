/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

/**
 *
 * @author HP
 */
public class nhanVien extends canBo{
    private String congViec;

    public nhanVien(String congViec, String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
        this.congViec = congViec;
    }
    public nhanVien(){
        
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap cong viec: ");
        this.congViec = sc.nextLine();
    }
    public void xuat(){
        super.Xuat();
        System.out.println("cong viec: "+this.congViec);
    }
}
