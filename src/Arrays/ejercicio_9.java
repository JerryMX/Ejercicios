package Arrays;

import java.util.Arrays;

public class ejercicio_9 {
    public static void main(String[] args){
        int[] array1={92,13,4,52,1,23,5,34,21,1,0};

        int indx=3;
        int nval=88;

        System.out.println("Arreglo: "+ Arrays.toString(array1));

        for(int i=array1.length-1; i>indx; i--){
            array1[i]=array1[i-1];
        }
        array1[indx]=nval;
        System.out.println("Nuevo Arreglo: "+Arrays.toString(array1));
    }
}
