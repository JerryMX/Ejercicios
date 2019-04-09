package Arrays;
import java.util.Arrays;
public class ejercicio_16 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 10, 6, 8, 2, 10, 11, 8, 2, 18};
        int tam = array1.length;
        int len = 0;
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    array1[i] = 1000;
                    len++;
                }
            }
        }
        int[] extra = new int[tam - len];
        Arrays.sort(array1);
        for (int i = 0; i < tam - len; i++) {
            extra[i] = array1[i];
        }
        System.out.println(Arrays.toString(extra));
    }
}