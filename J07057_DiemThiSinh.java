/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class ThiSinh57 implements Comparable<ThiSinh57> {
    private String id, name, state;
    private double point;
    public ThiSinh57(int stt, String name, double p, String ethnic, int area) {
        if(stt < 10) this.id = "TS0" + stt;
        else this.id = "TS" + stt;
        this.name = format(name);
        this.point = p;
        if(area == 1) this.point += 1.5f;
        else if(area == 2) this.point += 1f;
        if(!ethnic.equals("Kinh")) this.point += 1.5f;
        if(this.point >= 20.5f) this.state = "Do";
        else this.state = "Truot";
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
        return id + " " + name + " " + String.format("%.1f", point) + " " + state; 
    }
    @Override
    public int compareTo(ThiSinh57 o) {
        if(this.point == o.point)
            return this.id.compareTo(o.id);
        return Double.compare(o.point, this.point);
    }
}

public class J07057_DiemThiSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = in.nextInt();
        ArrayList<ThiSinh57> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            String ig = in.nextLine();
            String name = in.nextLine();
            double p = in.nextDouble();
            ig = in.nextLine();
            arr.add(new ThiSinh57(i, name, p, in.nextLine(), in.nextInt()));
        }
        Collections.sort(arr);
        for(ThiSinh57 it : arr) {
            System.out.println(it);
        }
    }
}