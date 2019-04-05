package conditionals;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int x=input.nextInt();

        int i;

        for(i=1; i<=x; i++){
            System.out.println("Numero: "+i+ " y al cubo es: 4"+(i*i*i));
        }
    }
}
