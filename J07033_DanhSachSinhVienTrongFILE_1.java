/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Student33 {
    private String id, name, lop, email;
    public Student33(String id, String name, String lop, String email) {
        this.id = id;
        this.name = format(name);
        this.lop = lop;
        this.email = email;
    }
    public static String format(String s) {
        ArrayList<String> arr = new ArrayList<>();
        s = s.toLowerCase() + " ";
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                if(temp.compareTo("") != 0) {
                    arr.add(temp);
                    temp = "";
                }
            }
        }
        String res = "";
        for(String it : arr) {
            res += it.substring(0, 1).toUpperCase() + it.substring(1) + " ";
        }
        res = res.trim();
        return res;
    }
//    public static String title(String s) {
//	StringBuilder sb = new StringBuilder(s);
//	sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//	return sb.toString();
//	}
//
//    public static String format(String s) {
//	StringTokenizer st = new StringTokenizer(s);
//	String ans = "";
//	while (st.hasMoreTokens()) {
//            ans += title(st.nextToken().toLowerCase());
//            ans += " ";
//        }
//        return ans;
//    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + email;
    }
}

public class J07033_DanhSachSinhVienTrongFILE_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student33> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new Student33(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
            Collections.sort(arr, new Comparator<Student33>() {
                @Override
                public int compare(Student33 o1, Student33 o2) {
                    return o1.getId().compareTo(o2.getId());
                }               
            });
        }
        for(Student33 it : arr) {
            System.out.println(it);
        }
    }
}
