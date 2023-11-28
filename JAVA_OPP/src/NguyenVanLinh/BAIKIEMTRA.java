/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BAIKIEMTRA {
    public static void main(String[] args) {
        DSKHACHHANG DSKH= new DSKHACHHANG();
        Scanner sc = new Scanner(System.in);
        int luaChon= 0;
        do{
            System.out.println("----MENU-----");
            System.out.println("1. Them khach hang" );
            System.out.println("2. Xoa khach hang theo ma khach hanh nhap vao ban phim");
            System.out.println("3. Tim kiem khach hang theo ma khach hang");
            System.out.println("4. Tinh tong tien so lượng cho từng loai khach khach hang ");
            System.out.println("5. Hiên thi Danh sach khach hang");
            System.out.println("6. Cập nhật thông tin cho khach hàng theo ma");
            System.out.println("0. Thoat");
            System.out.println("// Lưu í ở làn xoa thứ hoặc tìm lần thứ 2 thì nhập 2 lần vì nó chứ một sc.nextLine ");
            luaChon= sc.nextInt();
            switch(luaChon){
                case 1:
                    DSKH.ThemKhachHang();
                    break;
                
                case 2:
                    DSKH.XoaKH();
                    break;

                case 3:
                    DSKH.timKiemKH();

                    break;
                
                case 4:
                    DSKH.TinhTongSoLuongChoTungLoaiKH();
                    break;
                 case 5:
                    DSKH.HienThiDS();
                    break;
                 case 6:
                     DSKH.capNhatKH();
                      
            }
        }while(luaChon!=0);
    }
}
