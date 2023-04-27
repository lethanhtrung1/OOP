/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRUNG
 */
class Department1 {
    private String id, name;

    public Department1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee1 {
    private String id, name;
//    private Department1 department;
    private int salary, workDay;
    
    public Employee1(String s1, String s2, int n1, int n2) {
        this.id = s1;
        this.name = s2;
        this.salary = n1;
        this.workDay = n2;
    }
    
    private int coefficients_Salary() {
        int workYear = Integer.parseInt(this.id.substring(1, 3));
        switch(this.id.charAt(0)) {
            case 'A':
                if(workYear >= 16) return 20;
                else if(workYear >= 9) return 14;
                else if(workYear >= 4) return 12;
                else return 10;
            case 'B':
                if(workYear >= 16) return 16;
                else if(workYear >= 9) return 13;
                else if(workYear >= 4) return 11;
                else return 10;
            case 'C':
                if(workYear >= 16) return 14;
                else if(workYear >= 9) return 12;
                else if(workYear >= 4) return 10;
                else return 9;
            default:
                if(workYear >= 16) return 13;
                else if(workYear >= 9) return 11;
                else if(workYear >= 4) return 9;
                else return 8;
        }
    }
    
    private int total() {
        return this.salary * this.workDay * coefficients_Salary() * 1000;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + total();
    }
}
   
public class J05078_BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int m = Integer.parseInt(in.nextLine());
        ArrayList<Department1> arr1 = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            arr1.add(new Department1(in.next(), in.nextLine()));
        }
        
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Employee1> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr2.add(new Employee1(in.nextLine(), in.nextLine(),
                    Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        }
        
        String id = in.next();
        for(Department1 it : arr1) {
            if(it.getId().equals(id)) {
                System.out.println("Bang luong phong " + it.getName() + ":");
                break;
            }
        }
        for(Employee1 it : arr2) {
            if(it.getId().substring(3).equals(id)) {
                System.out.println(it);
            }
        }
    }
}