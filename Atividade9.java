import java.util.Scanner;

public class Atividade9
    {
        public static void main(String[] args)
        {
            int vagas_onibus = 34;
            int vagas_vans = 15;

            Scanner entrada = new Scanner(System.in);

           System.out.printf ("Digite a quantidade de passageiros que querem viajar: ");
           int passageiros_total = entrada.nextInt();

           int quantidade_onibus = (passageiros_total/vagas_onibus);
           int quantidade_vans = (passageiros_total%vagas_onibus)/vagas_vans;
           int passageiros_fora = (passageiros_total%vagas_onibus)%vagas_vans;

           System.out.printf ("A quantidade necessária de ônbius é: %d", quantidade_onibus);
           System.out.printf ("\nA quantdiade de vans necessária é: %d", quantidade_vans);
           System.out.printf ("\nA quantidade de passageiros que esperaram o próximo ciclo é: %d", passageiros_fora);
        }
    }
