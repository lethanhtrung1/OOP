/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class NhanVien_2 implements Comparable<NhanVien_2> {
    private String id, name, gender, birth, address, id_tax, contract_date;
    private long age;
    public NhanVien_2(int stt, String name, String gender, String birth, String address, String id_tax, String contract_date) {
        this.id = String.valueOf(stt);
        while(this.id.length() < 5) {
            this.id = '0' + this.id;
        }
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.id_tax = id_tax;
        this.contract_date = contract_date;
        this.age = Long.parseLong(birth.substring(0, 2)) + Long.parseLong(birth.substring(3, 5)) * 30 + Long.parseLong(birth.substring(6, 10)) * 12 * 30;
    }
    @Override
    public String toString() {
        return id + " "  + name + " " + gender + " " + birth + " " + address + " " + id_tax + " " + contract_date;
    }
    @Override
    public int compareTo(NhanVien_2 o) {
        return (int)(this.age - o.age);
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<NhanVien_2> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            NhanVien_2 tmp = new NhanVien_2(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(NhanVien_2 it : arr) {
            System.out.println(it);
        }
    }
}
