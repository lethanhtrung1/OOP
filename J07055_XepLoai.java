/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student55 implements Comparable<Student55> {
    private String id, name, classify;
    private double point;
    public Student55(int stt, String name, int p1, int p2, int p3) {
        if(stt < 10) this.id = "SV0" + stt;
        else this.id = "SV" + stt;
        this.name = format(name);
        this.point = (double)(p1 * 0.25f + p2 * 0.35f + p3 * 0.4f);
        if(this.point >= 8f) this.classify = "GIOI";
        else if(this.point >= 6.5f) this.classify = "KHA";
        else if(this.point >= 5f) this.classify = "TRUNG BINH";
        else this.classify = "KEM";
    }
    private String format(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            res.append(Character.toUpperCase(temp.charAt(0)));
            for(int i = 1; i < temp.length(); i++) {
                res.append(Character.toLowerCase(temp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", point) + " " + classify;
    }
    @Override
    public int compareTo(Student55 o) {
        if(this.point > o.point) return -1;
        if(this.point < o.point) return 1;
        return 0;
    }
}

public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = in.nextInt();
        ArrayList<Student55> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student55 tmp = new Student55(i, in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(Student55 it : arr) {
            System.out.println(it);
        }
    }
}
