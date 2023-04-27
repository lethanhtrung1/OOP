/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class MatHang46 {
    private String maHang, tenHang;
    private int chietKhau, thanhTien;
    public MatHang46(String maHang, String tenHang, int soLuong, int donGia) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        if(soLuong > 10) this.chietKhau = soLuong * donGia * 5 / 100;
        else if(soLuong >= 8) this.chietKhau = soLuong * donGia * 2 / 100;
        else if(soLuong >= 5) this.chietKhau = soLuong * donGia * 1 / 100;
        else this.chietKhau = 0;
        this.thanhTien = soLuong * donGia - this.chietKhau;
    }
    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + chietKhau + " " + thanhTien;
    }
}

public class J05046_BangKeNhapKho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<MatHang46> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            String s = in.nextLine();
            String str[] = s.trim().split("\\s+");
            String id = str[0].substring(0, 1).toUpperCase() + str[1].substring(0, 1).toUpperCase();
            String ans = "";
            if(map.containsKey(id)) {
                ans = String.valueOf(map.get(id) + 1);
                map.replace(id, map.get(id) + 1);
            } else {
                map.put(id, 1);
                ans = "1";
            }
            ans = id + "0" + ans;           
            arr.add(new MatHang46(ans, s, in.nextInt(), in.nextInt()));
        }
        for(MatHang46 it : arr) {
            System.out.println(it);
        }
    }
}