package data_types;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("numero de 0 a 1000: ");
        int num = input.nextInt();

        int primNum = num % 10;
        int remainingNumber = num / 10;
        int segNum = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int terNum = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int cuarNum = remainingNumber % 10;
        int sum = terNum + segNum + primNum + cuarNum;
        System.out.println("Suma del numero "+ num + " es " + sum);
    }
}
