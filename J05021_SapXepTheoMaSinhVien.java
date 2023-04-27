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

class SinhVien_1 implements Comparable<SinhVien_1> {
    private String id, name, classroom, email;
    public SinhVien_1(String id, String name, String classroom, String email) {
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
    public int compareTo(SinhVien_1 o) {
        if(this.id.compareTo(o.id) < 0) return -1;
        if(this.id.compareTo(o.id) > 0) return 1;
        return 0;
    }
}

public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien_1> arr = new ArrayList<>();
        while(in.hasNextLine()) {
            SinhVien_1 tmp = new SinhVien_1(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(SinhVien_1 it : arr) {
            System.out.println(it);
        }
    }
}
