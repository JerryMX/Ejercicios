package conditionals;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Dame un numero: ");
        int num= input.nextInt();

        System.out.println("Hasta que numero multiplicar?: ");
        int mult=input.nextInt();

        for(mult=0;mult<=num;mult++){
            System.out.println(mult+" X "+num+" = " +num*mult);
        }
    }
}
