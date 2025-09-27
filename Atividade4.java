import java.util.Scanner;

public class Atividade4
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);

            System.out.printf ("Digite um número: ");
            float numero_original = entrada.nextFloat();
            float numero_dobrado = numero_original *= 2;

            System.out.printf ("O dobro desse número é: %.2f ", numero_dobrado);

        }
    }
