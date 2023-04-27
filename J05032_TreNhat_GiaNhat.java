/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class People implements Comparable<People> {
    private String name, date;
    public People(String name, String date) {
        this.name = name;
        this.date = date;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(People o) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date o1 = simpleDateFormat.parse(this.date);
            Date o2 = simpleDateFormat.parse(o.date);
            long diff = o1.getTime() - o2.getTime();
            if(diff < 0) return -1;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}

public class J05032_TreNhat_GiaNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<People> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new People(in.next(), in.next()));
        }
        Collections.sort(arr);
        System.out.println(arr.get(n - 1));
        System.out.println(arr.get(0));
    }
}