import java.util.Scanner;
//PROGRAMA QUE CALCULA O DIAMETRO, CIRCUNFERENCIA E AREA DE UM CIRCULO
public class exercicio11 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float r;

        System.out.println("Digite o valor do raio : ");
        r = input.nextInt();

        System.out.printf("O valor do Diametro é %.1f \n",(2*r));
        System.out.printf("O Valor da Circunferencia é %.1f \n",(2 * 3.1415 * r));
        System.out.printf("O valor da area é %.1f \n", (3.1415 * r * r));
    }
}
