/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */

class Student81 implements Comparable<Student81> {
    private String id, name, numPhone, email, firstName, lastName, middleName;
    public Student81(String id, String name, String n, String email) {
        this.id = id;
        this.name = name;
        this.numPhone = n;
        this.email = email;
        String[] str = this.name.split(" ");
        this.firstName = str[0];
        this.lastName = str[str.length - 1];
        for(int i = 1; i < str.length - 1; i++) {
            this.middleName += str[i];
        }
    }
    @Override
    public String toString() {
        return id + " " + name + " " + numPhone + " " + email;
    }
    @Override
    public int compareTo(Student81 o) {
        if(this.lastName.compareTo(o.lastName) < 0) return -1;
        else if(this.lastName.compareTo(o.lastName) == 0) {
            if(this.firstName.compareTo(o.firstName) < 0) return -1;
            else if(this.firstName.compareTo(o.firstName) == 0) {
                if(this.middleName.compareTo(o.middleName) < 0) return -1;
                else if(this.middleName.compareTo(o.middleName) == 0) {
                    return this.id.compareTo(o.id);
                }
            }
        }
        return 1;
    }
}

public class J07081_SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Student81> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            arr.add(new Student81(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(arr);
        for(Student81 it : arr) {
            System.out.println(it);
        }
    }
}
