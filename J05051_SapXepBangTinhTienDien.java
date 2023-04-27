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

class TienDien1 implements Comparable<TienDien1> {
    private String maKH;
    private long heSo, thanhTien, phuTroi, tongTien;
    public TienDien1(int stt, String loaiSD, int soCu, int soMoi) {
        if(stt < 10) this.maKH = "KH0" + stt;
        else this.maKH = "KH" + stt;
        if(loaiSD.equals("KD")) this.heSo = 3;
        else if(loaiSD.equals("NN")) this.heSo = 5;
        else if(loaiSD.equals("TT")) this.heSo = 4;
        else this.heSo = 2;
        this.thanhTien = (soMoi - soCu) * this.heSo * 550;
        if(soMoi - soCu < 50)
            this.phuTroi = 0;
        else if(soMoi - soCu >= 50 && soMoi - soCu <= 100)
            this.phuTroi = (long) Math.round((double)this.thanhTien * 35 / 100);
        else
            this.phuTroi = this.thanhTien;
        this.tongTien = this.phuTroi + this.thanhTien;
    }
    @Override
    public String toString() {
        return maKH + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tongTien;
    }
    @Override
    public int compareTo(TienDien1 o) {
        if(this.tongTien > o.tongTien) return -1;
        if(this.tongTien < o.tongTien) return 1;
        return 0;
    }
}

public class J05051_SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<TienDien1> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new TienDien1(i, in.nextLine(), in.nextInt(), in.nextInt()));
        }
        Collections.sort(arr);
        for(TienDien1 it : arr) {
            System.out.println(it);
        }
    }    
}
