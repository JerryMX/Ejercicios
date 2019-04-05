package conditionals;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("escoge un mes del 1 al 12");
        int mesnum= input.nextInt();
        System.out.println("esribe el año");
        int año= input.nextInt();
        int numdias=0;


        switch(mesnum) {
            case 1:
                System.out.print("Enero");
                numdias = 31;
                break;
            case 2:
                System.out.print("Febrero");
                if ((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0))) {
                    numdias = 29;
                } else {
                    numdias = 28;
                }
                break;
            case 3:
                System.out.print("Marzo");
                numdias = 31;
                break;
            case 4:
                System.out.print("Abril");
                numdias = 30;
                break;
            case 5:
                System.out.print("Mayo");
                numdias = 31;
                break;
            case 6:
                System.out.print("Junio");
                numdias = 30;
                break;
            case 7:
                System.out.print("Julio");
                numdias = 31;
                break;
            case 8:
                System.out.print("Agosto");
                numdias = 31;
                break;
            case 9:
                System.out.print("Septiembre");
                numdias = 30;
                break;
            case 10:
                System.out.print("Octubre");
                numdias = 31;
                break;
            case 11:
                System.out.print("Noviembre");
                numdias = 30;
                break;
            case 12:
                System.out.print("Diciembre");
                numdias = 31;
                break;


        }
        System.out.print(" " + año + " tiene " + numdias + " dias\n");
        }

    }

