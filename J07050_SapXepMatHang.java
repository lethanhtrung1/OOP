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

class MatHang {
    private String ma, ten, nhom;
    private double giaMua, giaBan;
    public MatHang(int ma, String ten, String nhom, double giaMua, double giaBan) {
        if(ma < 10) this.ma = "MH0" + ma;
        else this.ma = "MH" + ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String GetNhom() {
        return nhom;
    }
    public double getGiaMua() {
        return giaMua;
    }
    public double getGiaBan() {
        return giaBan;
    }
}

public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATHANG.in"));
        int n = in.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            in.nextLine();
            arr.add(new MatHang(i, in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble()));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getGiaBan() - o1.getGiaMua() > o2.getGiaBan() - o2.getGiaMua())
                    return -1;
                return 1;
            }
        });
        for(MatHang it : arr) {
            System.out.printf("%s %s %s %.2f\n", it.getMa(), it.getTen(), it.GetNhom(), it.getGiaBan() - it.getGiaMua());
        }
    }
}
