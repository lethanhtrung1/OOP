/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class MonHoc implements Comparable<MonHoc> {
    private String maMon, tenMon, hinhThucLyThuyet, hinhThucThucHanh;
    private int soTin;
    public MonHoc(String maMon, String tenMon, int soTin, String s1, String s2) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTin = soTin;
        this.hinhThucLyThuyet = s1;
        this.hinhThucThucHanh = s2;
    }
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTin + " " + hinhThucLyThuyet + " " + hinhThucThucHanh;
    }
    @Override
    public int compareTo(MonHoc o) {
        if(this.maMon.compareTo(o.maMon) < 0) return -1;
        if(this.maMon.compareTo(o.maMon) > 0) return 1;
        return 0;
    }
}

public class J07073_DangKyHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 1; i <= n; i++) {
            String maMon = in.nextLine();
            String tenMon = in.nextLine();
            int soTin = in.nextInt();
            in.nextLine();
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if(!s2.equals("Truc tiep"))
                arr.add(new MonHoc(maMon, tenMon, soTin, s1, s2));
        }
        Collections.sort(arr);
        for(MonHoc it : arr) {
            System.out.println(it);
        }
    }
}
