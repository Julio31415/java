import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number01;
        int number02;
        int number03;
        int product;

        System.out.println("Digite um numero: ");
        number01 = input.nextInt();

        System.out.println("Digite outro numero: ");
        number02 = input.nextInt();

        System.out.println("Digite mais um numero: ");
        number03 = input.nextInt();

        product = number01 * number02 * number03;
        System.out.printf("O valor do produto é : %d",product);
    
    }
}
