package basic_java;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("dame un numero ");

        int x= input.nextInt();

        System.out.println("dame un numero ");

        int y = input.nextInt();

        int z;
        z=x*y;

        System.out.println("Resultado=  " +z);

    }
}
