package Arrays;

public class ejercicio_19 {
    public static void main(String[] args){
        int a[][]= {
                {1,9,5},
                {4,3,2},
                {5,3,4}
        };
        int b[][]={
                {5,7,2},
                {6,3,1},
                {9,5,3}
        };

        int c[][]=new int[3][3];

        for (int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];

                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}
