import java.util.Scanner;

public class checkLeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the year :");
        Scanner userInput = new Scanner(System.in);
        int year = userInput.nextInt();
        if (year%400==0) {
            System.out.println("This is a leap year");
        }
        else if(  year % 4 ==0 ){
            System.out.println("This is a leap year");
        }

        else if( year %100==0){
            System.out.println("This is not a leap year");
        }
        
        else {
            System.out.println("This is not a leap year");
        }
    }
}
