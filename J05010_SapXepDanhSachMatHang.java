/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class MatHang1 implements Comparable<MatHang1> {
    private String ten, nhom;
    private double giaMua, giaBan, loiNhuan;
    private int stt;
    public MatHang1(int stt, String ten, String nhom, double giaMua, double giaBan) {
        this.stt = stt;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    @Override
    public String toString() {
        return stt + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
    @Override
    public int compareTo(MatHang1 o) {
        if(this.loiNhuan > o.loiNhuan) return -1;
        if(this.loiNhuan < o.loiNhuan) return 1;
        return 0;
    }
}

public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<MatHang1> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            MatHang1 tmp = new MatHang1(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(MatHang1 it : arr) {
            System.out.println(it);
        }
    }
}