import java.util.Scanner;
// Sistema que verifica qual é o maior entre cinco numeros.
public class exercicio09 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number01;
        int number02;
        int number03;
        int number04;
        int number05;
        int controlador;

        System.out.println("Digite o primeiro numero : ");
        number01 = input.nextInt();
        System.out.println("Digite o segundo numero : ");
        number02 = input.nextInt();
        System.out.println("Digite o terceiro numero : ");
        number03 = input.nextInt();
        System.out.println("Digite o quarto numero : ");
        number04 = input.nextInt();
        System.out.println("Digite o quinto numero : ");
        number05 = input.nextInt();

        controlador = number01;

        if (controlador < number02){
            controlador = number02;
        }
        if (controlador < number03){
            controlador = number03;
        }
        if (controlador < number04){
            controlador = number04;
        }
        if (controlador < number05){
            controlador = number05;
        }

        System.out.printf("%d é o maior numero.", controlador);

    }
}
