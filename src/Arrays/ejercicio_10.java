package Arrays;
import java.util.Arrays;

public class ejercicio_10 {
    public static void main(String[] args){
        int [] array1={32, 100, 26, 39, 5};

        System.out.println(" " + Arrays.toString(array1));


        Arrays.sort(array1);
        System.out.println("numero minimo= " + array1[0]);
        System.out.println("numero maximo= "+ array1[array1.length-1]);
    }
}
