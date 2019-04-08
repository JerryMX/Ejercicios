package Arrays;

import java.util.Arrays;

public class ejercicio_1 {
    public static void main(String[] args){

        int[] array1 = {
                9384, 1827, 1039, 4092, 9284,
                2948, 9584, 2854, 9281, 5283,
                1938, 3948, 1934, 1290, 3814,};

        String[] array2={
                "FIME",
                "FACPYA",
                "FCFM",
                "FOD",
                "FARQ",
        };

        System.out.println("Arreglo no ordenado" +Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Arreglo ordenado: " +Arrays.toString(array1));

        System.out.println("Arreglo no ordenado" +Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Arreglo ordenado" +Arrays.toString(array2));
    }
}
