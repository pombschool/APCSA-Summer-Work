//Author: Sandhya Sudhamsu Srimathirumala Pallerlamudi
//Date: 6/18/2024
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        FromMeToYou();
        NameThatCelebrity();
        ArithmeticAssignment();
        MixedResults();
        NameReversal();
    }

    public static void FromMeToYou() {
        System.out.println("PROJECT 1: \n");
        System.out.println("From: Bill Smith \nAddress: Dell Computer, Bldg 13 \nDate: April 12, 2005 \n \nTo: Jack Jones \n \nMessage: Help! I'm trapped inside a computer! \n");
        System.out.println("---------------------------------------");
    }

    public static void NameThatCelebrity() {
        System.out.println("PROJECT 3:");
        String celebrity1 = "Allan Alda";
        String celebrity2 = "John Wayne";
        String celebrity3 = "Gregory Peck";
        int lengthCelebrity1 = celebrity1.length();
        int lengthCelebrity2 = celebrity2.length();
        int lengthCelebrity3 = celebrity3.length();

        System.out.println("Allan Alda>>>" + celebrity1.substring(2, lengthCelebrity1-3));
        System.out.println("John Wayne>>>" + celebrity2.substring(2, lengthCelebrity2-3));
        System.out.println("Gregory Peck>>>" + celebrity3.substring(2, lengthCelebrity3-3) + "\n");
        System.out.println("---------------------------------------");
    }

    public static void ArithmeticAssignment() {
        System.out.println("PROJECT 4:");
        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19 = " + (79 + 3 * (4 + 82 - 68) - 7 + 19));
        System.out.println("(179 + 21 + 10) / 7 + 181 = " + ((179 + 21 + 10) / 7 + 181));
        System.out.println("10389 * 56 * 11 + 2246 = " + (10389 * 56 * 11 + 2246));
        System.out.println("---------------------------------------");
    }

    public static void MixedResults() {
        System.out.println("PROJECT 5:");

        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;

        System.out.println("Problem 1: " + ((57.2 * (i1/i2)) + 1));
        System.out.println("Problem 2: " + ((57.2 * ((double)i1/i2)) + 1));
        System.out.println("Problem 3: " + (15 - i1 * (d1 * 3) + 4));
        System.out.println("Problem 4: " + (15 - i1 * (int)(d1 * 3) + 4));
        System.out.println("Problem 5: " + (15 - i1 * ((int)d1 * 3) + 4));
    }
        
    public static void NameReversal() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("PROJECT 11:");
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();
        
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.substring(i, i + 1);
        }
        
        System.out.println("Reversed name: " + reversedName.toLowerCase());
    }
}
