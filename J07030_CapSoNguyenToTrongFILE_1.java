/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author TRUNG
 */
public class J07030_CapSoNguyenToTrongFILE_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for(int it : arr1) {
            if(isPrime(it)) {
                set1.add(it);
            }
        }
        for(int it : arr2) {
            if(isPrime(it)) {
                set2.add(it);
            }
        }
        for(Integer it : set1) {
            if(set2.contains(1000000 - it) && it < (1000000 - it)) {
                System.out.println(it + " " + (1000000 - it));
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
