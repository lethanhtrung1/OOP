/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_PTIT.SrcCodePtit;

import java.util.*;

/**
 *
 * @author TRUNG
 */

class Point3D {
    private int x, y, z;
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
        int ab1 = b.x - a.x;
	int ab2 = b.y - a.y;
	int ab3 = b.z - a.z;
        
	int ac1 = c.x - a.x;
	int ac2 = c.y - a.y;
	int ac3 = c.z - a.z;
        
	int ad1 = d.x - a.x;
	int ad2 = d.y - a.y;
	int ad3 = d.z - a.z;
        
        int x1 = ab2 * ac3 - ac2 * ab3;
        int y1 = ab3 * ac1 - ab1 * ac3;
        int z1 = ab1 * ac2 - ac1 * ab2;
        return x1 * ad1 + y1 * ad2 + z1 * ad3 == 0;
    }
}

public class J04011_BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
