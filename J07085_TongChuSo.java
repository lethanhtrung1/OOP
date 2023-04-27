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
public class J07085_TongChuSo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) obj.readObject();
        for(String it : arr) {
            String res = "";
            int sum = 0;
            for(int i = 0; i < it.length(); i++) {
                if(Character.isDigit(it.charAt(i))) {
                    res += it.charAt(i);
                    sum += it.charAt(i) - '0';
                }
            }
            while(res.length() > 0 && res.charAt(0) == '0')
                res = res.substring(1);
            System.out.println(res + " " + sum);
        }
    }
}
