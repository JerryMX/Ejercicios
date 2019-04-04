package conditionals;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Ingresar numero: ");
        int num=input.nextInt();

        if(num<0) {
            System.out.println("Numero es negativo!");

        } else{
                System.out.println("Numero es positivo!");
            }

    }
}
