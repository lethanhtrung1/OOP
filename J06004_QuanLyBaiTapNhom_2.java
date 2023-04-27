/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Group {
    private static HashMap<Integer, String> group = new HashMap<>();
    
    public Group() {
    }

    public static HashMap<Integer, String> getGroup() {
        return group;
    }

    public static void setGroup(int num, String str) {
        group.put(num, str);
    }
}

class Student00 implements Comparable<Student00> {
    private String studentId, name, phoneNumber;
    private int groupId;
    private Group group;
    
    public Student00(String s1, String s2, String s3, int n) {
        this.studentId = s1;
        this.name = s2;
        this.phoneNumber = s3;
        this.groupId = n;
        this.group = new Group();
    }

    public int getGroupId() {
        return groupId;
    }
    
    @Override
    public int compareTo(Student00 o) {
        return this.studentId.compareTo(o.studentId);
    }
    @Override
    public String toString() {
        return studentId + " " + name + " " + phoneNumber + " " + groupId + " " + Group.getGroup().get(groupId);
    }
 }

public class J06004_QuanLyBaiTapNhom_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        ArrayList<Student00> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new Student00(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        for(int i = 0; i < m; i++) {
            Group.setGroup(i + 1, in.nextLine());
        }
        Collections.sort(arr);
        for(Student00 it : arr) {
            System.out.println(it);
        }
    }
}
