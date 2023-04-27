/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.*;
import java.util.*;

/**
 *
 * @author TRUNG
 */
public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner in = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arr = (ArrayList<String>) obj.readObject();
        Set<String> set = new TreeSet<>();
        for(String it : arr) {
            String[] str = it.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(str));
        }
        while(in.hasNext()) {
            String s = in.next().toLowerCase();
            if(set.contains(s)) {
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}
