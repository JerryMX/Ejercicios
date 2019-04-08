package conditionals;

import java.util.Scanner;

public class E15 {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("cuantos numeros se utilizaran?: ");
        int num=input.nextInt();

        int i, sum=0;

        System.out.println("Los numeros impares son:");

        for(i=1; i<=num; i++){

            System.out.println(2*i-1);
            sum+=2*i-1;
        }

        System.out.println("La suma de los numeros impares hasta "+num+ " = " +sum);

    }
}
