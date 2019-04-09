package Arrays;

import java.util.Arrays;

public class ejercicio_18 {
    public static void main(String[] args) {
        int[] array1 = {9384, 1903, 1033, 8493, 1738, 1837,8692};

        System.out.println("Arreglo: " + Arrays.toString(array1));

        Arrays.sort(array1);

        System.out.println("segundo minimo: " +array1[1]);

    }
}
