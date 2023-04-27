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

class PhanSo {
    private long tu, mau;
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    private PhanSo lowest() {
        long g = gcd(tu, mau);
        PhanSo tmp = new PhanSo(tu / g, mau / g);
        return tmp;
    }
    public static PhanSo add(PhanSo a, PhanSo b) {
        PhanSo res = new PhanSo(a.tu * b.mau + b.tu * a.mau, a.mau * b.mau);
        return res.lowest();
    }
    public static PhanSo mul(PhanSo a, PhanSo b) {
        PhanSo c = new PhanSo(a.tu * b.tu, a.mau * b.mau);
        return c.lowest();
    }
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            PhanSo a = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo b = new PhanSo(in.nextLong(), in.nextLong());
            PhanSo c = PhanSo.add(a, b);
            PhanSo res = PhanSo.mul(c, c);
            System.out.println(res + " " + PhanSo.mul(PhanSo.mul(a, b), res));
        }
    }
}
