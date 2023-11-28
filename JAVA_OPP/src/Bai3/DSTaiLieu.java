package Bai3;
import java.util.ArrayList;
import java.util.Scanner;
import Bai3.Sach;
public class DSTaiLieu {
    ArrayList<Sach> DSTaiLieu;

    public DSTaiLieu(ArrayList<Sach> DSTaiLieu) {
        this.DSTaiLieu = DSTaiLieu;
    }

    public DSTaiLieu(){
        this.DSTaiLieu= new ArrayList<Sach>();
    }
    public void ThemSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm bao nhiêu quyển sách:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1;i<=n;i++){
            System.out.println("Nhập thông tin sách thư "+ i);
            Sach sach = new Sach();
            sach.Nhap();
            this.DSTaiLieu.add(sach);
    }}
    public void inDanhSach(){
        System.out.println("Danh sach Sach có trong DSTaiLieu");
        for(Sach sach: DSTaiLieu){
            System.out.println("-----Thông tin về sách:" +sach.getTenTaiLieu());
            sach.Xuat();
        }
    }
    public void TimKiem( String soPhatHanh){
        boolean check = false;
        for(Sach s : DSTaiLieu){
            if(s.getSoPhatHanh().equals(soPhatHanh)){
                s.Xuat();
                check = true;
            }         
        }
        if(!check){
            System.out.println("Không tìm thấy sách trong DS tài liệu");
        }
            
    }
}
