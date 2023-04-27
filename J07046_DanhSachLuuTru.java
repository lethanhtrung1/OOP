/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author TRUNG
 */

class KhachHang {
    private String maKh, ten, maPhong, ngayDen, ngayDi;
    public KhachHang(int maKh, String ten, String maPhong, String ngayDen, String ngayDi) {
        if(maKh < 10) this.maKh = "KH0" + maKh;
        else this.maKh = "KH" + maKh;
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    public int countDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(ngayDen, formatter);
        LocalDate end = LocalDate.parse(ngayDi, formatter);
        long numberOfDays = ChronoUnit.DAYS.between(start, end);
        return Math.abs((int)numberOfDays);
    }
    @Override
    public String toString() {
        return maKh + " " + ten + " " + maPhong + " " + countDate();
    }
}

public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            KhachHang tmp = new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if(o1.countDate() > o2.countDate())
                    return -1;
                return 1;
            }
        });
        for(KhachHang it : arr) {
            System.out.println(it);
        }
    }
}
