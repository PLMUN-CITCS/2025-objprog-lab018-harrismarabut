import java.util.Scanner;

public class EvenOddChecker {
   
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        
        System.out.println(checkEvenOdd(number));
        
        scanner.close();
    }
}
