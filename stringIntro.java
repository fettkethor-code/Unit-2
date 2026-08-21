import java.util.*;

public class stringIntro {


    public static void main (String[] args) {
        String string1 = new String("this is longer"); //AP test way
        String string2 = "shorter";

        System.out.println(string1.length()); //prints length of string1

        String lastWord1 = string1.substring(8, string1.length());
        System.out.println(lastWord1);

        System.out.println(string1.indexOf(" is "));

        System.out.println("shorter".equals(string2));
        String string3 = new String("shorter");
        System.out.println(string2 == string3); // doesnt work with new String()
        System.out.println(string2 == "shorter"); // works with String literal

        int compare = string2.compareTo("Shorter"); //capital comes first
        System.out.println(compare);
        System.out.println(string2.compareTo("!")); //special characters come first

        String[] listOfLetters = string1.split("h");
        System.out.println(listOfLetters);


    }

}
