package data_types;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.print("Tiempo: ");
        long zona = input.nextInt();

        long tmilsgs = System.currentTimeMillis();

        long tseg = tmilsgs / 1000;

        long seg = tseg% 60;

        long tminutos = tseg / 60;

        long min = tminutos % 60;

        long thoras = tminutos / 60;

        long hrs = ((thoras + zona) % 24);

        System.out.println("tiempo local es " + hrs + ":" + min + ":" + seg);
    }

    }

