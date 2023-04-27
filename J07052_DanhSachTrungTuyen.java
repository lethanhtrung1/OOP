/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class ThiSinh implements Comparable<ThiSinh> {
    private String ma, ten;
    private double diemToan, diemLy, diemHoa, diemUuTien, diemXetTuyen;
    public ThiSinh(String ma, String ten, double d1, double d2, double d3) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.diemToan = d1;
        this.diemLy = d2;
        this.diemHoa = d3;
        if(this.ma.substring(0, 3).equals("KV1"))
            this.diemUuTien = 0.5;
        else if(this.ma.substring(0, 3).equals("KV2"))
            this.diemUuTien = 1;
        else
            this.diemUuTien = 2.5;
        this.diemXetTuyen = this.diemToan * 2 + this.diemLy + this.diemHoa + this.diemUuTien;
    }
    private String chuanHoa(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    private String format(double n) {
        if(n == (int) n)
            return String.valueOf((int)n);
        return String.valueOf(n);
    }
    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + format(diemUuTien) + " " + format(diemXetTuyen);
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemXetTuyen > o.diemXetTuyen) return -1;
        if(this.diemXetTuyen < o.diemXetTuyen) return 1;
        return 0;
    }
}

public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = in.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        while(n-->0) {
            in.nextLine();
            ThiSinh tmp = new ThiSinh(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        int chiTieu = in.nextInt();
        int i = 0;
        double diemChuan = 0;
        Collections.sort(arr);
        while(chiTieu-->0) {
            diemChuan = arr.get(i++).getDiemXetTuyen();
        }
        System.out.println(diemChuan);
        for(ThiSinh it : arr) {
            if(it.getDiemXetTuyen() >= diemChuan) {
                System.out.println(it + " " + "TRUNG TUYEN");
            }
            else {
                System.out.println(it + " " + "TRUOT");
            }
        }
    }
}
