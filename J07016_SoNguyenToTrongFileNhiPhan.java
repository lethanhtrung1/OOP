/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author TRUNG
 */
public class J07016_SoNguyenToTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) obj2.readObject();
        
        int cnt1[] = new int[10005];
        int cnt2[] = new int[10005];
        for(Integer it : arr1) {
            if(isPrime(it)) cnt1[it]++;
        }
        for(Integer it : arr2) {
            if(isPrime(it)) cnt2[it]++;
        }
        for(int i = 2; i <= 10000; i++) {
            if(cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
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
