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

class Student1 implements Comparable<Student1> {
    private String id, name, class_id, email, company;
    private int stt;
    public Student1(int stt, String id, String name, String class_id, String email, String company) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.email = email;
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
    @Override
    public String toString() {
        return stt + " " + id + " " + name + " " + class_id + " " + email + " " + company;
    }
    @Override
    public int compareTo(Student1 o) {
        if(this.name.compareTo(o.name) < 0) return -1;
        if(this.name.compareTo(o.name) > 0) return 1;
        return 0;
    }
}

public class J05034_DanhSachThucTap_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, ArrayList<Student1>> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            Student1 tmp = new Student1(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            if(map.containsKey(tmp.getCompany())) {
                map.get(tmp.getCompany()).add(tmp);
            }
            else {
                map.put(tmp.getCompany(), new ArrayList<>());
                map.get(tmp.getCompany()).add(tmp);
            }
        }
        for(String x : map.keySet()) {
            Collections.sort(map.get(x));
        }
        int q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < q; i++) {
            String str = in.next();
            for(Student1 it : map.get(str)) {
                System.out.println(it);
            }
        }
    }
}