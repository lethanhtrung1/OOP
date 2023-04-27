/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class StudentPtit implements Comparable<StudentPtit> {
    private String name, start, end;
    
    public StudentPtit(String s1, String s2, String s3) {
        super();
        this.name = s1;
        this.start = s2;
        this.end = s3;
    }
    
    public long getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime s = LocalDateTime.parse(start, dtf);
        LocalDateTime e = LocalDateTime.parse(end, dtf);
        
        return ChronoUnit.MINUTES.between(s, e);
    }
    
    @Override
    public String toString() {
        return name + " " + getTime();
    }
    
    @Override
    public int compareTo(StudentPtit o) {
        if(this.getTime() < o.getTime()) return 1;
        if(this.getTime() > o.getTime()) return -1;
        else {
            return this.name.compareTo(o.name);
        }
    }
}

public class J07084_ThoiGianONLINELienTuc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<StudentPtit> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new StudentPtit(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(StudentPtit it: arr) {
            System.out.println(it);
        }
    }
}
