import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência !");
            agencia = sc.nextLine();


            System.out.println("Por favor, digite o número da conta !");

            numero = sc.nextInt();

            System.out.println("Por favor, digite o Nome do cliente");
            nomeCliente = sc.nextLine();
            
            System.out.println("Por favor, digite o saldo");
            saldo = sc.nextDouble();
        }

        System.out.println("Ola " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque." );
        

    }
}
