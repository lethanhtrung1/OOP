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

class Student_11 implements Comparable<Student_11> {
    private String id, name;
    private int amount;
    public Student_11(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + amount;
    }
    @Override
    public int compareTo(Student_11 o) {
        if(this.amount > o.amount) return -1;
        else if(this.amount < o.amount) return 1;
        else {
            if(this.id.compareTo(o.id) < 0) return -1;
            if(this.id.compareTo(o.id) > 0) return 1;
            return 0;
        }
    }
}

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student_11> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Student_11 tmp = new Student_11(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            arr.add(tmp);
        }
        Collections.sort(arr);
        int q = in.nextInt();
        for(int i = 0; i < q; i++) {
            int min = in.nextInt();
            int max = in.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", min, max);
            for(Student_11 it : arr) {
                if(it.getAmount() >= min && it.getAmount() <= max) {
                    System.out.println(it);
                }
            }
        }
    }
}
