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

class Student42 implements Comparable<Student42> {
    private String name;
    private int submit_AC, total_submit;
    public Student42(String name, int submit_AC, int total_submit) {
        this.name = name;
        this.submit_AC = submit_AC;
        this.total_submit = total_submit;
    }
    @Override
    public String toString() {
        return name + " " + submit_AC + " " + total_submit;
    }
    @Override
    public int compareTo(Student42 o) {
        if(this.submit_AC > o.submit_AC) return -1;
        else if(this.submit_AC < o.submit_AC) return 1;
        else {
            if(this.total_submit < o.total_submit) return -1;
            else if(this.total_submit > o.total_submit) return 1;
            else {
                if(this.name.compareTo(o.name) < 0) return -1;
                else if(this.name.compareTo(o.name) > 0) return 1;
                else
                    return 0;
            }
        }
    }
}

public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student42> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            in.nextLine();
            Student42 tmp = new Student42(in.nextLine(), in.nextInt(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(Student42 it : arr) {
            System.out.println(it);
        }
    }
}
