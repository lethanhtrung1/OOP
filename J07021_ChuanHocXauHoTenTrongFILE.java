/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07021_ChuanHocXauHoTenTrongFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(true) {
            String res = in.nextLine();
            if(res.compareTo("END") == 0) break;
            res = res.trim();
            while(res.contains("  ") == true) {
                res = res.replace("  ", " ");
            }
            res = res.toLowerCase() + " ";
            ArrayList<String> arr = new ArrayList<>();
            String temp = "";
            for(int i = 0; i < res.length(); i++) {
                if(res.charAt(i) != ' ') {
                    temp += res.charAt(i);
                }
                else {
                    if(temp.compareTo(" ") == 0) {
                        arr.add(temp);
                        temp = "";
                    }
                }
            }
            for(String it : arr) {
                System.out.print(it.substring(0, 1).toUpperCase() + it.substring(1) + " ");
            }
            System.out.println();
        }
    }   
}
