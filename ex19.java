import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro:");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura do cilindro:");
        double altura = scanner.nextDouble();

        scanner.close();

       
        double volume = 3.14 * raio * raio * altura;

        System.out.println("O volume do cilindro é: " + volume);
    }
    
}
