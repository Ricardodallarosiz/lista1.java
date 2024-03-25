import java.util.Scanner; 
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        int nm1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        int nm2 = scanner.nextInt();
        System.out.println(nm1 + nm2);
        scanner.close();     
    }
    
}
