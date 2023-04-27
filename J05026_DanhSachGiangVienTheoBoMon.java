/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Lecturer_1 {
    private String id, name, sector;
    public Lecturer_1(int stt, String name, String sector) {
        if(stt < 10) this.id = "GV0" + stt;
        else this.id = "GV" + stt;
        this.name = name;
        this.sector = format(sector);
    }
    private String format(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return res.toString();
    }
    public String getSector() {
        return sector;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sector;
    }
}

public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, ArrayList<Lecturer_1>> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            Lecturer_1 tmp = new Lecturer_1(i, in.nextLine(), in.nextLine());
            if(map.containsKey(tmp.getSector())) {
                map.get(tmp.getSector()).add(tmp);
            } else {
                map.put(tmp.getSector(), new ArrayList<>());
                map.get(tmp.getSector()).add(tmp);
            }
        }
        int q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < q; i++) {
            String str = in.nextLine();
            StringBuilder res = new StringBuilder();
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens()) {
                String tmp = st.nextToken();
                res.append(Character.toUpperCase(tmp.charAt(0)));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(Lecturer_1 it : map.get(res.toString())) {
                System.out.println(it);
            }
        }
    }
}
