/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class NhanVien {
    private String ma, ten, chucVu;
    private int luongCoBan, ngayCong, thuong, phuCap;
    public NhanVien(String ten, int luongCoBan, int ngayCong, String chucVu) {
        this.ma = "NV01";
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        if(ngayCong >= 25)
            thuong = (luongCoBan * ngayCong) * 20 / 100;
        else if(ngayCong >= 22 && ngayCong < 25)
            thuong = (luongCoBan * ngayCong) * 10 / 100;
        else
            thuong = 0;
        if(chucVu.compareTo("GD") == 0)
            phuCap = 250000;
        else if(chucVu.compareTo("PGD") == 0)
            phuCap = 200000;
        else if(chucVu.compareTo("TP") == 0)
            phuCap = 180000;
        else
            phuCap = 150000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + luongCoBan * ngayCong + " " + thuong + " " + phuCap + " " + (luongCoBan * ngayCong + thuong + phuCap);
    }
}

public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien tmp = new NhanVien(in.nextLine(), in.nextInt(), in.nextInt(), in.next());
        System.out.println(tmp);
    }
}
