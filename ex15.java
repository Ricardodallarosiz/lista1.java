import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1 (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do ponto P2 (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        scanner.close();

        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os pontos P1 e P2 é: " + distancia);
    }

}
