import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //método main inicia a execução do aplicativo Java
        Scanner input = new Scanner(System.in); // cria um Scanner para obter entrada a partir da janela de comando
        int number1;//primeiro numero a somar
        int number2;//segundo numero a somar
        int sum;//soma de number1 e number2
        System.out.print("Entre com o primeiro numero: ");
        number1 = input.nextInt();//lê o primeiro numero digitado
        System.out.print("Entre com o segundo numero: ");
        number2 = input.nextInt();//lê o segundo numero digitado
        sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);//exibe a soma

    } //fim do metodo main
}//fim da classe addition
