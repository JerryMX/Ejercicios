package data_types;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Introducir numero: ");
        double num=input.nextDouble();

        double cuadrado, cubo, cuarta;

        cuadrado=Math.pow(num,2);
        cubo= Math.pow(num,3);
        cuarta= Math.pow(num,4);

        System.out.println("resultado al cuadrado: " + cuadrado);
        System.out.println("resultado al cubo: " + cubo);
        System.out.println("resultado a la cuarta potencia: " + cuarta);


    }
}
