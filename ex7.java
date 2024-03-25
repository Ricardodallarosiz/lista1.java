import java.util.Scanner; 
public class ex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:  ");
        int num = scanner.nextInt();
        if((num > 100) & num < 200) {
            System.out.println("esta no intervalo");
        }else{
            System.out.println("não esta no intervalo");
        }



    }

    
}
