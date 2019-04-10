package Strings;


public class string_6 {
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";
        String str3 = "Example.com";

        System.out.println(""+str1+" y "+str3+" son iguales?: "+str1.contentEquals(str3));
        System.out.println(""+str2+" y "+str3+" son iguales?: "+str2.contentEquals(str3));
    }
}
