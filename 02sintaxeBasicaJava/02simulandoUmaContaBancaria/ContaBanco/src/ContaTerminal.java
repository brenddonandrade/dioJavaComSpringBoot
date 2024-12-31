import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando a variavel tipo scanner para realizar as leituras
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando / capiturando o nome do usuario
        System.out.print("Por favor, digite o nome do usuário.\nNome: ");
        String nome = scanner.next();

        // Solicitando / capiturando o saldo do usuario
        System.out.print("Por favor, digite o saldo atual.\nSaldo: ");
        double saldo = scanner.nextDouble();

        // Solicitando / capiturando a conta do usuario
        System.out.print("Por favor, digite a conta do usuário.\nConta: ");
        int numeroConta = scanner.nextInt();

        // Solicitando / capiturando o saldo do usuario
        System.out.print("Por favor, digite a agência do usuário.\nAngência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.\n");

        return;

    }
}
