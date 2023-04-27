/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author TRUNG
 */

class WordSet1 {
    Set<String> set;
    public WordSet1(String name) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while(in.hasNext()) {
            set.add(in.next().toLowerCase());
        }
    }
    @Override
    public String toString() {
        String s = "";
        for(String it : set) {
            s += it + "\n";
        }
        return s;
    }
}

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet1 ws = new WordSet1("VANBAN.in");
        System.out.println(ws);
    }
}
