package conditionals;

import java.util.Scanner;

public class E9 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Escribe el año: ");
        int a= input.nextInt();

        boolean x=(a%4)==0;
        boolean y=(a%100)!=0;
        boolean z=((a%100==0)&&(a%400==0));

        if(x&&(y||z)){
            System.out.print(a+" es año bisiesto");
        }else{
            System.out.print(a+ " no es año bisiesto");
        }


    }
}
