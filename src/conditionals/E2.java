package conditionals;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("a= ");
       double a=input.nextDouble();

        System.out.println("b= ");
        double b= input.nextDouble();

        System.out.println("c= ");
        double c= input.nextDouble();

        double resultado = b * b - 4.0 * a * c;

        if (resultado > 0.0) {
            double r1 = (-b + Math.pow(resultado, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(resultado, 0.5)) / (2.0 * a);
            System.out.println("las raices son " + r1 + " y " + r2);
        } else if (resultado == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("la raiz es " + r1);
        } else {
            System.out.println("la equacion no tiene numeros reales .");
        }

    }
}
