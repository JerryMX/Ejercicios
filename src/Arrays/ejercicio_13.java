package Arrays;
import java.util.Arrays;
public class ejercicio_13 {
    public static void main( String[] args){
        String[] array1= {"FIME", "FACPYA", "FOD", "FIME", "FACPYA", "FCFM", "FARQ", "FOD"};
        System.out.println("Arreglo: " +Arrays.toString(array1));
        for (int i = 0; i < array1.length-1; i++)
        {
            for (int j = i+1; j < array1.length; j++)
            {
                if( (array1[i].equals(array1[j])) && (i != j) )
                {
                    System.out.println("Elementos duplicados: "+array1[j]);
                }

                }
            }
        }
    }

