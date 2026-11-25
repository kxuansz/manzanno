import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("Temperatura em Celsius: " + celsius);

        sc.close();
    }
}
