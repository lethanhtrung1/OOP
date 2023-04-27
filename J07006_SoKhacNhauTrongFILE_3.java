/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit.SrcCodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author TRUNG
 */
public class J07006_SoKhacNhauTrongFILE_3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) obj.readObject();
        int cnt[] = new int[1005];
        for(int i : arr) {
            cnt[i]++;
        }
        for(int i = 0; i <= 1000; i++) {
            if(cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
