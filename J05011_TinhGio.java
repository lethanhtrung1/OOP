/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.text.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class TinhGio implements Comparable<TinhGio> {
    private String id, name;
    private int hour, minute, totalTime;
    public TinhGio(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        try {
            DateFormat formatter = new SimpleDateFormat("HH:mm");
            Date x = formatter.parse(start);
            Date y = formatter.parse(end);
            long diff = y.getTime() - x.getTime();
            hour = (int)(diff / (3600 * 1000));
            minute = (int)(diff / (60 * 1000)) - 60 * hour;
            totalTime = (int)(diff / 60 * 1000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public int getTotalTime() {
        return totalTime;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + hour + " gio " + minute + " phut";
    }
    @Override
    public int compareTo(TinhGio o) {
        if(this.totalTime > o.totalTime) return -1;
        if(this.totalTime < o.totalTime) return 1;
        return 0;
    }
}

public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<TinhGio> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            TinhGio tmp = new TinhGio(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(TinhGio it : arr) {
            System.out.println(it);
        }
    }
}

