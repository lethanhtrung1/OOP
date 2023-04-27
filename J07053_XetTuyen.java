/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student53 {
    private String id, name, classify;
    private int age, point;
    public Student53(int stt, String name, String date, double p1, double p2) {
        if(stt < 10) this.id = "PH0" + stt;
        else this.id = "PH" + stt;
        this.name = format(name);
        double p = 0f;
        if(p1 >= 8f && p2 >= 8f) p = 1;
        else if(p1 >= 7.5f && p2 >= 7.5f) p = 0.5f;
        int pt = (int) Math.round((p1 + p2) / 2 + p);
        if(pt > 10) pt = 10;
        this.point = pt;
        this.age = 2021 - Integer.parseInt(date.substring(date.length() - 4, date.length()));
        if(this.point == 9 || this.point == 10) this.classify = "Xuat sac";
        else if(this.point == 8) this.classify = "Gioi";
        else if(this.point == 7) this.classify = "Kha";
        else if(this.point == 5 || this.point == 6) this.classify = "Trung binh";
        else this.classify = "Truot";
    }
    private String format(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + point + " " + classify;
    }
}

public class J07053_XetTuyen {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int n = in.nextInt();
        ArrayList<Student53> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student53 tmp = new Student53(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        for(Student53 it : arr) {
            System.out.println(it);
        }
    }
}
