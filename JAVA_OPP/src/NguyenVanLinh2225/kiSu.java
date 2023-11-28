/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

/**
 *
 * @author HP
 */
public class kiSu extends canBo{
    private String nghanhDaoTao;

    public kiSu(String nghanhDaoTao, String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
        this.nghanhDaoTao = nghanhDaoTao;
    }

    public kiSu() {
        
    }

    public String getNghanhDaoTao() {
        return nghanhDaoTao;
    }

    public void setNghanhDaoTao(String nghanhDaoTao) {
        this.nghanhDaoTao = nghanhDaoTao;
    }
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap nghanh dao tao: ");
        this.nghanhDaoTao =sc.nextLine();
    }
    public void xuat(){
        super.Xuat();
        System.out.println("Nghanh dao tao: "+this.nghanhDaoTao);
    }
    
}
