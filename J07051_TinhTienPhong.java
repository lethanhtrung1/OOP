/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author TRUNG
 */

class KhachHang1 implements Comparable<KhachHang1> {
    private String id, name, room;
    private long price, day;
    public KhachHang1(int stt, String name, String room, String start, String end, int exp) {
        if(stt < 10) this.id = "KH0" + stt;
        else this.id = "KH" + stt;
        this.name = formatName(name);
        this.room = room;
        if(start.charAt(1) == '/') start = "0" + start;
        if(start.charAt(4) == '/') start = start.substring(0, 3) + "0" + start.substring(3);
        if(end.charAt(1) == '/') end = "0" + end;
        if(end.charAt(4) == '/') end = end.substring(0, 3) + "0" + end.substring(3);
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date s = formatter.parse(start);
            Date e = formatter.parse(end);
            this.day = ((e.getTime() - s.getTime()) / (24 * 3600 * 1000)) + 1; 
        } catch(Exception e) {
            e.printStackTrace();
        }
        int p;
        if(this.room.charAt(0) == '1') p = 25;
        else if(this.room.charAt(0) == '2') p = 34;
        else if(this.room.charAt(0) == '3') p = 50;
        else p = 80;
        this.price = p * this.day + exp;
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
        return id + " " + name + " " + room + " " + day + " " + price;
    }
    @Override
    public int compareTo(KhachHang1 o) {
        if(this.price > o.price) return -1;
        if(this.price < o.price) return 1;
        return 0;
    }
}

public class J07051_TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int n = in.nextInt();
        ArrayList<KhachHang1> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            KhachHang1 tmp = new KhachHang1(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(KhachHang1 it : arr) {
            System.out.println(it);
        }
    }
}
