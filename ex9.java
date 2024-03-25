import java.util.Scanner; 
public class ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero para A:");
        int A = scanner.nextInt();
        System.out.println("digite outro numero para B:");
        int B = scanner.nextInt();
        if(A == B){
            System.out.println("são iguas");
        }else{
            System.out.println("são diferentes");

            if( A > B){
                System.out.println(A + " é maior");
            }else{
                System.out.println(B + " é maior");
            }
        }
        scanner.close();
    }
    
}
