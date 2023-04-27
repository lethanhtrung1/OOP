/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner in = new Scanner(file);
        BigInteger n = in.nextBigInteger();
        while(true) {
            String s = n.toString();
            if(s.length() == 1) break;
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            BigInteger x = new BigInteger(s1);
            BigInteger y = new BigInteger(s2);
            n = x.add(y);
            System.out.println(n);
        }         
    }    
}
