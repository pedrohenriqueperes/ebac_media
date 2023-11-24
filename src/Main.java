import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double n3 = scanner.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        System.out.println("A média total é "+ media);

    }
}