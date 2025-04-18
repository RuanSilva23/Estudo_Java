package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segunda valor: ");
        int y = scanner.nextInt();

        OperacaoMatematica operacao = new Soma();
        int resultado = (int) operacao.executar(x, y);

        System.out.println("Resultado da soma: "+ resultado);

        scanner.close();
    }
}
