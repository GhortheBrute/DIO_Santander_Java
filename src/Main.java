import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Meu comentário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade");
        int age = scanner.nextInt();
        scanner.close();
        System.out.printf("Olá %s, sua idade é %s ", name, age);
    }
}
