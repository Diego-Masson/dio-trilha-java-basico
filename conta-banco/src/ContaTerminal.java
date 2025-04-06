
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Criando um objeto Scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declarando as variáveis que vão armazenar os dados
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita e recebe os dados via terminal
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt(); // Lê o número da conta

        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Lê o número da agência

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble(); // Lê o saldo da conta
        
        // Exibe a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
            + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " 
            + saldo + " já está disponível para saque.");
        
        // Fecha o scanner
        scanner.close();
    }
}
