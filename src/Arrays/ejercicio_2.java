package Arrays;
import java.util.Arrays;
public class ejercicio_2 {

    public static void main(String[] args){
        int[] array1 = {
                29, 39, 90, 28, 29,
        };
        int  sum= 0;

        for(int i:array1) {
            sum += i;
        }

        System.out.println("numeros usados= " +Arrays.toString(array1));

        System.out.println("suma de los arregos= " +sum);
    }
}
