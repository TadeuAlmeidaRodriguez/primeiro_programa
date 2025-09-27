import java.util.Scanner;

public class Ativade6
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.printf ("Digite um lado do retângulo: ");
            float lado_um = entrada.nextFloat();
            System.out.printf ("Digite o outro lado do retângulo: ");
            float lado_dois = entrada.nextFloat();

            float area_retangulo = lado_um * lado_dois;
            float perimetro_retangulo = (lado_um*2)+(lado_dois*2);

            System.out.printf ("O perímetro do retângulo é: %.2f", perimetro_retangulo);
            System.out.printf ("\nA área do retângulo é: %.2f", area_retangulo);
        }
    }
