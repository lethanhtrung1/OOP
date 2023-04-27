/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Gv {
    String id, name;
    int bacLuong, luongCoBan, phuCap, thuNhap;
    void input(Scanner in) {
        id = in.nextLine();
        name = in.nextLine();
        luongCoBan = in.nextInt();
        bacLuong = (id.charAt(2) - '0') * 10 + (id.charAt(3) - '0');
        if(id.substring(0, 2).compareTo("HT") == 0)
            phuCap = 2000000;
        else if(id.substring(0, 2).compareTo("HP") == 0)
            phuCap = 900000;
        else phuCap = 500000;
        thuNhap = luongCoBan * bacLuong + phuCap;
    }
    void output() {
        System.out.print(id + " " + name + " " + bacLuong + " " + phuCap + " " + thuNhap);
    }
}


public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        Gv a = new Gv();
        a.input(in);
        a.output();
    }   
}
