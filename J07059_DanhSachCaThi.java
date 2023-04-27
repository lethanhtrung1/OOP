/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class CaThi implements Comparable<CaThi> {
    private String id, date, time, room;
    private String cmp;
    public CaThi(int i, String date, String time, String room) {
        if(i < 10) this.id = "C00" + i;
        else if(i < 100) this.id = "C0" + i;
        else this.id = "C" + i;
        this.date = date;
        this.time = time;
        this.room = room;
        this.cmp = this.date.substring(6) + "/" + this.date.substring(3, 5) + "/" + this.date.substring(0, 2);
    }
    @Override
    public String toString() {
        return id + " " + date + " " + time + " " + room;
    }
    @Override
    public int compareTo(CaThi o) {
        if(this.cmp.compareTo(o.cmp) < 0) return -1;
        else if(this.cmp.compareTo(o.cmp) == 0) {
            if(this.time.compareTo(o.time) < 0) return -1;
            else if(this.time.compareTo(o.time) == 0) {
                return this.id.compareTo(o.id);
            }
        }
        return 1;
    }
}

public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("CATHI.in"));
        int n = in.nextInt();
        in.nextLine();
        ArrayList<CaThi> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new CaThi(i, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(CaThi it : arr) {
            System.out.println(it);
        }
    }
}
