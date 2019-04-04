package data_types;
import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        double mts;
        System.out.println("How many inches?: ");
        double in=input.nextDouble();

        mts= in*0.0254;

        System.out.println("= "+mts+" meters");

    }
}
