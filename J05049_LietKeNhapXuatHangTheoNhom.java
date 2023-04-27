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

class MatHang49 implements Comparable<MatHang49> {
    private String maHang;
    private long luongNhap, luongXuat, donGia, tien, thue;
    public MatHang49(String maHang, long luongNhap) {
        this.maHang = maHang;
        this.luongNhap = luongNhap;
        if(this.maHang.charAt(0) == 'A')
            this.luongXuat = (long) Math.round((double)luongNhap * 60 / 100 );
        else
            this.luongXuat = (long) Math.round((double)luongNhap * 70 / 100);
        if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
            this.donGia = 110000;
        else
            this.donGia = 135000;
        this.tien = this.luongXuat * this.donGia;
        if(this.maHang.charAt(0) == 'A') {
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                this.thue = this.tien * 8 / 100;
            else
                this.thue = this.tien * 11 / 100;
        } else {
            if(this.maHang.charAt(this.maHang.length() - 1) == 'Y')
                this.thue = this.tien * 17 / 100;
            else
                this.thue = this.tien * 22 / 100;
        }
    }
    public String getMaHang() {
        return maHang;
    }
    @Override
    public String toString() {
        return maHang + " " + luongNhap + " " + luongXuat + " " + donGia + " " + tien + " " + thue;
    }
    @Override
    public int compareTo(MatHang49 o) {
        if(this.thue > o.thue) return -1;
        if(this.thue < o.thue) return 1;
        return 0;
    }
}

public class J05049_LietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang49> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            arr.add(new MatHang49(in.next(), in.nextLong()));
        }
        Collections.sort(arr);
        char c = in.next().charAt(0);
        for(MatHang49 it : arr) {
            if(it.getMaHang().charAt(0) == c) {
                System.out.println(it);
            }
        }
    }
}