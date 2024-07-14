import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = userInput.nextInt();
        
        if((userint % 2) == 0) {
            System.out.println("The interger " + userInt + " is even");
        }
        else {
            System.out.println("The interger " + userInt + " is odd");
        }
    }
}