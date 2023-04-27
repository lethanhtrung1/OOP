/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */

class GiaoVien {
    private String ma, ten;
    private long bacLuong, phuCap, thuNhap;
    public GiaoVien(String ma, String ten, int luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.bacLuong = Integer.parseInt(this.ma.substring(2));
        if(this.ma.substring(0, 2).equals("HT"))
            this.phuCap = 2000000;
        else if(this.ma.substring(0, 2).equals("HP"))
            this.phuCap = 900000;
        else if(this.ma.substring(0, 2).equals("GV"))
            this.phuCap = 500000;
        else
            this.phuCap = 0;
        this.thuNhap = luongCoBan * this.bacLuong + this.phuCap;
    }
    public String getMa() {
        return ma;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + bacLuong + " " + phuCap + " " + thuNhap;
    }
}

public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ht = 1, hp = 2;
        ArrayList<GiaoVien> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String ma = in.next();
            in.nextLine();
            String ten = in.nextLine();
            int luongCoBan = in.nextInt();
            GiaoVien gv = new GiaoVien(ma, ten, luongCoBan);
            if(ma.substring(0, 2).equals("HT")) {
                ht--;
                if(ht >= 0) arr.add(gv);
            } else if(ma.substring(0, 2).equals("HP")) {
                hp--;
                if(hp >= 0) arr.add(gv);
            } else {
                arr.add(gv);
            }
        }
        for(GiaoVien it : arr) {
            System.out.println(it);
        }
    }
}