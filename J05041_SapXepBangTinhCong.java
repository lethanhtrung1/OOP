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

class NhanVien__ implements Comparable<NhanVien__> {
    private String ma, ten, chucVu;
    private long luongThang, thuong, phuCap, tong;
    public NhanVien__(int stt, String ten, long luongNgay, long soNgay, String chucVu) {
        if(stt < 10) this.ma = "NV0" + stt;
        else this.ma = "NV" + stt;
        this.ten = ten;
        this.luongThang = luongNgay * soNgay;
        if(soNgay >= 25) this.thuong = this.luongThang * 20 / 100;
        else if(soNgay >= 22) this.thuong = this.luongThang * 10 / 100;
        else this.thuong = 0;
        if(chucVu.equals("GD")) this.phuCap = 250000;
        else if(chucVu.equals("PGD")) this.phuCap = 200000;
        else if(chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.tong = this.luongThang + this.thuong + this.phuCap;
    }
    public long getTong() {
        return tong;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + luongThang + " " + thuong + " " + phuCap + " " + tong;
    }
    @Override
    public int compareTo(NhanVien__ o) {
        if(this.tong > o.tong) return -1;
        if(this.tong < o.tong) return 1;
        return 0;
    }
}

public class J05041_SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<NhanVien__> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            NhanVien__ tmp = new NhanVien__(i, in.nextLine(), in.nextLong(), in.nextLong(), in.next());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(NhanVien__ it : arr) {
            System.out.println(it);
        }
    }
}