import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro termo (a1) da Progressão Aritmética:");
        double a1 = scanner.nextDouble();

        System.out.println("Digite a ordem do termo desejado (n):");
        int n = scanner.nextInt();

        System.out.println("Digite a razão da Progressão Aritmética:");
        double r = scanner.nextDouble();

        scanner.close();

        
        double an = a1 + (n - 1) * r;

        System.out.println("O " + n + "-ésimo termo da Progressão Aritmética é: " + an);
    }

    
}
