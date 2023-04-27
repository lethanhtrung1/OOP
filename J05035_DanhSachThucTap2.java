/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */

class Student2 implements Comparable<Student2> {
    private String id, name, class_id, email, company;
    private int stt;
    public Student2(int stt, String id, String name, String class_id, String email, String company) {
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
    public int compareTo(Student2 o) {
        if(this.id.compareTo(o.id) < 0) return -1;
        if(this.id.compareTo(o.id) > 0) return 1;
        return 0;
    }
}

public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        HashMap<String, ArrayList<Student2>> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            Student2 tmp = new Student2(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            if(map.containsKey(tmp.getCompany())) {
                map.get(tmp.getCompany()).add(tmp);
            } else {
                map.put(tmp.getCompany(), new ArrayList<>());
                map.get(tmp.getCompany()).add(tmp);
            }
        }
        for(String x : map.keySet()) {
            Collections.sort(map.get(x));
        }
        int q = Integer.parseInt(in.nextLine());
        for(int i = 0; i < q; i++) {
            String str = in.next();
            for(Student2 it : map.get(str)) {
                System.out.println(it);
            }
        }
    }
}
