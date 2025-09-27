import java.util.Scanner;

public class Atividade8
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um valor real: ");
            float valor_real = entrada.nextFloat();
            System.out.printf ("Digite o percentual que você quer: ");
            float valor_percentual = entrada.nextFloat();

            float resultado_operacao = valor_real *(valor_percentual /100);

            System.out.printf ("Resultado: %.1f%% de %.1f é: %.1f", valor_percentual, valor_real, resultado_operacao);
        }
    }
