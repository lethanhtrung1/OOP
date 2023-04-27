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

class Student8 {
    private String studentId, name, phoneNumber;
    private int groupId;
    
    public Student8(String studentId, String name, String phoneNumber, int groupId) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }
    
    @Override
    public String toString() {
        return studentId + " " + name + " " + phoneNumber;
    }
}

public class J06003_QuanLyBaiTapNhom_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        ArrayList<Student8> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr1.add(new Student8(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        for(int i = 1; i <= m; i++) {
            arr2.add(in.nextLine());
        }
        int Q = in.nextInt();
        for(int i = 1; i <= Q; i++) {
            System.out.println("DANH SACH NHOM " + i + ":");
            for(Student8 it : arr1) {
                if(it.getGroupId() == i) {
                    System.out.println(it);
                }
            }
            System.out.println("Bai tap dang ky: " + arr2.get(i - 1));
        }
    }
}
