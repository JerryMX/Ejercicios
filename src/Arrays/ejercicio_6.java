package Arrays;

import java.util.Arrays;

public class ejercicio_6 {
    public static int findIndex(int[] array1, int t){
        int tam=array1.length;
        int i=0;
        while(i<tam){
            if(array1[i]==t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array1= {10, 15, 20, 25, 30, 35};
        System.out.println(" "+ Arrays.toString(array1));
        System.out.println("la posicion del numero 15 es: "+findIndex(array1,15));
        System.out.println("la posicion del numero 30 es: "+findIndex(array1, 30));
    }
}
