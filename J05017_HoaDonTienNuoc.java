/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Customer3 implements Comparable<Customer3> {
    private String maKH, tenKH;
    private int tongTien;
    
    public Customer3(int stt, String s1, int n1, int n2) {
        this.maKH = String.format("KH%02d", stt);
        this.tenKH = s1;
        if(n2 - n1 <= 50)
            this.tongTien = (int) Math.round((n2 - n1) * 100 * 1.02);
        else if(n2 - n1 <= 100)
            this.tongTien = (int) Math.round((50 * 100 + (n2 - n1 - 50) * 150) * 1.03);
        else if(n2 - n1 > 100)
            this.tongTien = (int) Math.round((50 * 100 + 50 * 150 + (n2 - n1 - 100) * 200) * 1.05);
    }
    
    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + tongTien;
    }
    
    @Override
    public int compareTo(Customer3 o) {
        if(this.tongTien > o.tongTien) return -1;
        else if(this.tongTien < o.tongTien) return 1;
        else return 0;
    }
}

public class J05017_HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Customer3> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new Customer3(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(arr);
        for(Customer3 it : arr) {
            System.out.println(it);
        }
    }
}