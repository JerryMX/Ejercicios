package data_types;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args){

        double minY = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("minutos: ");

        double min = input.nextDouble();

        long a = (long) (min / minY);
        int di = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + a + " years and " + di + " days");
    }
}
