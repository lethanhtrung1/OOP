/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;
import java.math.*;

/**
 *
 * @author TRUNG
 */
public class J03012_TongSoNguyenLon_1 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
