package pack;

import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept marks for two subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();

        // Check pass or fail
        if (subject1 >= 35 && subject2 >= 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
