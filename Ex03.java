import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        double raio = sc.nextDouble();

        System.out.print("Digite a altura da lata: ");
        double altura = sc.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de oleo e: " + volume);

        sc.close();
    }
}
