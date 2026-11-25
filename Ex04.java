import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade media (em Km/h): ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12.0;

        System.out.println("Velocidade media: " + velocidade + " Km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distancia percorrida: " + distancia + " Km");
        System.out.println("Litros de combustivel usados: " + litrosUsados);

        sc.close();
    }
}
