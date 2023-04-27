/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Racing implements Comparable<Racing> {
    private String id, name, address, endTime;
    private int speed, time;
    
    public Racing(String name, String address, String endTime) {
        this.name = name;
        this.address = address;
        this.endTime = endTime;
        this.id = "";
        String tmp = address + name;
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z') {
                this.id += tmp.charAt(i);
            }
        }
        DateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        long diff = 0;
        try {
            String start = "6:00";
            String end = this.endTime;
            Date date1 = (Date)simpleDateFormat.parse(start);
            Date date2 = (Date)simpleDateFormat.parse(end);
            diff = (long)(date2.getTime() - date1.getTime());
            diff /= (long)(60 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.time = (int)diff;
        String s = String.format("%.0f", (double)120 * 60 / this.time);
        this.speed = Integer.parseInt(s);
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + speed + " Km/h";
    }
    
    @Override
    public int compareTo(Racing o) {
        if(this.time > o.time) return 1;
        return -1;
    }
}

public class J05015_DuaXeDap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Racing> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(new Racing(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(Racing it : arr) {
            System.out.println(it);
        }
    }
}