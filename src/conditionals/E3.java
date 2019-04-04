package conditionals;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println(" Ingresar numero: ");
        int num1= input.nextInt();
        System.out.println(" Ingresar numero: ");
        int num2= input.nextInt();
        System.out.println(" Ingresar numero: ");
        int num3= input.nextInt();

        if(num3>num2){
            if(num3>num1){
                System.out.println(" numero mayor: "+num3);
            }else{
                if(num2>num3){
                    //System.out.println(" numero mayor: " +num2);
                } else{
                    System.out.println(" numero mayor: " +num1);
                }
            }

        } else {
            System.out.println(" numero mayor: " +num2);
        }
        }
    }

