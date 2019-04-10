package Strings;

public class string_1 {
    public static void main(String[] args){

        String str1= "Phyton Exercises";
        String str2= "Phyton Exercise";

        String end_str="se";

        boolean end1=str1.endsWith(end_str);
        boolean end2=str2.endsWith(end_str);

        System.out.println("\"" + str1 + "\" ends with "+"\""+end_str+ "\" ? "+end1);
        System.out.println("\"" + str2 + "\" ends with "+"\""+end_str+ "\" ? "+end2);
    }
}
