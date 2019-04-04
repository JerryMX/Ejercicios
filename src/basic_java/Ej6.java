package basic_java;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);


        System.out.println("Dame primer numero: ");

        int x = input.nextInt();

        System.out.println("Dame primer numero: ");

        int y = input.nextInt();

        int a;
        int b;
        int c;
        double d;
        double e;

        a=x+y;
        b=x-y;
        c=x*y;
        d=x/y;
        e=x%y;




        System.out.println("Resultado suma=  " +a);
        System.out.println("Resultado resta=  " +b);
        System.out.println("Resultado multiplicacion=  " +c);
        System.out.println("Resultado division=  " +d);
        System.out.println("Resultado remainder=  " +e);



    }
}
