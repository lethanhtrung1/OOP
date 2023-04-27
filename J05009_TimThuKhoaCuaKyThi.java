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

class ThuKhoa implements Comparable<ThuKhoa> {
    private int stt;
    private String name, date;
    private double point1, point2, point3, point;
    public ThuKhoa(int stt, String name, String date, double point1, double point2, double point3) {
        this.stt = stt;
        this.name = name;
        this.date = date;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point = point1 + point2 + point3;
    }
    public double getPoint() {
        return point;
    }
    @Override
    public String toString() {
        return stt + " " + name + " " + date + " " + String.format("%.1f", point);
    }
    @Override
    public int compareTo(ThuKhoa o) {
        if(this.point > o.point) return -1;
        if(this.point < o.point) return 1;
        return 0;
    }
}

public class J05009_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ThuKhoa> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            ThuKhoa tmp = new ThuKhoa(i, in.nextLine(), in.next(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        Collections.sort(arr);
        double highest = arr.get(0).getPoint();
        for(ThuKhoa it : arr) {
            if(it.getPoint() == highest) {
                System.out.println(it);
            }
        }
    }
}