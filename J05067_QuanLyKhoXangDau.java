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

class XangDau implements Comparable<XangDau> {
    private String maHang, hang;
    private long donGia, thue, thanhTien;
    public XangDau(String maHang, long soLuong) {
        this.maHang = maHang;
        int maThue;
        if(this.maHang.substring(0, 1).equals("X")) {
            this.donGia = 128000;
            maThue = 6;
        }
        else if(this.maHang.substring(0, 1).equals("D")) {
            this.donGia = 11200;
            maThue = 7;
        }
        else {
            this.donGia = 9700;
            maThue = 4;
        }
        if(this.maHang.substring(3).equals("BP"))
            this.hang = "British Petro";
        else if(this.maHang.substring(3).equals("ES"))
            this.hang = "Esso";
        else if(this.maHang.substring(3).equals("SH"))
            this.hang = "Shell";
        else if(this.maHang.substring(3).equals("CA"))
            this.hang = "Castrol";
        else if(this.maHang.substring(3).equals("MO"))
            this.hang = "Mobil";
        else this.hang = "Trong Nuoc";
        if(this.maHang.substring(3).equals("TN"))
            this.thue = 0;
        else
            this.thue = soLuong * this.donGia * maThue / 200;
        this.thanhTien = soLuong * this.donGia + this.thue;
    }
    @Override
    public String toString() {
        return maHang + " " + hang + " " + donGia + " " + thue + " " + thanhTien;
    }
    @Override
    public int compareTo(XangDau o) {
        if(this.thanhTien > o.thanhTien) return -1;
        if(this.thanhTien < o.thanhTien) return 1;
        return 0;
    }
}

public class J05067_QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<XangDau> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
           in.nextLine(); 
           arr.add(new XangDau(in.next(), in.nextInt()));
        }
        Collections.sort(arr);
        for(XangDau it : arr) {
            System.out.println(it);
        }
    }
}