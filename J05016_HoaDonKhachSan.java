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

class Customer2 implements Comparable<Customer2> {
    private String id, name, room;
    private Date dateStart, dateEnd;
    private int service, day, price;
    
    public Customer2(int stt, String name, String room, String s1, String s2, int n) {
        if(stt < 10) this.id = "KH0" + stt;
        else this.id = "KH" + stt;
        this.name = name;
        this.room = room;
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date start = simpleDateFormat.parse(s1);
            Date end = simpleDateFormat.parse(s2);
            long diff = end.getTime() - start.getTime();
            this.day = Math.round(diff / (1000 * 60 * 60 * 24)) + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.service = n;
        if(room.charAt(0) == '1') this.price = 25 * this.day + this.service;
        else if(room.charAt(0) == '2') this.price = 34 * this.day + this.service;
        else if(room.charAt(0) == '3') this.price = 50 * this.day + this.service;
        else this.price = 80 * this.day + this.service;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + day + " " + price;
    }
    
    @Override
    public int compareTo(Customer2 o) {
        if(this.price > o.price) return -1;
        else if(this.price < o.price) return 1;
        else return 0;
    }
}

public class J05016_HoaDonKhachSan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Customer2> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new Customer2(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(arr);
        for(Customer2 it : arr) {
            System.out.println(it);
        }
    }
}