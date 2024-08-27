import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("Hello wild " + name + "!");

        System.out.println("How many dogs do you have? ");
        int dogs = scanner.nextInt();
        System.out.println("Wow, "+dogs+" dogs is something ...");
        
        scanner.nextLine(); // Clears the scanner

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hell yeah, "+food+" is a banger");
    }
}