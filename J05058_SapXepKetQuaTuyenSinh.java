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

class TuyenSinh1 implements Comparable<TuyenSinh1> {
    private String ma, hoTen, trangThai;
    private double diemUuTien, diemTong;
    public TuyenSinh1(String ma, String hoTen, double d1, double d2, double d3) {
        this.ma = ma;
        this.hoTen = hoTen;
        if(this.ma.substring(0, 3).equals("KV1"))
            this.diemUuTien = 0.5;
        else if(this.ma.substring(0, 3).equals("KV2"))
            this.diemUuTien = 1.0;
        else
            this.diemUuTien = 2.5;
        this.diemTong = d1 * 2 + d2 + d3 + this.diemUuTien;
        if(this.diemTong >= 24)
            this.trangThai = "TRUNG TUYEN";
        else
            this.trangThai = "TRUOT";
    }
    public String format(double n) {
        if(n == (int)n) {
            return String.valueOf((int)n);
        }
        return String.valueOf(n);
    }
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + format(diemUuTien) + " " + format(diemTong) + " " + trangThai;
    }
    @Override
    public int compareTo(TuyenSinh1 o) {
        if(this.diemTong > o.diemTong) return -1;
        else if(this.diemTong == o.diemTong) {
            return this.ma.compareTo(o.ma);
        }
        return 1;
    }
}

public class J05058_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<TuyenSinh1> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new TuyenSinh1(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(arr);
        for(TuyenSinh1 it : arr) {
            System.out.println(it);
        }
    }
}
