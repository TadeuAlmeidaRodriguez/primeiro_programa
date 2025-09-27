import java.util.Scanner;

public class Atividade10
    {
        public static void main(String[] args)
        {
            int nota_dois = 2;
            int nota_cinco = 5;
            int nota_dez = 10;
            int nota_vinte = 20;
            int nota_cinquenta = 50;
            int nota_cem = 100;


            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite o valor do saque: ");
            int valor_saque = entrada.nextInt();

            int saque_cem = valor_saque/nota_cem;
            int saque_cinquenta = (valor_saque%nota_cem)/nota_cinquenta;
            int saque_vinte = ((valor_saque%nota_cem)%nota_cinquenta)/nota_vinte;
            int saque_dez =  (((valor_saque%nota_cem)%nota_cinquenta)%nota_vinte)/nota_dez;
            int saque_cinco = ((((valor_saque%nota_cem)%nota_cinquenta)%nota_vinte)%nota_dez)/nota_cinco;
            int saque_dois = (((((valor_saque%nota_cem)%nota_cinquenta)%nota_vinte)%nota_dez)%nota_cinco)/nota_dois;
            int valor_restante = (((((valor_saque%nota_cem)%nota_cinquenta)%nota_vinte)%nota_dez)%nota_cinco)%nota_dois;

            System.out.println ("Quantidade de notas para sacar");
            System.out.printf ("Notas de 100: %d\n", saque_cem);
            System.out.printf ("Notas de 50: %d\n", saque_cinquenta);
            System.out.printf ("Notas de 20: %d\n", saque_vinte);
            System.out.printf ("Notas de 10: %d\n", saque_dez);
            System.out.printf ("Notas de 5: %d\n", saque_cinco);
            System.out.printf ("Notas de 2: %d\n", saque_dois);
            System.out.printf ("Valor restante que ficará sem ser sacado do caixa: %d", valor_restante);

        }
    }
