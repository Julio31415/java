import java.util.Scanner;
// Programa que apresenta a soma, multiplicação, divisão e subtração de dois numeros
public class exercicio06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number01;
        int number02;

        System.out.println("Digite um numero : ");
        number01 = input.nextInt();

        System.out.println("Digite um outro numero :");
        number02 = input.nextInt();

        System.out.printf("%d + %d = %d\n",number01,number02,(number01 + number02));
        System.out.printf("%d - %d = %d\n",number01,number02,(number01 - number02));
        System.out.printf("%d / %d = %d\n",number01,number02,(number01 / number02));
        System.out.printf("%d * %d = %d\n",number01,number02,(number01 * number02));
    }
}
