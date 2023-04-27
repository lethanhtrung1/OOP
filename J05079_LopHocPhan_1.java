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

class HocPhan implements Comparable<HocPhan> {
    private String maMon, tenMon, nhom, giangVien;
    
    public HocPhan(String s1, String s2, String s3, String s4) {
        this.maMon = s1;
        this.tenMon = s2;
        this.nhom = s3;
        this.giangVien = s4;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getMaMon() {
        return maMon;
    }
    
    @Override
    public String toString() {
        return nhom + " " + giangVien;
    }
    
    @Override
    public int compareTo(HocPhan o) {
        return this.nhom.compareTo(o.nhom);
    }
}

public class J05079_LopHocPhan_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<HocPhan> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new HocPhan(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        int m = Integer.parseInt(in.nextLine());
        for(int i = 0; i < m; i++) {
            String str = in.next();
            for(HocPhan it : arr) {
                if(it.getMaMon().equals(str)) {
                    System.out.println("Danh sach nhom lop mon " + it.getTenMon() + ":");
                    break;
                }
            }
            for(HocPhan it : arr) {
                if(it.getMaMon().equals(str)) {
                    System.out.println(it);
                }
            }
        }
    }
}
