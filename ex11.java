import java.util.Arrays;
import java.util.Scanner; 
public class ex11 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor inteiro:");
        int valor3 = scanner.nextInt();
        
        scanner.close();

        
        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);

        
        System.out.println("Valores em ordem crescente:");
        for (int valor : valores) {
            System.out.println(valor);
        }        
    }
    
}
