package data_types;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("grados Farenheit: ");
        double F = input.nextDouble();
        double C;

        C=(F-32)*5/9;

        System.out.println("Grados en Celcius: "+C);


    }
}
