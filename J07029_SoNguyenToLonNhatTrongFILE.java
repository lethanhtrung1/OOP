/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author TRUNG
 */
public class J07029_SoNguyenToLonNhatTrongFILE {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
        int cnt[] = new int[1000005];
        for(int x : arr) {
            if(isPrime(x)) cnt[x]++;
        }
        int count = 0, index = 1000000;
        while(index >= 0) {
            if(cnt[index] > 0) {
                System.out.println(index + " " + cnt[index]);
                count++;
            }
            if(count == 10)
                break;
            index--;
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
