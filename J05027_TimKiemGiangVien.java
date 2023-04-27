/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Lecturer_2 {
    private String id, name, sector;
    public Lecturer_2(int stt, String name, String sector) {
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
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sector;
    }
}

public class J05027_TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Lecturer_2> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            Lecturer_2 tmp = new Lecturer_2(i, in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        int q = in.nextInt();
        in.nextLine();
        while(q-->0) {
            String str = in.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + str + ":");
            for(Lecturer_2 it : arr) {
                if(it.getName().toLowerCase().contains(str.toLowerCase())) {
                    System.out.println(it);
                }
            }
        }
    }
}
