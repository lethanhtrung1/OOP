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
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class TienDien2 implements Comparable<TienDien2> {
    private String maKH, hoTen;
    private int tienTrongDinhMuc, tienVuotDinhMuc, thue, tongTien;
    public TienDien2(int stt, String hoTen, char loaiHo, int soDau, int soCuoi) {
        if(stt < 10) this.maKH = "KH0" + stt;
        else this.maKH = "KH" + stt;
        this.hoTen = format(hoTen);
        int dinhMuc;
        if(loaiHo == 'A') dinhMuc = 100;
        else if(loaiHo == 'B') dinhMuc = 500;
        else dinhMuc = 200;
        if(soCuoi - soDau < dinhMuc)
            this.tienTrongDinhMuc = (soCuoi - soDau) * 450;
        else
            this.tienTrongDinhMuc = dinhMuc * 450;
        if(soCuoi - soDau > dinhMuc)
            this.tienVuotDinhMuc = (soCuoi - soDau - dinhMuc) * 1000;
        else
            this.tienVuotDinhMuc = 0;
        this.thue = this.tienVuotDinhMuc * 5 / 100;
        this.tongTien = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.thue;
    }
    private String format(String s) {
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
    @Override
    public String toString() {
        return maKH + " " + hoTen + " " + tienTrongDinhMuc + " " + tienVuotDinhMuc + " " + thue + " " + tongTien;
    }
    @Override
    public int compareTo(TienDien2 o) {
        return o.tongTien - this.tongTien;
    }
}

public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int n = in.nextInt();
        ArrayList<TienDien2> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new TienDien2(i, in.nextLine(), in.next().charAt(0), in.nextInt(), in.nextInt()));
        }
        Collections.sort(arr);
        for(TienDien2 it : arr) {
            System.out.println(it);
        }
    }
}
