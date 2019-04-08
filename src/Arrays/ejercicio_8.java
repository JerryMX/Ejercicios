package Arrays;
import java.util.Arrays;
public class ejercicio_8 {
    public static void main(String[] args){
        int[] array1={12, 42, 42, 23, 76, 65, 45};
        int[] array2= new int[7];

        System.out.println("arreglo principal: "+Arrays.toString(array1));

        for(int i=0; i< array1.length; i++){
        array2[i]= array1[i];
        }
        System.out.println("arreglo actual: "+Arrays.toString(array2));
    }
}
