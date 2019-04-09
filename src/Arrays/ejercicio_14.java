package Arrays;
import java.util.*;

public class ejercicio_14 {
    public static void main(String[] args){
        String[] array1= {"FIME", "FACPYA", "FARQ", "FOD"};
        String[] array2= {"FCFM", "FIC", "FIME", "FCC"};

        System.out.println("Arreglo 1: " +Arrays.toString(array1));
        System.out.println("Arreglo 2: " +Arrays.toString(array2));

        for (int i = 0; i < array1.length-1; i++)
        {
            for (int j = i+1; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    System.out.println("Elementos duplicados: "+array1[i]);
                }

            }
        }
    }
}
