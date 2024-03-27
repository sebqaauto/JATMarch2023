package javaBasics;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String [] tue){

        String day;
        int day_number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day ");
        day = scanner.next();
        System.out.println("Please enter the day number");
        day_number = scanner.nextInt();
        scanner.close();

        switch (day) {
            case "Monday":
                System.out.println("TOday is Monday");
                break;
            case "Tuesday":
                System.out.println("TOday is Tuesday");
                break;
            case "Wednesday":
                System.out.println("TOday is Wednesday");
                break;
        
            default:
                System.out.println("TOday is not a valid day according to us ");
                break;
        }

        switch (day_number) {
            case 10:
                System.out.println("TOday is Monday");
                break;
            case 20:
                System.out.println("TOday is Tuesday");
                break;
            case 30:
                System.out.println("TOday is Wednesday");
                break;
                
            default:
                System.out.println("TOday is not a valid day according to us ");
                break;
        }

    }
    
}
