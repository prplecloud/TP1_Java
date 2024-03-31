import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rentrer votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom);

        System.out.print("Rentrer un nombre réel A : ");
        double a = scanner.nextDouble();
        System.out.print("Rentrer un nombre réel B : ");
        double b = scanner.nextDouble();
        double max = Math.max(a, b);
        System.out.println("Le maximum entre A et B est " + max);

        System.out.print("Rentrer un entier : ");
        int entier = scanner.nextInt();
        if (entier % 2 == 0) {
            System.out.println(entier + " est un nombre pair");
        } else {
            System.out.println(entier + " est un nombre impair");
        }

        scanner.close();
e
        System.out.println("A bientôt");
    }
}
