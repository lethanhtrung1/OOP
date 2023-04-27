/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class MatHang_11 {
    private String id, name, unit;
    private long transport,total, price;
    public MatHang_11(int stt, String name, String unit, long n1, long n2) {
        if(stt < 10) this.id = "MH0" + stt;
        else this.id = "MH" + stt;
        this.name = name;
        this.unit = unit;
        this.transport = Math.round((double)(n1 * n2) * 5 / 100);
        this.total = Math.round((double)(n1 * n2) + this.transport);
        this.price = this.total + Math.round((double)this.total * 2 / 100);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + transport + " " + total + " " + price;
    }
}

public class J05036_TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<MatHang_11> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            MatHang_11 tmp = new MatHang_11(i, in.nextLine(), in.nextLine(), in.nextLong(), in.nextLong());
            arr.add(tmp);
        }
        for(MatHang_11 it : arr) {
            System.out.println(it);
        }
    }
}