/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class Lecturer implements Comparable<Lecturer> {
    private String id, name, sector, lastName;
    public Lecturer(int stt, String name, String sector) {
        if(stt < 10) this.id = "GV0" + stt;
        else this.id = "GV" + stt;
        this.name = name;
        this.sector = format(sector);
        String[] s = name.split(" ");
        this.lastName = s[s.length - 1];
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
    @Override
    public String toString() {
        return id + " " + name + " " + sector;
    }
    @Override
    public int compareTo(Lecturer o) {
        if(this.lastName.compareTo(o.lastName) < 0) return -1;
        if(this.lastName.compareTo(o.lastName) > 0) return 1;
        return 0;
    }
}

public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Lecturer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            Lecturer tmp = new Lecturer(i, in.nextLine(), in.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        for(Lecturer it : arr) {
            System.out.println(it);
        }
    }
}