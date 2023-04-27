/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class SinhVien_4 {
    private String id, name, classroom, email;
    public SinhVien_4(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }
    public String getClassroom() {
        return classroom;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + classroom + " " + email;
    }
}

public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien_4> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            SinhVien_4 tmp = new SinhVien_4(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        int Q = in.nextInt();
        in.nextLine();
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0; i < Q; i++) {
            String tmp = in.next();
            a.add(tmp);
        }
        for(String x : a) {
            System.out.println("DANH SACH SINH VIEN KHOA " + x + ":");
            for(SinhVien_4 it : arr) {
                if(it.getClassroom().substring(1, 3).equals(x.substring(2, 4))) {
                    System.out.println(it);
                }
            }
        }
    }
}
