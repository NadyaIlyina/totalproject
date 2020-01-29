package fundametails;

import java.util.*;

public class MainTask {
    public static void tasks(String[] args){
        System.out.println("Main Task \n Task 1:");
        System.out.println("Input you name");
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Task 2:");
        System.out.println("Args before reverse: " + Arrays.toString(args));
        List listOfArgs = Arrays.asList(args);
        Collections.reverse(listOfArgs);
        String[] reversed = (String[]) listOfArgs.toArray(args);
        System.out.println("Args after reverse: " + Arrays.toString(reversed));

        System.out.println("Task 3:");
        System.out.println("Input number:");
        int n = in.nextInt();
        System.out.println("In each line: ");
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("In one line: ");
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt() + "  ");
        }
        System.out.println("\n Task 4:");
        int sum=0,m=1;
        System.out.println("Args: " + Arrays.toString(args) + " ");
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            m *= Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + m);

        System.out.println("Task 5:");
        System.out.println("Input number from 1 to 12:");
        n = in.nextInt();
        switch (n){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
