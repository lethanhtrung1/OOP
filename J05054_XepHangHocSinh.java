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

class Student_54 {
    private String id, name, classify;
    private double point;
    private int rank;
    public Student_54(int stt, String name, double point) {
        if(stt < 10) this.id = "HS0" + stt;
        else this.id = "HS" + stt;
        this.name = name;
        this.point = point;
        if(this.point >= 9f) this.classify = "Gioi";
        else if(this.point >= 7f) this.classify = "Kha";
        else if(this.point >= 5f) this.classify = "Trung Binh";
        else this.classify = "Yeu";
    }
    public String getId() {
        return id;
    }
    public double getPoint() {
        return point;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + point + " " + classify + " " + rank;
    }
}

public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student_54> arr = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new Student_54(i, in.nextLine(), in.nextDouble()));
        }
        Collections.sort(arr, new Comparator<Student_54>() {
            @Override
            public int compare(Student_54 o1, Student_54 o2) {
                if(o1.getPoint() < o2.getPoint())
                    return 1;
                if(o1.getPoint() == o2.getPoint())
                    return 0;
                return -1;
            }
        });
        int rank = 0, count = 1;
        double curr = -1f;
        for(Student_54 it : arr) {
            if(it.getPoint() == curr) {
                count++;
            } else {
                rank += count;
                count = 1;
            }
            it.setRank(rank);
            curr = it.getPoint();
        }
        Collections.sort(arr, new Comparator<Student_54>() {
            @Override
            public int compare(Student_54 o1, Student_54 o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Student_54 it : arr) {
            System.out.println(it);
        }
    }
}