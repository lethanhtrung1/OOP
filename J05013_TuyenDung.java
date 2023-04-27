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

class ThiSinh implements Comparable<ThiSinh> {
    private String maTS, hoTen, ketQua;
    private double diemTB;
    
    public ThiSinh(int stt, String s1, double n1, double n2) {
        if(stt < 10) this.maTS = "TS0" + stt;
        else this.maTS = "TS" + stt;
        this.hoTen = s1;
        if(n1 > 10) n1 /= 10;
        if(n2 > 10) n2 /= 10;
        this.diemTB = (n1 + n2) / 2;
        if(this.diemTB > 9.5) this.ketQua = "XUAT SAC";
        else if(this.diemTB >= 8) this.ketQua = "DAT";
        else if(this.diemTB > 5) this.ketQua = "CAN NHAC";
        else this.ketQua = "TRUOT";
    }
    
    @Override
    public String toString() {
        return maTS + " " + hoTen + " " + String.format("%.2f", diemTB) + " " + ketQua;
    }
    
    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemTB > o.diemTB) return -1;
        else if(this.diemTB < o.diemTB) return 1;
        else return 0;
    }
}

public class J05013_TuyenDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new ThiSinh(i, in.nextLine(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(arr);
        for(ThiSinh it : arr) {
            System.out.println(it);
        }
    }
}