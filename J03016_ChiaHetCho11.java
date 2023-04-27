/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J03016_ChiaHetCho11 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            BigInteger a = BigInteger.valueOf(11);
            BigInteger b = BigInteger.valueOf(0);
            BigInteger n = in.nextBigInteger();
            if(n.mod(a) == b) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
