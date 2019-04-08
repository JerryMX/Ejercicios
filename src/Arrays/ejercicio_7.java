package Arrays;

import java.util.Arrays;

public class ejercicio_7 {
    public static void main(String[] args){
        int[] array1= {93, 92, 10, 18, 48, 14, 38};

        int elindex=3;
        System.out.println("arreglo: " + Arrays.toString(array1));

        for(int i= elindex; i<array1.length -1; i++){
            array1[i]=array1[i+1];
        }
        System.out.println("arreglo despues de elinminar el 4to numero: " +Arrays.toString(array1));
    }
}
