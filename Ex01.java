import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
