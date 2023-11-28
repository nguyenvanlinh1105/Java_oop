/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

/**
 *
 * @author HP
 */
public class congNhan extends canBo{
    private int bac;

    public congNhan(int bac, String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
        this.bac = bac;
    }

    public congNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    public void Nhap(){
        super.Nhap();
        do{
            System.out.println("Nhap bac luong: ");
            this.bac = sc.nextInt();sc.nextLine();
        }while(this.bac>10 || this.bac<0);
    }
    public void xuat(){
        super.Xuat();
        System.out.println("Bac luong: "+this.bac);
    }
}
