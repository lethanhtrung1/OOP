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

class NhanVien45 implements Comparable<NhanVien45> {
    private String ma, ten;
    private int phuCap, luongChinh, tamUng, conLai;
    public NhanVien45(int stt, String ten, String chucVu, int luongCoBan, int soNgay) {
        if(stt < 10) this.ma = "NV0" + stt;
        else this.ma = "NV" + stt;
        this.ten = ten;
        if(chucVu.equals("GD")) this.phuCap = 500;
        else if(chucVu.equals("PGD")) this.phuCap = 400;
        else if(chucVu.equals("TP")) this.phuCap = 300;
        else if(chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        this.luongChinh = luongCoBan * soNgay;
        if((int)((double)(this.phuCap + this.luongChinh) * 2 / 3) < 25000) {
            this.tamUng = (int)Math.round((double)(this.phuCap + this.luongChinh) * 2 / 3 / 1000) * 1000;
        } else {
            this.tamUng = 25000;
        }
        this.conLai = this.luongChinh - this.tamUng + this.phuCap;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai;
    }
    @Override
    public int compareTo(NhanVien45 o) {
        if(this.luongChinh + this.phuCap > o.luongChinh + o.phuCap) return -1;
        else if(this.luongChinh + this.phuCap == o.luongChinh + o.phuCap) {
            return this.ma.compareTo(o.ma);
        }
        return 1;
    }
}

public class J05045_SapXepNhanVienTheoThuNhap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<NhanVien45> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            NhanVien45 tmp = new NhanVien45(i, in.nextLine(), in.next(), in.nextInt(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(NhanVien45 it : arr) {
            System.out.println(it);
        }
    }
}