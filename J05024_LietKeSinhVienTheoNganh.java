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

class SinhVien_5 {
    private String id, name, classroom, email, sector;
    public SinhVien_5(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
        if(id.substring(3, 7).equals("DCKT"))
            this.sector = "KE TOAN";
        else if(id.substring(3, 7).equals("DCCN") && classroom.charAt(0) != 'E')
            this.sector = "CONG NGHE THONG TIN";
        else if(id.substring(3, 7).equals("DCAT") && classroom.charAt(0) != 'E')
            this.sector = "AN TOAN THONG TIN";
        else if(id.substring(3, 7).equals("DCVT"))
            this.sector = "VIEN THONG";
        else if(id.substring(3, 7).equals("DCDT"))
            this.sector = "DIEN TU";
    }
    public String getSector() {
        return sector;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + classroom + " " + email;
    }
}

public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, ArrayList<SinhVien_5>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            SinhVien_5 tmp = new SinhVien_5(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            if(map.containsKey(tmp.getSector())) {
                map.get(tmp.getSector()).add(tmp);
            }
            else {
                map.put(tmp.getSector(), new ArrayList<>());
                map.get(tmp.getSector()).add(tmp);
            }
        }
        int Q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < Q; i++) {
            String str = in.nextLine();
            str = str.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + str + ":");
            for(SinhVien_5 it : map.get(str)) {
                System.out.println(it);
            }           
        }
    }
}
