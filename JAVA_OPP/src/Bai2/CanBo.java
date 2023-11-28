package Bai2;

import java.util.Objects;
import java.util.Scanner;

public class CanBo {
   private String hoten;
   private String gioitinh;
   private String diachi;
   private String sdt;
   protected Scanner sc;
   
   public CanBo() {
       sc= new Scanner(System.in);
   }

    public CanBo(String hoten, String gioitinh, String diachi, String sdt) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CanBo other = (CanBo) obj;
        return Objects.equals(this.hoten, other.hoten);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
   
   public void Nhap () {
       System.out.println("nhap ho va ten");
       this.hoten=this.sc.nextLine();
       System.out.println("nhap gioi tinh");
       this.gioitinh=this.sc.nextLine();
       System.out.println("nhap dia chi");
       this.diachi=this.sc.nextLine();
       System.out.println("nhap so dien thoai");
       this.sdt=this.sc.nextLine();
   }

    public void Xuat() {
        System.out.println( "CanBo{" + "hoten=" + hoten + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", sdt=" + sdt );
    }

    
    public boolean kiemtra(String hoten1 ) {
        return this.hoten.equals(hoten1);
        }
     
}
