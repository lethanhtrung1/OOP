/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Student {
    private String id, name, date, classRoom;
    private double gpa;
    public Student(int stt, String name, String classRoom, String date, double gpa) {
        if(stt < 10) this.id = "B20DCCN00" + stt;
        else this.id = "B20DCCN0" + stt;
        this.name = name;
        this.classRoom = classRoom;
        if(date.charAt(1) == '/')
            date = '0' + date;
        if(date.charAt(4) == '/')
            date = date.substring(0, 3) + '0' + date.substring(3);
        this.date = date;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + classRoom + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class J05003_DanhSachDoiTuongSinhVien_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            Student st = new Student(i, in.nextLine(), in.next(), in.next(), in.nextDouble());
            System.out.println(st);
        }
    }
}