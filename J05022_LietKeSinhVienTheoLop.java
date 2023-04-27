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

class SinhVien_3 {
    private String id, name, classroom, email;
    public SinhVien_3(String id, String name, String classroom, String email) {
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

public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien_3> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            SinhVien_3 tmp = new SinhVien_3(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        int Q = in.nextInt();
        in.nextLine();
        ArrayList<String> listClass = new ArrayList<>();
        for(int i = 0; i < Q; i++) {
            String tmp = in.next();
            listClass.add(tmp);
        }
        for(String x : listClass) {
            System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
            for(SinhVien_3 it : arr) {
                if(it.getClassroom().equals(x)) {
                    System.out.println(it);
                }
            }
        }
    }
}