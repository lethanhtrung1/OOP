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

class MatHang_ implements Comparable<MatHang_> {
    private String id, name, unit;
    private long transport, total, price;
    public MatHang_(int index, String name, String unit, long n, long m) {
        if(index < 10) this.id = "MH0" + index;
        else this.id = "MH" + index;
        this.name = name;
        this.unit = unit;
        this.transport = (long) Math.ceil((double)(n * m) * 5 / 100);
        this.total = (long) Math.ceil((double)(n * m) + this.transport);
        this.price = (long) Math.ceil((this.total + (double)this.total * 2 / 100) / m / 100) * 100;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + transport + " " + total + " " + price;
    }
    @Override
    public int compareTo(MatHang_ o) {
        if(this.price > o.price) return -1;
        if(this.price < o.price) return 1;
        return 0;
    }
}

public class J05037_TinhGiaBan_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<MatHang_> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            MatHang_ tmp = new MatHang_(i, in.nextLine(), in.nextLine(), in.nextLong(), in.nextLong());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(MatHang_ it : arr) {
            System.out.println(it);
        }
    }
}