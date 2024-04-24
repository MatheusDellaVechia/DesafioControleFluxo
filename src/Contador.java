import exceptions.ParametroInvalidoException;

import java.util.Scanner;
import java.util.logging.Logger;

public class Contador {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) throws ParametroInvalidoException {
        Scanner sc = new Scanner(System.in);
        logger.info("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        logger.info("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException exception) {
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    private static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm > parametroDois)
            throw new ParametroInvalidoException("O segundo parâmetro deve ser maior que o primeiro!");

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            var msg = String.format("Imprimindo o número : %d", i);
            logger.warning(msg);
        }
    }
}