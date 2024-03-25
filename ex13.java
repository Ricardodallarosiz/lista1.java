import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        scanner.close();

        double resultado = 0.0;

        
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return; 
                }
                break;
            default:
                System.out.println("Operador não definido.");
                return; 
        }

        System.out.println("Resultado da operação: " + resultado);
    }

    
}
