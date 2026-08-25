import java.util.*;

public class wrapperPractice {
    public static void main(String[] args) {

            Integer int1 = new Integer(9);
            Integer int2 = new Integer(-10);

            Double double1 = new Double(2.1);
            Double double2 = new Double(6.7);

            System.out.println(int1.doubleValue());
            System.out.println(int2.byteValue());
            System.out.println(int1.equals(9));
            System.out.println(int2.highestOneBit(2));
            System.out.println(double1.intValue());
            System.out.println(double2.isNaN());
            System.out.println(double1.floatValue());
            System.out.println(double2.equals(2.1));

            //------------------------------------//

            System.out.println(Math.abs(int2));
            System.out.println(Math.abs(double1));
            System.out.println(Math.pow(double1, int2));
            System.out.println(Math.sqrt(int1));
            System.out.println(Math.floor(Math.random() * int2 - 1)); //random -10 to 0
            System.out.println(Math.log(Math.exp(double2)));
            System.out.println(Math.cbrt(double2));
            System.out.println(Math.max(int2, 10000000));


    }   
}

// 8/8 Wrapper
// 10/10 Math