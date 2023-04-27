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

class Student_18 implements Comparable<Student_18> {
    private String id, name, rank;
    private double d;
    public Student_18(int stt, String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        if(stt < 10) this.id = "HS0" + stt;
        else this.id = "HS" + stt;
        this.name = name;
        this.d = Math.round((d1 * 2 + d2 * 2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) * 10.0 / 12) / 10.0;
        if(this.d >= 9f) this.rank = "XUAT SAC";
        else if(this.d >= 8f) this.rank = "GIOI";
        else if(this.d >= 7f) this.rank = "KHA";
        else if(this.d >= 5f) this.rank = "TB";
        else this.rank = "YEU";
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", d) + " " + rank;
    }
    @Override
    public int compareTo(Student_18 o) {
        if(this.d > o.d) return -1;
        else if(this.d == o.d) {
            return this.id.compareTo(o.id);
        }
        return 1;
    }
}

public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student_18> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student_18 tmp = new Student_18(i, in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(Student_18 it : arr) {
            System.out.println(it);
        }
    }
}
