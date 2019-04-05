package conditionals;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);


        System.out.println("Escribe numero flotante ");
        double x= input.nextDouble();
        System.out.println("Escribe otro numero flotante");
        double y= input.nextDouble();

        x=Math.round(x*1000);
        x=x/1000;

        y=Math.round(y*1000);
        y= y/1000;

        if(x==y){
            System.out.println("Los numero son iguales hasta por tres decimales");

        }else{
            System.out.println("Los numeros no son iguales");
        }
    }
}
