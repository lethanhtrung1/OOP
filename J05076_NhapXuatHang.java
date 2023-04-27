/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class NhapXuatHang {
    private String ma, ten;
    private int giaNhap, giaXuat, lai;

    public NhapXuatHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        if(xepLoai.equals("A")) this.lai = 8;
        else if(xepLoai.equals("B")) this.lai = 5;
        else this.lai = 2;
    }

    public String getMa() {
        return ma;
    }
    
    public void setGia(int luongNhap, int donGiaNhap, int luongXuat) {
        this.giaNhap = luongNhap * donGiaNhap;
        this.giaXuat = luongXuat * donGiaNhap * (this.lai + 100) / 100;
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + giaNhap + " " + giaXuat;
    }
}

public class J05076_NhapXuatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<NhapXuatHang> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new NhapXuatHang(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        int m = Integer.parseInt(in.nextLine());
        while(m-- > 0) {
            String ma = in.next();
            for(NhapXuatHang it : arr) {
                if(it.getMa().equals(ma)) {
                    it.setGia(Integer.parseInt(in.next()),
                            Integer.parseInt(in.next()),
                            Integer.parseInt(in.next()));
                    System.out.println(it);
                    break;
                }
            }
        }
    }
}