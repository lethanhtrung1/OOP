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
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Customer1 implements Comparable<Customer1> {
    private String id, name, gender, address;
    private Date date;
    
    public Customer1(int stt, String name, String gender, String date, String address) throws ParseException {
        super();
        if(stt < 10) this.id = "KH00" + stt;
        else if(stt < 100) this.id = "KH0" + stt;
        else this.id = "KH" + stt;
        this.name = formatName(name);
        this.gender = gender;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.date = sdf.parse(date);
        this.address = address;
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
        return id + " " + name + " " + gender + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
    
    @Override
    public int compareTo(Customer1 o) {
        return this.date.compareTo(o.date);
    }
}

public class J07025_DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Customer1> arr = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            arr.add(new Customer1(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(Customer1 it : arr) {
            System.out.println(it);
        }
    }
}
