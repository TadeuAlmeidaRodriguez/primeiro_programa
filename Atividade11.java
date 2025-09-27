import java.util.Scanner;

public class Atividade11
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);


            float media;

            System.out.printf ("Digite a primeira nota: ");
            float primeira_nota = entrada.nextFloat();
            System.out.printf ("Digite a seguanda nota: ");
            float segunda_nota = entrada.nextFloat();

            media = (primeira_nota + segunda_nota)/2;

            System.out.printf ("A media das notas é: %.2f", media);
        }
    }
