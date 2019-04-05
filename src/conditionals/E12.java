package conditionals;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {


        double prom;
        int x, sum=0, n = 0;
        System.out.println("5 numeros: ");

        for (x = 1; x <= 5; x++) {
            System.out.println("numero " + x);
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            sum += n;

        }

        prom=sum/5;
        System.out.println("suma: " +sum+ "\n Primedio: " +prom);
    }

}


