import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int weeks;

        System.out.println("Enter a number of weeks: ");
        weeks = scan.nextInt();

        System.out.println("days: " + (weeks)*7);
        System.out.println("hours: " + (weeks)*168);
        System.out.println("minutes: " + (weeks)*10080);
        System.out.println("seconds: " + (weeks)*604800);


    }
}

