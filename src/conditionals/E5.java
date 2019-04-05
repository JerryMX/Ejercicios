package conditionals;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("introducir numero del 1 al 7 ");
        int num = input.nextInt();
        int dia;

        switch (num) {

            case 1:
                System.out.println("dia: Lunes");
                break;
            case 2:
                System.out.println("dia: Martes");
                break;
            case 3:
                System.out.println("dia: Miercoles");
                break;
            case 4:
                System.out.println("dia: Jueves");
                break;
            case 5:
                System.out.println("dia: Viernes");
                break;
            case 6:
                System.out.println("dia: Sabado");
                break;
            case 7:
                System.out.println("dia: Domingo");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
