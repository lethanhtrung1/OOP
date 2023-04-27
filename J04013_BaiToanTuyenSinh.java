/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class TuyenSinh {
    private String ma, ten;
    private double diemToan, diemLy, diemHoa, diemUuTien, tongDiem;
    public TuyenSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        if(ma.substring(0, 3).equals("KV1"))
            this.diemUuTien = 0.5;
        else if(ma.substring(0, 3).equals("KV2"))
            this.diemUuTien = 1;
        else
            this.diemUuTien = 2.5;
        this.tongDiem = diemToan * 2 + diemLy + diemHoa;
    }
    public double getTongDiem() {
        return tongDiem;
    }
    public double getDiemUuTien() {
        return diemUuTien;
    }
    private String format(double number) {
        if(number == (int)number)
            return String.valueOf((int)number);
        return String.valueOf(number);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + format(diemUuTien) + " " + format(tongDiem);
    }
}

public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TuyenSinh a = new TuyenSinh(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        if(a.getTongDiem() + a.getDiemUuTien() >= 24) {
            System.out.println(a + " " + "TRUNG TUYEN");
        }
        else {
            System.out.println(a + " " + "TRUOT");
        }
    }
}