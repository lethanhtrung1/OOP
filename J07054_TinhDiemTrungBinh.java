/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student54 implements Comparable<Student54> {
    private String id, name;
    private double point;
    public Student54(int stt, String name, int p1, int p2, int p3) {
        if(stt < 10) this.id = "SV0" + stt;
        else this.id = "SV" + stt;
        this.name = format(name);
        this.point = (double)(p1 * 3 + p2 * 3 + p3 * 2) / 8;
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
    public double getPoint() {
        return point;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", point) + " ";
    }
    @Override
    public int compareTo(Student54 o) {
        if(this.point == o.point)
            return this.id.compareTo(o.id);
        return Double.compare(o.point, this.point);
    }
}

public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int n = in.nextInt();
        ArrayList<Student54> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student54 tmp = new Student54(i, in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        int rank = 1, count = 1;
        System.out.println(arr.get(0).toString() + "1");
        for(int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if(arr.get(i-1).getPoint() == arr.get(i).getPoint()) {
                System.out.println(rank);
                count++;
            } else {
                rank += count;
                count = 1;
                System.out.println(rank);
            }
        }
    }
}