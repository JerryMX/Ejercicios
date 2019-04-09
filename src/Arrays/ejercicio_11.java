package Arrays;
import java.util.*;
import java.util.Arrays;

public class ejercicio_11 {
    static void reverso (Integer array1[])
    {
        Collections.reverse(Arrays.asList(array1));
        System.out.println("Arreglo invertido: " +Arrays.asList(array1));
    }

    public static void main(String[] args) {

        Integer[] array1 = {39, 18, 01, 13, 47};
        System.out.println("Arreglo original: "+Arrays.toString(array1));
        reverso(array1);
    }

}
