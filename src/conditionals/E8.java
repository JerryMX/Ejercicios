package conditionals;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Escribe una letra: ");
        String input = in.next().toLowerCase();

        boolean mayuscula = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean minuscula = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vocales = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error.");
        }
        else if (!(mayuscula || minuscula))
        {
            System.out.println("Error.");
        }
        else if (vocales)
        {
            System.out.println("La letra es una vocal");
        }
        else
        {
            System.out.println("la letra es una consonante");
        }
    }
}
