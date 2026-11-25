import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da prestacao: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a taxa de juros (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o tempo de atraso: ");
        int tempo = sc.nextInt();

        double prestacao = valor + (valor * (taxa / 100.0)) * tempo;

        System.out.println("Valor da prestacao em atraso: " + prestacao);

        sc.close();
    }
}
