import java.util.Scanner;

public class Atividade3
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número: ");
            float numero_flutuante = entrada.nextFloat();
            float numero_consecutivo = ++numero_flutuante;
            System.out.printf ("O número consecutivo é: %.2f", numero_consecutivo);
        }
    }
