import java.util.Scanner;

public class exercicio08 {
    
    public static void main (String[] args){

        int number01;
        int number02;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        number01 = input.nextInt();

        System.out.println("Digite um outro numero : ");
        number02 = input.nextInt();

        System.out.printf("%d + %d = %d\n", number01, number02, (number01 + number02));
        System.out.printf("%d - %d = %d\n", number01, number02, (number01 - number02));
        System.out.printf("%d * %d = %d\n", number01, number02, (number01 * number02));
        System.out.printf("%d / %d = %d\n", number01, number02, (number01 / number02));
        System.out.printf("A media de %d e %d = %d\n", number01, number02, ((number01 + number02)/2));

        if (number01 == number02){
            System.out.println("Os numeros são iguais.");
        }
        if (number01 > number02){
            System.out.println("O primeiro numero é o maior");
        }
        if (number01 < number02){
            System.out.println("O segundo numero é o maior.");
        }
    }
}
