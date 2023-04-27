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

class TienDien {
    private String maKH;
    private long heSo, thanhTien, phuTroi, tongTien;
    public TienDien(int stt, String loaiSD, int soCu, int soMoi) {
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
}

public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<TienDien> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new TienDien(i, in.nextLine(), in.nextInt(), in.nextInt()));
        }
        for(TienDien it : arr) {
            System.out.println(it);
        }
    }
}
