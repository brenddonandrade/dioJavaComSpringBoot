package contador;

import excecoes.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; i++) {
                System.out.println(i);
            }
        }
    }
}
