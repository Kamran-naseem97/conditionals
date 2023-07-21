import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Please input a number and press enter");
        long num1 = scanner.nextLong();
        System.out.println("Please input another number and press enter");
        long num2 = scanner.nextLong();
        if (num1 > num2) System.out.println("Your first number is greater");
        else System.out.println("Your second number is greater");

        System.out.println("----------------------------------------------------------");
        System.out.println("Please input another number");
        long num3 = scanner.nextLong();
        if ((num3%2) == 1 ) System.out.println("Your number is odd");
        else System.out.println("Your number is even");

        System.out.println("Please input a traffic light colour (green or red)");
        String  trafficLight = scanner.next();
        if (trafficLight.equals("green")) System.out.println("Green means go");
        else if (trafficLight.equals("red")) System.out.println("Red means stop"); */

        System.out.println("Please input a number between 1 and 12");
        int num1 = scanner.nextInt();
        switch (num1){
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
        }
    }
}