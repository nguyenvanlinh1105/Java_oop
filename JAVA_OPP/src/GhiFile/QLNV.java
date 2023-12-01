/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GhiFile;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class QLNV {
    Hashtable<String , NhanVien> DSNV = new Hashtable<>();
    protected Scanner sc;
    public QLNV() {
        sc= new Scanner(System.in);
    }
    
    public void themNhanVien(){
        int n ;
        System.out.println("Thêm bao nhiêu nhân viên?");
        n= sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Nhap thong tin cua nhan vien thu "+i);
            NhanVien nv = new NhanVien();
            nv.NhapNV();
            DSNV.put(nv.getMaNhanVien(), nv);
        }
    }
    public void hienThiNhanVien(){
        System.out.println("Danh sach nhan vien:");
        for(NhanVien nv : DSNV.values()){
            System.out.println("------------");
            nv.InNV();
        }
    }
    public void WriteFile() { 
        FileWriter fw; 
        try { 
            String strInfor=""; 
            fw=new FileWriter("D:\\OneDrive - University of Technology and Education\\2023-2024 kì 123\\TH_JAVA\\Java_oop\\JAVA_OPP\\src\\GhiFile\\NhanVien.txt");			 
            for (NhanVien nhanvien : DSNV.values()) 
            {					 
                strInfor +=nhanvien.getMaNhanVien() + "," 
                + nhanvien.getHoTen()+"," 
                + nhanvien.getTuoi()+"," 
                +nhanvien.getLuong()+"\r\n";
                } 
        fw.write(strInfor); 
            fw.close();	 
        } catch (IOException e) {				 
        }		 
} 
    
public void ReadFile() {
    FileReader fr;
    try {
        fr = new FileReader("D:\\OneDrive - University of Technology and Education\\2023-2024 kì 123\\TH_JAVA\\Java_oop\\JAVA_OPP\\src\\GhiFile\\NhanVien.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        int i = 0;
        while ((s = br.readLine()) != null) {// đọc từng line
            String[] strinfor = s.split("[,]+");
            String manv = strinfor[0];
            String hoten = strinfor[1];
            // Convert string tuoi to int
            int tuoi = 0;
                tuoi = Integer.parseInt(strinfor[2]);
            // Convert string luong to float
            float luong = Float.parseFloat(strinfor[3]);
            NhanVien nhanvien = new NhanVien(manv, hoten, tuoi, luong);
            this.DSNV.put(nhanvien.getMaNhanVien(), nhanvien);
        }
        fr.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void GhiFile() {
        File file = new File("D:\\OneDrive - University of Technology and Education\\2023-2024 kì 123\\TH_JAVA\\Java_oop\\JAVA_OPP\\src\\GhiFile\\NhanVien.txt");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (NhanVien nv : DSNV.values()) {
                oos.writeObject(nv);
            }
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DocFile() {
        File file = new File("D:\\OneDrive - University of Technology and Education\\2023-2024 kì 123\\TH_JAVA\\Java_oop\\JAVA_OPP\\src\\GhiFile\\NhanVien.txt");
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            NhanVien nv;
            while ((nv = (NhanVien) ois.readObject()) != null) {
                this.DSNV.put(nv.getMaNhanVien(), nv);
            }
            ois.close();
        } catch (EOFException e) {
            // Kết thúc tệp, không có ngoại lệ cần xử lý
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
}

