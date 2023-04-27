/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class MonHoc implements Comparable<MonHoc> {
    private String maMon, tenMon, hinhThucThi;
    public MonHoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThucThi;
    }
    @Override
    public int compareTo(MonHoc o) {
        if(this.maMon.compareTo(o.maMon) > 0) return 1;
        if(this.maMon.compareTo(o.maMon) < 0) return -1;
        return 0;
    }
}

public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            MonHoc tmp = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(MonHoc it : arr) {
            System.out.println(it);
        }
    }
}
