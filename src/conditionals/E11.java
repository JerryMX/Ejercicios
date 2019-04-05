package conditionals;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int x, sum=0;

        System.out.print("numero: ");
        int y=input.nextInt();

        for(x=1; x<=y; x++){
            System.out.println(" " +x);
            sum+=x;
        }
        System.out.print("Suma de todos los numeros: " +sum);
    }
}
