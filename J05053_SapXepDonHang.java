/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class DonHang1 implements Comparable<DonHang1> {
    private String tenHang, maHang, stt;
    private int giamGia, thanhTien;
    public DonHang1(String tenHang, String maHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.stt = this.maHang.substring(1, 4);
        if(this.maHang.charAt(4) == '1')
            this.giamGia = donGia * soLuong / 2;
        else
            this.giamGia = donGia * soLuong * 3 / 10;
        this.thanhTien = donGia * soLuong - this.giamGia;
    }
    @Override
    public String toString() {
        return tenHang + " " + maHang + " " + stt + " " + giamGia + " " + thanhTien;
    }
    @Override
    public int compareTo(DonHang1 o) {
        return this.stt.compareTo(o.stt);
    }
}

public class J05053_SapXepDonHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<DonHang1> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new DonHang1(in.nextLine(), in.next(), in.nextInt(), in.nextInt()));
        }
        Collections.sort(arr);
        for(DonHang1 it : arr) {
            System.out.println(it);
        }
    }
}