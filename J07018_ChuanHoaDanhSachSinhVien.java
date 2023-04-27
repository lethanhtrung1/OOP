/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Student {
    private String name, class_id, id;
    private Date date;
    private double gpa;
    
    public Student(int stt, String s1, String s2, String s3, double gpa) throws ParseException {
        if(stt < 10) this.id = "B20DCCN00" + stt;
        else if(stt < 100) this.id = "B20DCCN0" + stt;
        else this.id = "B20DCCN" + stt;
        this.name = formatName(s1);
        this.class_id = s2;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(s3);
        this.gpa = gpa;
    }
    
    private String formatName(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + class_id + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}

public class J07018_ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new Student(i, in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine())));
        }
        for(Student it : arr) {
            System.out.println(it);
        }
    }
}
