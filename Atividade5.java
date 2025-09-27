import java.util.Scanner;

public class Atividade5
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.printf ("Digite um lado do quadrado: ");
            float lado_quadrado = entrada.nextFloat();
            float perimetro_quadrado = lado_quadrado*lado_quadrado;
            float area_quadrado = lado_quadrado * lado_quadrado;

            System.out.printf ("A área do quadrado é %.2f unidade(s) de área\n", area_quadrado);
            System.out.printf ("O perímetro do quadrado é %.2f unidade(s) de área", perimetro_quadrado);
        }
    }