/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student_2 {
    private String id, name, date, classRoom;
    private double gpa;
    public Student_2(int stt, String name, String classRoom, String date, double gpa) {
        if(stt < 10) this.id = "B20DCCN00" + stt;
        else this.id = "B20DCCN0" + stt;
        this.name = formatName(name);
        this.classRoom = classRoom;
        if(date.charAt(1) == '/')
            date = '0' + date;
        if(date.charAt(4) == '/')
            date = date.substring(0, 3) + '0' + date.substring(3);
        this.date = date;
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
    @Override
    public String toString() {
        return id + " " + name + " " + classRoom + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class J05004_DanhSachDoiTuongSinhVien_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student_2 st = new Student_2(i, in.nextLine(), in.next(), in.next(), in.nextDouble());
            System.out.println(st);
        }
    }
}
