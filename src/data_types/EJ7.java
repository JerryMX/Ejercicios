package data_types;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Distancia metros= ");
        float dist=input.nextFloat();

        System.out.println("Horas: ");
        float horas= input.nextFloat();

        System.out.println("Minutos: ");
        float minutos= input.nextFloat();

        System.out.println("segundos: ");
        float seg= input.nextFloat();

        float Tseg, kph, mph, mls;

        Tseg=(horas*3600)+(minutos*60)+seg;
        kph=(dist /1000.0f)/(Tseg/3600.0f);
        mls= dist/Tseg;
        mph= kph/1.609f;

        System.out.println("Velocidad en kilometros/hora: " +kph);
        System.out.println("Velocidad en metros/segundos: " +mls);
        System.out.println("Velocidad en millas/hora: " +mph);




    }
}
