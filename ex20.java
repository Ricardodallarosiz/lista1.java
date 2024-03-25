import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo da viagem em horas:");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h:");
        double velocidadeMedia = scanner.nextDouble();

        scanner.close();

        
        double distancia = tempoViagem * velocidadeMedia;

      
        double consumo = 12; 
        double litrosCombustivel = distancia / consumo;

        System.out.printf("A quantidade de litros de combustível gasta na viagem é: %.2f\n", litrosCombustivel);
    }
    
}
