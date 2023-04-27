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

class WordSet2 {
    private TreeSet<String> set = new TreeSet<>();
    
    public WordSet2(String file) throws FileNotFoundException {
        Scanner in = new Scanner(new File(file));
        while(in.hasNext()) {
            String s = in.next().toLowerCase();
            if(s.length() > 0) set.add(s);
        }
    }
    
    public String union(WordSet2 ws) {
        TreeSet<String> st = new TreeSet<>();
        st.addAll(ws.set);
        st.addAll(this.set);
        StringBuilder res = new StringBuilder();
        for(String it : st) {
            res.append(it).append(" ");
        }
        return res.toString().trim();
    }
    
    public String intersection(WordSet2 ws) {
        TreeSet<String> st = new TreeSet<>();
        st.addAll(ws.set);
        st.retainAll(this.set);
        StringBuilder res = new StringBuilder();
        for(String it : st) {
            res.append(it).append(" ");
        }
        return res.toString().trim();
    }
    
}

public class J07014_HopGiaoCuaHaiVanBan {
    public static void main(String[] args) throws IOException {
        WordSet2 s1 = new WordSet2("DATA1.in");
        WordSet2 s2 = new WordSet2("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
