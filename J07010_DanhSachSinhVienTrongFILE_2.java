/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Student10 {
    static int stt = 1;
    String id, name, date, lop;
    float gpa;
    public void input(Scanner in) {
        if(stt < 10) id = "B20DCCN00";
        else if(stt < 100) id = "B20DCCN0";
        else id = "B20DCCN";
        id += Integer.toString(stt++);
        in.nextLine();
        name = in.nextLine();
        lop = in.nextLine();
        date = in.nextLine();
        gpa = in.nextFloat();
        if(date.charAt(1) == '/')
            date = "0" + date;
        if(date.charAt(4) == '/')
            date = date.substring(0, 3) + "0" + date.substring(3);
    }
    public void output() {
        System.out.printf("%s %s %s %s %.2f\n", id, name, lop, date, gpa);
    }
}

public class J07010_DanhSachSinhVienTrongFILE_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            Student10 sv = new Student10();
            sv.input(in);
            sv.output();
        }
    }
}
