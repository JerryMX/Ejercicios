package Arrays;

public class ejercicio_15 {
    public static void main(String[] args ){
        int[] array1={5, 2, 6, 9, 3, 1, 0};
        int[] array2={3, 2, 7, 1, 6, 1, 7};

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]==(array2[j])){
                    System.out.println("elemento en comun: "+array1[i]);
                }
            }
        }
    }
}
