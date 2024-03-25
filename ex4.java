import java.util.Scanner; 
public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        double numero1 = scanner.nextInt();
        System.out.println("digite outro numero: ");
        double numero2 = scanner.nextInt();
        System.out.println("soma: " + (numero1 + numero2) );
        System.out.println("subtração: " + (numero1 - numero2));
        System.out.println("multiplicação: " + (numero1 * numero2));
        System.out.println("divisão: " + (numero1 / numero2));
        scanner.close();
        
    }
    
}
