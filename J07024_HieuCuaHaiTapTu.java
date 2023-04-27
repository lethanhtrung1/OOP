/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author TRUNG
 */

class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    
    public WordSet(String path) throws FileNotFoundException {
        Scanner in = new Scanner(new File(path));
        while(in.hasNext()) {
            String s = in.next().toLowerCase();
            set.add(s);
        }
    }
    
    public String difference(WordSet ws) {
        String ans = "";
        for (String it : this.set) {
            if (!ws.set.contains(it)) {
                ans += it + " ";
            }
        }
        return ans;
    }
}

public class J07024_HieuCuaHaiTapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
