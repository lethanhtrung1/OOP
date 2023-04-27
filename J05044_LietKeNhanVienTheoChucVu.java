/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class NhanVien44 {
    private String ma, ten, chucVu;
    private int phuCap, luongChinh, tamUng, conLai;
    public NhanVien44(int stt, String ten, String chucVu, int luongCoBan, int soNgay) {
        if(stt < 10) this.ma = "NV0" + stt;
        else this.ma = "NV" + stt;
        this.ten = ten;
        this.chucVu = chucVu;
        if(chucVu.equals("GD")) this.phuCap = 500;
        else if(chucVu.equals("PGD")) this.phuCap = 400;
        else if(chucVu.equals("TP")) this.phuCap = 300;
        else if(chucVu.equals("KT")) this.phuCap = 250;
        else this.phuCap = 100;
        this.luongChinh = luongCoBan * soNgay;
        if((int)((double)(this.phuCap + this.luongChinh) * 2 / 3) < 25000) {
            this.tamUng = (int)Math.round((double)(this.phuCap + this.luongChinh) * 2 / 3 / 1000) * 1000;
        } else {
            this.tamUng = 25000;
        }
        this.conLai = this.luongChinh - this.tamUng + this.phuCap;
    }
    public String getChucVu() {
        return chucVu;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai;
    }
}

public class J05044_LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);     
        int n = in.nextInt();
        HashMap<String, ArrayList<NhanVien44>> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            NhanVien44 tmp = new NhanVien44(i, in.nextLine(), in.next(), in.nextInt(), in.nextInt());
            if(!map.containsKey(tmp.getChucVu())) {
                map.put(tmp.getChucVu(), new ArrayList<>());
            }
            map.get(tmp.getChucVu()).add(tmp);
        }
        in.nextLine();
        String str = in.next();
        for(NhanVien44 it : map.get(str)) {
            System.out.println(it);
        }
    }
}