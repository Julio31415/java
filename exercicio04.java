//COMPARA INTEIROS UTILIZANDO INSTRUÇÕES IF, OPERAÇÕES RELACIONAIS E OPERADORES DE IGUALDADE
import java.util.Scanner;//IMPORTA A BIBLIOTECA SCANNER
public class exercicio04 {
    //METODO MAIN INICIA A EXECUÇÃO DO APP JAVA
    public static void main(String[] args) {
        //cria o Scanner para leitura de dados
        Scanner input = new Scanner(System.in);

        int number01;
        int number02;

        System.out.print("Entre com o primeiro numero: ");
        number01 = input.nextInt();
        System.out.print("Entre com o segundo numero: ");
        number02 = input.nextInt();

        if (number01 == number02){
            System.out.printf("%d == %d \n",number01,number02);}
        if (number01 != number02)
            System.out.printf("%d != %d \n",number01,number02);
        if (number01 < number02)
            System.out.printf("%d < %d \n",number01,number02);
        if (number01 > number02)
            System.out.printf("%d > %d \n",number01,number02);
        if (number01 <= number02)
            System.out.printf("%d <= %d \n",number01,number02);
        if (number01 >= number02)
            System.out.printf("%d >= %d \n",number01,number02);
    }
}
