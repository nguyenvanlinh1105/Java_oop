/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh2225;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QLCB {
    private ArrayList<canBo> arr = new ArrayList();

    public QLCB() {
    }
    public void themCB(canBo cb){
        arr.add(cb);
    }
    public void timKiem(String hoTen){
        int dem= 0;
        for(canBo cb: arr){
            if(cb.getHoTen().equals(hoTen)){
                cb.Xuat();
                dem++;
            }
        }
        if(dem==0){
            System.out.println("Khong co can bo nao dc tim thay trung voi ten "+hoTen);
        }
    }
    public void hienThi(){
        int i= 1;
        for(canBo cb: arr){
            System.out.println("Thong tin cua can bo thu "+i);
            i++;
//            nhanVien nv =(nhanVien) cb;
            if(cb instanceof nhanVien){
                ((nhanVien) cb).xuat();
            }else if(cb instanceof kiSu){
                ((kiSu) cb).xuat();
            }else if(cb instanceof congNhan){
                ((congNhan) cb).xuat();
            }
        }
    }
}
