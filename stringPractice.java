import java.util.*;

public class stringPractice {


    public static void main (String[] args){


        int num = 1;
        double weight = 7.89;

        Integer wrapperI = new Integer(1);
        Integer wrapperI2 = 2;

        Double wrapperD = new Double(1.1);
        Double wrapperD2 = 2.2;

        System.out.println(num == wrapperI); // works
        //System.out.println(num.equals(wrapperI)); // doesnt work, primitive.equals()
        System.out.println(wrapperI.equals(num)); // works








        String player1Name = new String("Isaac");
        String player2Name = new String("Stephen");
        String player3Name = new String("Thomas");
        String player1Ability = new String("Jump");
        String player2Ability = new String("Dash");
        String player3Ability = new String("Hook");


        System.out.println("Player 1's name length is " + player1Name.length());
        if(player1Ability.equals("Jump") && player1Ability.indexOf("Double") != -1) {
            player1Ability = new String("Double " + player1Ability.substring(player1Ability.indexOf("Jump")));
        }

        String player2ThirdLetter = String.valueOf(player2Name.charAt(2));

        System.out.println(player2ThirdLetter.compareTo(player3Name) > 0);

        System.out.println(player2Ability.substring(0,player2ThirdLetter.length()));

        System.out.println(String.join(player1Name, player2Name, player3Name));

        System.out.println(player1Name.isEmpty());

        System.out.println(player1Ability.concat(player3Ability));

        System.out.println(player2ThirdLetter.endsWith("e"));
        System.out.println(player2ThirdLetter.startsWith("e"));

        char[] charArray = {'s'};
        player3Ability.getChars(0, player3Ability.length(), charArray, 1);


    }
}

//Things done 15/15
