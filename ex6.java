import java.util.Scanner; 
public class ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor em graus celcius: ");
        int c = scanner.nextInt();
        int f = ((9 * c + 160) / 5 );
        System.err.println("Fahrenheit = " + f);
        scanner.close();

    }
    
}
