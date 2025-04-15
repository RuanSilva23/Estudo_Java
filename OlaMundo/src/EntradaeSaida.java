import java.util.Scanner;

public class EntradaeSaida {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Nome:
        System.out.println("Digte o seu nome: ");
        String nome = scanner.nextLine();
        //Idade:
        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();
        //Altura:
        System.out.println("Qual é sua altura? ");
        float altura = scanner.nextFloat();


        System.out.println("Olá, "+nome+". Você tem "+idade+" anos e sua altura é de "+altura+" m");

        scanner.close();
    }
}
