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

class Company {
    private String id, name;
    private int amount;
    public Company(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + amount;
    }
}

public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DN.in"));
        int n = in.nextInt();
        ArrayList<Company> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s1 = in.next();
            in.nextLine();
            String s2 = in.nextLine();
            int num = in.nextInt();
            arr.add(new Company(s1, s2, num));
        }
        Collections.sort(arr, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
               return o1.getId().compareTo(o2.getId());
            }
        });
        for(Company it : arr) {
            System.out.println(it);
        }
    }
}
