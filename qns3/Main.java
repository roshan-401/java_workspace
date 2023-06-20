package qns3;
import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class Authenticator {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static void authenticate(String username, String password) throws AuthenticationException {
        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid username or password.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            Authenticator.authenticate(username, password);
            System.out.println("Authentication successful.");
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
