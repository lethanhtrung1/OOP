/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Product {
    private String id, name;
    private int prince, baoHanh;
    public Product(String id, String name, int prince, int baoHanh) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.baoHanh = baoHanh;
    }
    public int getPrince() {
        return prince;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + prince + " " + baoHanh;
    }
}

public class J07048_DanhSachSanPham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s1 = in.next();
            in.nextLine();
            String s2 = in.nextLine();
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            arr.add(new Product(s1, s2, num1, num2));
        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrince() > o2.getPrince())
                    return -1;
                else if(o1.getPrince() < o2.getPrince())
                    return 1;
                else
                    return o1.getId().compareTo(o2.getId());
            }         
        });
        for(Product it : arr) {
            System.out.println(it);
        }
    }
}
