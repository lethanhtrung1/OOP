/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student_3 implements Comparable<Student_3> {
    private String id, name, date, classroom;
    private double gpa;
    public Student_3(int stt, String name, String classroom, String date, double gpa) {
        if(stt < 10) this.id = "B20DCCN00" + stt;
        else this.id = "B20DCCN0" + stt;
        this.name = formatName(name);
        this.classroom = classroom;
        this.date = formatDate(date);
        this.gpa = gpa;
    }
    private String formatName(String s) {
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
    private String formatDate(String s) {
        if(s.charAt(1) == '/')
            s = '0' + s;
        if(s.charAt(4) == '/')
            s = s.substring(0, 3) + '0' + s.substring(3);
        return s;
    }
    @Override
    public int compareTo(Student_3 o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return 0;
    } 
    @Override
    public String toString() {
        return id + " " + name + " " + classroom + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class J05005_DanhSachDoiTuongSinhVien_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student_3> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student_3 tmp = new Student_3(i, in.nextLine(), in.next(), in.next(), in.nextDouble());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(Student_3 it : arr) {
            System.out.println(it);
        }
    }
}