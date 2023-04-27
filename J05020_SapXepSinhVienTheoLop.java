/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class SinhVien implements Comparable<SinhVien> {
    private String id, name, classroom, email;
    public SinhVien(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + classroom + " " + email;
    }
    @Override
    public int compareTo(SinhVien o) {
        if(this.id.compareTo(o.id) < 0) return -1;
        if(this.id.compareTo(o.id) > 0) return 1;
        return 0;
    }
}

public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            SinhVien tmp = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(SinhVien it : arr) {
            System.out.println(it);
        }
    }
}
