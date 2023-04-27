/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

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

class Customer implements Comparable<Customer> {
    private String id, name, gender, address;
    private Date date;
    
    public Customer(int index, String s1, String s2, String s3, String s4) throws ParseException {
        if(index < 10) this.id = "KH00" + index;
        else if(index < 100) this.id = "KH0" + index;
        else this.id = "KH" + index;
        this.name = formatName(s1);
        this.gender = s2;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(s3);
        this.address = s4;
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
        return id + " " + name + " " + gender + " "+ address + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
    
    @Override
    public int compareTo(Customer o) {
        return this.date.compareTo(o.date);
    }
}

public class J05082_DanhSachKhachHang {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            arr.add(new Customer(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(Customer it : arr) {
            System.out.println(it);
        }
    }
}
