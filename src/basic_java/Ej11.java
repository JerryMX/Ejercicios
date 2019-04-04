package basic_java;

import java.lang.Math;
public class Ej11 {
    public static void main (String[] args){

        double r, pi, p, a;
        r=7.5;
        pi=3.14;
        p= 2*pi*r;
        a= pi*Math.pow(r,2);

        System.out.println("Perimeter= " +p);
        System.out.println("Area= " +a);




    }
}