package Strings;

public class string_3 {
    public static void main(String[] args){
        String str1="Stephen Edwin King";
        String str2="Walter Winchell";
        String str3="stephen edwin king";


        boolean eq1=str1.equals(str2);
        boolean eq2=str1.equalsIgnoreCase(str3);

        System.out.println("\"" +str1+ "\""+ " equals "+"\"" +str2+"\""+"? "  +eq1);
        System.out.println("\"" +str1+ "\""+ " equals "+"\"" +str3+"\""+"? "  +eq2);

    }
}
