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

class Student_00 implements Comparable<Student_00> {
    private String id, name, class_id;
    private double point1, point2, point3;
    public Student_00(String id, String name, String class_id, double p1, double p2, double p3) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + class_id + " " + point1 + " " + point2 + " " + point3;
    }
    @Override
    public int compareTo(Student_00 o) {
        if(this.id.compareTo(o.id) < 0) return -1;
        if(this.id.compareTo(o.id) > 0) return 1;
        return 0;
    }
}

public class J05030_BangDiemThanhPhan_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student_00> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            in.nextLine();
            Student_00 tmp = new Student_00(in.nextLine(), in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.println(i + 1 + " " + arr.get(i));
        }
    }
}