/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */

class Student61 implements Comparable<Student61>{
    private String id, name, classify;
    private int age, point;
    public Student61(int i, String name, String s, double p1, double p2) {
        if(i < 10) this.id = "PH0" + i;
        else this.id = "PH" + i;
        this.name = name;
        this.age = 2021 - Integer.parseInt(s.substring(6, s.length()));
        if(p1 >= 8f && p2 >= 8f)
            this.point = (int) Math.round((p1 + p2) / 2 + 1);
        else if(p1 >= 7.5f && p2 >= 7.5f)
            this.point = (int) Math.round((p1 + p2) / 2 + 0.5);
        else
            this.point = (int) Math.round((p1 + p2) / 2);
        if(this.point > 10)
            this.point = 10;
        if(this.point == 9 || this.point == 10)
            this.classify = "Xuat sac";
        else if(this.point == 8)
            this.classify = "Gioi";
        else if(this.point == 7)
            this.classify = "Kha";
        else if(this.point == 5 || this.point == 6)
            this.classify = "Trung binh";
        else
            this.classify = "Truot";
    }
    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + point + " " + classify;
    }
    @Override
    public int compareTo(Student61 o) {
        if(this.point > o.point) return -1;
        else if(this.point == o.point) {
            return this.id.compareTo(o.id);
        }
        return 1;
    }
}

public class J05061_SapXepKetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student61> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new Student61(i, in.nextLine(), in.next(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(arr);
        for(Student61 it : arr) {
            System.out.println(it);
        }
    }
}
