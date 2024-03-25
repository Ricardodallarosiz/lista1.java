import java.util.Scanner; 
public class ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês (1 a 12):");
        int numeroMes = scanner.nextInt();

        scanner.close();

        
        if (numeroMes >= 1 && numeroMes <= 12) {
            
            String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
            };

            
            String mesCorrespondente = meses[numeroMes - 1];
            System.out.println("O mês correspondente ao número " + numeroMes + " é " + mesCorrespondente + ".");
        } else {
            System.out.println("Mês inválido! Digite um número de 1 a 12.");
        }

    }
    
}
