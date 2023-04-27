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
public class J07005_SoKhacNhauTrongFILE_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {        
        DataInputStream f = new DataInputStream(new FileInputStream("DATA.IN"));
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 100000; i++){
            int s = f.readInt();
            if(map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else{
                map.put(s, 1);
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(int x : arr){
            System.out.printf("%d %d\n", x, map.get(x));
        }
    }  
}
