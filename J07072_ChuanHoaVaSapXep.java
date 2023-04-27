/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TRUNG
 */

class ChuanHoa {
    private String name, firstName, middleName, lastName;
    public ChuanHoa(String name) {
        this.name = format(name);
        String[] str = this.name.split(" ");
        this.firstName = str[0];
        this.lastName = str[str.length - 1];
        for(int i = 1; i < str.length - 1; i++) {
            this.middleName += str[i];
        }
    }
    private String format(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            res.append(Character.toUpperCase(temp.charAt(0)));
            for(int i = 1; i < temp.length(); i++) {
                res.append(Character.toLowerCase(temp.charAt(i)));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<ChuanHoa> arr = new ArrayList<>();
        while(in.hasNextLine()) {
            arr.add(new ChuanHoa(in.nextLine()));
        }
        Collections.sort(arr, new Comparator<ChuanHoa>(){
            @Override
            public int compare(ChuanHoa o1, ChuanHoa o2) {
                if(o1.getLastName().compareTo(o2.getLastName()) < 0) return -1;
                else if(o1.getLastName().compareTo(o2.getLastName()) == 0) {
                    if(o1.getFirstName().compareTo(o2.getFirstName()) < 0)
                        return -1;
                    else if(o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
                        if(o1.getMiddleName().compareTo(o2.getMiddleName()) < 0)
                            return -1;
                    }
                }
                return 1;
            }
        });
        for(ChuanHoa it : arr) {
            System.out.println(it);
        }
    }
}
