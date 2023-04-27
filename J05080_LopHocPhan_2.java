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

class LopHocPhan implements Comparable<LopHocPhan> {
    private String maMon, tenMon, nhom, giangVien;

    public LopHocPhan(String maMon, String tenMon, String nhom, String giangVien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhom = nhom;
        this.giangVien = giangVien;
    }

    public String getGiangVien() {
        return giangVien;
    }
    
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + nhom;
    }
    
    @Override
    public int compareTo(LopHocPhan o) {
        if(this.maMon.compareTo(o.maMon) > 0) return 1;
        if(this.maMon.compareTo(o.maMon) < 0) return -1;
        else
            return this.nhom.compareTo(o.nhom);
    }
}

public class J05080_LopHocPhan_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<LopHocPhan> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new LopHocPhan(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        int m = Integer.parseInt(in.nextLine());
        while(m-- > 0) {
            String str = in.nextLine();
            System.out.println("Danh sach cho giang vien " + str + ":");
            for(LopHocPhan it : arr) {
                if(it.getGiangVien().equals(str)) {
                    System.out.println(it);
                }
            }
        }
    }
}