import java.util.Scanner; 
public class ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:  ");
        int nu = scanner.nextInt();
        if(nu >= 50){
            System.err.println("esse numero é maior ou igual a 50");
        }else{
            System.out.println("menor que 50");
        }
        

    }
    

    
}
