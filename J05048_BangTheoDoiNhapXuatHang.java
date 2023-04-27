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

class MatHang48 {
    private String maHang;
    private long luongNhap, luongXuat, donGia, tien, thue;
    public MatHang48(String maHang, long luongNhap) {
        this.maHang = maHang;
        this.luongNhap = luongNhap;
        if(this.maHang.charAt(0) == 'A')
            this.luongXuat = (long) Math.round((double)luongNhap * 60 / 100);
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
    @Override
    public String toString() {
        return maHang + " " + luongNhap + " " + luongXuat + " " + donGia + " " + tien + " " + thue;
    }
}

public class J05048_BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang48> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            arr.add(new MatHang48(in.next(), in.nextLong()));
        }
        for(MatHang48 it : arr) {
            System.out.println(it);
        }
    }
}