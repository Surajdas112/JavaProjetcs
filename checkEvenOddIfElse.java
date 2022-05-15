import java.util.Scanner;

class checkEvenOddIfElse{
public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter a number to check if it is Even or Odd");
    int number = userInput.nextInt();

    if (number %2==0) {
        System.out.println("The number is even");
    } else {
        System.out.println("The Number is odd");
    }

}




}