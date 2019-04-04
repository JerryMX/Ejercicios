package basic_java;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);


        System.out.println("Primer numero: ");
        int x= input.nextInt();

        System.out.println("Segundo numero: ");
        int y= input.nextInt();

        System.out.println("Tercer numero: ");
        int z= input.nextInt();

        double a;

        a= (x+y+z)/3;

        System.out.println("Promedio: " +a);




    }
}
