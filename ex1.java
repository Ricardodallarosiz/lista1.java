public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("digite um numero");
         int numero = scanner.nextInt();
         if( numero < 10){
            System.out.println("numero menor ou igual a 10");
         }else{
            System.out.println("numero maior ou igual a 10");
         }

        scanner.close();
    }
}