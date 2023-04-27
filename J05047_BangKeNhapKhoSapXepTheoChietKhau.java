/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */

class MatHang47 implements Comparable<MatHang47> {
    private String maHang, tenHang;
    private int chietKhau, thanhTien;
    public MatHang47(String maHang, String tenHang, int soLuong, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
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
    @Override
    public int compareTo(MatHang47 o) {
        if(this.chietKhau > o.chietKhau) return -1;
        if(this.chietKhau < o.chietKhau) return 1;
        return 0;
    }
}

public class J05047_BangKeNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang47> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            String ten = in.nextLine();
            String str[] = ten.trim().split("\\s+");
            String id = str[0].substring(0, 1).toUpperCase() + str[1].substring(0, 1).toUpperCase();
            String res = "";
            if(map.containsKey(id)) {
                res = String.valueOf(map.get(id) + 1);
                map.replace(id, map.get(id) + 1);
            } else {
                map.put(id, 1);
                res = "1";
            }
            res = id + "0" + res;
            arr.add(new MatHang47(res, ten, in.nextInt(), in.nextInt()));
        }
        Collections.sort(arr);
        for(MatHang47 it : arr) {
            System.out.println(it);
        }
    }
}