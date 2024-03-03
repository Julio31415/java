import java.util.Scanner;
//PROGRAMA QUE RECEBE UM NUMERO E RETORNA SE É PAR OU IMPAR
public class exercicio10 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int number;

        System.out.println("Digite um numero : ");
        number = input.nextInt();

        if(number % 2 == 0){
            System.out.printf("%d é um numero par.", number);
        }
        if(number % 2 == 1){
            System.out.printf("%d é um numero impar.", number);
        }
    
    }
}
