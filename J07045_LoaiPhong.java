/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class LoaiPhong implements Comparable<LoaiPhong> {
    private String kyHieu, ten;
    private int donGia;
    private double phiPv;
    public LoaiPhong(String s) {
        String[] str = s.split(" ");
        this.kyHieu = str[0];
        this.ten = str[1];
        this.donGia = Integer.parseInt(str[2]);
        this.phiPv = Double.parseDouble(str[3]);
    }
    public String getTen() {
        return ten;
    }
    @Override
    public String toString() {
        return kyHieu + " " + ten + " " + donGia + " " + phiPv;
    }
    @Override
    public int compareTo(LoaiPhong x) {
        return this.getTen().compareTo(x.getTen());
    }
}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
