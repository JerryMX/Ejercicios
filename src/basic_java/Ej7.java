package basic_java;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Dame un numero: ");
        int x= input.nextInt();
        int y;

        for(int i=1; i<11; i++ ){

            y=x*i;

            System.out.println(x+" * " + i +" = " +y);


        }


    }

}
