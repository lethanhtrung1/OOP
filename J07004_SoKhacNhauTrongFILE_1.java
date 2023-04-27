/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author TRUNG
 */
public class J07004_SoKhacNhauTrongFILE_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner in = new Scanner(file);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(in.hasNextInt()) {
            int n = in.nextInt();
            if(map.containsKey(n) == true) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }    
}
