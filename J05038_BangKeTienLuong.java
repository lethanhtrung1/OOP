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

class NhanVien_ {
    private String ma, ten, chucVu;
    private long luongThang, thuong, phuCap, tong;
    public NhanVien_(int stt, String ten, long luongNgay, long soNgay, String chucVu) {
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
}

public class J05038_BangKeTienLuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<NhanVien_> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            NhanVien_ tmp = new NhanVien_(i, in.nextLine(), in.nextLong(), in.nextLong(), in.next());
            arr.add(tmp);
        }
        long sum = 0;
        for(NhanVien_ it : arr) {
            System.out.println(it);
            sum += it.getTong();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}