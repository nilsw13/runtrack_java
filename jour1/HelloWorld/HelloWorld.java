package jour1.HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom: ");
        String userName = scanner.nextLine();
        System.out.println("hello, "+ userName + "!");
        scanner.close();
    }
}