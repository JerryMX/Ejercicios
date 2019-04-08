package Arrays;

public class ejercicio_4 {

    public static void main(String[] args){

        int[]a= {
                2, 4, 6, 8, 10};
         int sum=0;

        for(int i=0; i< a.length; i++) {
            sum = sum + a[i];


        }   float av = sum / a.length;


        System.out.println("promedio del arreglo: " + av);
    }
}
