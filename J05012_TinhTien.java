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

class Product implements Comparable<Product> {
    private String maMH, tenMH;
    private long soLuong, donGia, chietKhau, tongTien;
    
    public Product(String s1, String s2, long n1, long n2, long n3) {
        this.maMH = s1;
        this.tenMH = s2;
        this.soLuong = n1;
        this.donGia = n2;
        this.chietKhau = n3;
        this.tongTien = this.soLuong * this.donGia - this.chietKhau;
    }
    
    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }
    
    @Override
    public int compareTo(Product o) {
        if(this.tongTien > o.tongTien) return -1;
        else if(this.tongTien < o.tongTien) return 1;
        else return 0;
    }
}

public class J05012_TinhTien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            in.nextLine();
            arr.add(new Product(in.nextLine(), in.nextLine(), in.nextLong(), in.nextLong(), in.nextLong()));
        }
        Collections.sort(arr);
        for(Product it : arr) {
            System.out.println(it);
        }
    }
}