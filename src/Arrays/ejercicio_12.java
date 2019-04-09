package Arrays;
import java.util.Arrays;

public class ejercicio_12 {
    public static void main( String[] args){
        int[] array1= {4, 3, 2, 6, 2, 4, 8, 3, 6};
        System.out.println("Arreglo: " + Arrays.toString(array1));

        for (int i = 0; i < array1.length-1; i++)
        {
            for (int j = i+1; j < array1.length; j++)
            {
                if( (array1[i]==(array1[j])) && (i != j) )
                {
                    System.out.println("Elementos duplicados: "+array1[j]);
                }

            }
        }
    }
}