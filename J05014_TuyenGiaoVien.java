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

class GiaoVien implements Comparable<GiaoVien> {
    private String maGV, hoTen, viTri, ketQua;
    private double tongDiem;
    
    public GiaoVien(int stt, String s1, String s2, double n1, double n2) {
        if(stt < 10) this.maGV = "GV0" + stt;
        else this.maGV = "GV" + stt;
        this.hoTen = s1;
        this.tongDiem = n1 * 2 + n2;
        if(s2.substring(0, 1).equals("A")) this.viTri = "TOAN";
        else if(s2.substring(0, 1).equals("B")) this.viTri = "LY";
        else this.viTri = "HOA";
        if(s2.substring(1, 2).equals("1")) this.tongDiem += 2;
        else if(s2.substring(1, 2).equals("2")) this.tongDiem += 1.5;
        else if(s2.substring(1, 2).equals("3")) this.tongDiem += 1;
        else this.tongDiem += 0;
        if(this.tongDiem >= 18) this.ketQua = "TRUNG TUYEN";
        else this.ketQua = "LOAI";
    }
    
    @Override
    public String toString() {
        return maGV + " " + hoTen + " " + viTri + " " +  String.format("%.1f", tongDiem) + " " + ketQua;
   }
    
    @Override
    public int compareTo(GiaoVien o) {
        if(this.tongDiem > o.tongDiem) return -1;
        else if(this.tongDiem < o.tongDiem) return 1;
        else return this.hoTen.compareTo(o.hoTen);
    }
}

public class J05014_TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         ArrayList<GiaoVien> arr = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new GiaoVien(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(arr);
        for(GiaoVien it : arr) {
            System.out.println(it);
        }
    }
}