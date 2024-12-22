import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            int result;

           
            while (true) {
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();

                if (result == 1 || result == 2) {
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter 1 (pass) or 2 (fail).");
                }
            }

          
            if (result == 1) {
                passes += 1;
            } else {
                failures += 1;
            }

            studentCounter++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
