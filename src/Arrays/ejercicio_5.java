package Arrays;

import java.util.Arrays;

public class ejercicio_5 {
        public static boolean contains(int[] array, int item) {
            for (int n : array) {
                if (item == n) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] array1 = {
                    1990, 1991, 1992, 1993, 1994,
                    1995, 1996, 1997, 1998, 1999,
                    2000};
            System.out.println("numeros en el arreglo= " + Arrays.toString(array1) );
            System.out.println("numeros a probar '1994' y '2001' ");
            System.out.println(contains(array1, 1994));
            System.out.println(contains(array1, 2001));
        }
    }


