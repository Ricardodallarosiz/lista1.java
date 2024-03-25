import java.util.Scanner; 
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        int A = scanner.nextInt();
        System.out.println("digite outro numero:");
        int B = scanner.nextInt();
        if(A > B){
            System.out.println(A + "  é maior");
        }else{
            System.out.println(B + "  é maior");
        }if(A == B){
            System.out.println("sequência de números informados é inválida");
}
  scanner.close();
}
    
}
