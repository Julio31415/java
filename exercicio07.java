import java.util.Scanner;

public class exercicio07 {
    public static void main (String[] args){

        int number01;
        int number02;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        number01 = input.nextInt();

        System.out.println("Digite um outro numero : ");
        number02 = input.nextInt();

        if (number01 == number02){
            System.out.println("Ambos os numeros são iguais.");
        }
        if(number01 > number02){
            System.out.printf("%d é o maior numero.",number01);
        }
        if(number02 > number01){
            System.out.printf("%d é o maior numero.", number02);
        }
    }
}
