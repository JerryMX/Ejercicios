package data_types;

import java.util.Scanner;

public class EJ6 {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Peso en libras:  ");
        int weight =input.nextInt();

        System.out.println("altura en pulgadas:  ");
        int inches=input.nextInt();

        double BMI;

        BMI= (weight/Math.pow(inches,2) *703);

        System.out.println("" +BMI);


    }
}
