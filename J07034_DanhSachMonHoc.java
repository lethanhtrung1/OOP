/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

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

class MonHoc1 {
    private String maMon, tenMon;
    private int soTin;
    public MonHoc1(String maMon, String tenMon, int soTin) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTin = soTin;
    }
    public String getTenMon() {
        return tenMon;
    }
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTin;
    }
}

public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int n = in.nextInt();
        ArrayList<MonHoc1> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            in.nextLine();
            MonHoc1 tmp = new MonHoc1(in.nextLine(), in.nextLine(), in.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr, new Comparator<MonHoc1>() {
            @Override
            public int compare(MonHoc1 o1, MonHoc1 o2) {
                return o1.getTenMon().compareTo(o2.getTenMon());
            }
        });
        for(MonHoc1 it : arr) {
            System.out.println(it);
        }
    }
}
