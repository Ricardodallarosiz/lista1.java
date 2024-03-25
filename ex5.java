import java.util.Scanner; 
public class ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero para A:");
        int A = scanner.nextInt();
        System.out.println("digite outro numero para B:");
        int B = scanner.nextInt();
        System.out.println("valor de: A  " + A);
        System.out.println("valor de: B  " + B);
        int temp = A;
        A = B;
        B = temp;
        System.out.println("valor de: A  " + A);
        System.out.println("valor de: B  " + B);
        scanner.close();



    }
    
}
