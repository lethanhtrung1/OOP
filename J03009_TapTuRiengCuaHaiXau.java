/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author TRUNG
 */
public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String[] a = s1.split(" ");
            String[] b = s2.split(" ");
            Set<String> A = new HashSet<>();
            Set<String> B = new HashSet<>();
            Collections.addAll(A, a);
            Collections.addAll(B, b);
//            Iterator value = A.iterator();
//            while(value.hasNext()) {
//                if(B.contains(value.next()) == false) {
//                    System.out.print(value.next());
//                }
//            }
            for(String it : A) {
                if(B.contains(it) == false) {
                    System.out.print(it + " ");
                }
            }
            System.out.println();
        }
    }    
}
