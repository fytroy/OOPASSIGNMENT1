mport java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "your_username";
        String correctPassword = "your_password";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                attempts--;
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts remaining.");
                } else {
                    System.out.println("No more attempts remaining. Account locked.");
                }
            }
        }
        scanner.close();
    }
}
