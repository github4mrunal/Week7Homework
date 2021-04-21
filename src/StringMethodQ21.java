import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethodQ21 {
    public static void main(String[] args) {
        String str = "Prime Testing Watford";
        System.out.println("String length -Length of the String: "      + str.length());
        System.out.println("String charAt() - Char value of the String:"  + str.charAt(10));
        System.out.println("String concat() - Combines the String" + str.concat(str));
        System.out.println("String contains() - Returns true if char are found  "    + str.contains(str));
        System.out.println("String startsWith() - String starts with prefix  "     + str.startsWith(str));
        System.out.println("String endsWith() - String ends with suffix  "     + str.endsWith(str));
        System.out.println("String equals() - Compare the contents of two strings  "     + str.equals(str));
        System.out.println("String indexOf() - Give index of given character value  "    + str.indexOf(str));
        System.out.println("String isEmpty()-Check if string is empty  " + str.isEmpty());
        System.out.println("String replace() -a string replacing all the old char to new char  " + str.replace("P","W"));
        System.out.println("String substring() - returns a part of the string  " + str.substring(0,10));
        System.out.println("String toCharArray() - converts this string into character array  " + str.toCharArray());
        System.out.println("String toLowercase() - returns the string in lowercase letter  " + str.toLowerCase(Locale.ROOT));
        System.out.println("String toUppercase() - returns the string in uppercase letter  " + str.toUpperCase(Locale.ROOT));
        System.out.println("String trim() - eliminates leading and trailing spaces   " + str.trim());
    }
}
