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

class SinhVien_0 implements Comparable<SinhVien_0> {
    private String id, name;
    private int amount;
    public SinhVien_0(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + amount;
    }
    @Override
    public int compareTo(SinhVien_0 o) {
        if(this.amount > o.amount) return -1;
        else if(this.amount < o.amount) return 1;
        else {
            if(this.id.compareTo(o.id) < 0) return -1;
            if(this.id.compareTo(o.id) > 0) return 1;
            return 0;
        }
    }
}

public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<SinhVien_0> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            in.nextLine();
            SinhVien_0 tmp = new SinhVien_0(in.nextLine(), in.nextLine(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(SinhVien_0 it : arr) {
            System.out.println(it);
        }
    }
}