import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            int opcao = exibirTela(scanner);

            if (opcao>6 || opcao < 0){
                System.out.println(" ");
                continue;
            } else if (opcao == 0) {
                continuar = false;
                System.out.println("Obrigado por usar.");
                System.out.println("Encerrando........ ");
            }

            switch (opcao){
                case 1:{
                    double raizX = valor1(scanner);
                    if (raizX < 0 || raizX == 0){
                        System.out.println("Não tem raiz de número negativo nos valores reais. ");
                    }else {
                        double raizQuadrada = Math.sqrt(raizX);
                        System.out.println("A raiz de " + raizX + " = " + raizQuadrada);
                        if (raizQuadrada % 2 == 1){
                            System.out.println("O número é Impar. ");
                        }else {
                            System.out.println("O número é Par. ");
                        }
                    }
                    break;
                }

                case 2:{
                    int somaX = valor1(scanner);
                    int somaY = valor2(scanner);

                    int Soma = somaX + somaY;

                    System.out.println("O resultado da soma é igual a " + Soma);
                    if (Soma % 2 == 1){
                        System.out.println("O número é Impar. ");
                    }else {
                        System.out.println("O número é Par. ");
                    }
                    break;

                }

                case 3:{
                    int subtracaoX = valor1(scanner);
                    int subtracaoY = valor2(scanner);

                    int Subtracao = subtracaoX - subtracaoY;
                    System.out.println("O resultado da subtração é igual a " + Subtracao);
                    if (Subtracao % 2 == 1){
                        System.out.println("O número é Impar. ");
                    }else {
                        System.out.println("O número é Par. ");
                    }
                    break;
                }

                case 4:{
                    int multiX = valor1(scanner);
                    int multiY = valor2(scanner);

                    int Multiplicacao = multiX * multiY;
                    System.out.println("O resultado da multiplicação é igual a " + Multiplicacao);
                    if (Multiplicacao % 2 == 1){
                        System.out.println("O número é Impar. ");
                    }else {
                        System.out.println("O número é Par. ");
                    }
                    break;

                }

                case 5:{
                    int diviX = valor1(scanner);
                    int diviY = valor2(scanner);

                    if (diviX == 0 || diviY == 0 ){
                        System.out.println("Não se dividi nada a zero.");
                    } else {
                       double Divisao = (double) diviX/diviY;
                        System.out.println("O resultado da divisão é igual a " + Divisao);
                        if ((int)Divisao % 2 == 1){
                            System.out.println("O número é Impar. ");
                        }else {
                            System.out.println("O número é Par. ");
                        }
                    }
                    break;

                }

                case 6:{
                    double potencX = valor1(scanner);
                    double potencY = valor2(scanner);

                    double Potenciacao = Math.pow(potencX, potencY);
                    System.out.println("O resultado da potenciação é igual a " + Potenciacao);
                    if (Potenciacao % 2 == 1){
                        System.out.println("O número é Impar. ");
                    }else {
                        System.out.println("O número é Par. ");
                    }
                    break;

                }
            }



        }
    }

    public static int exibirTela(Scanner scanner){
        System.out.println("----- Menu ------ ");
        System.out.println("1 - Raiz Quadrada ");
        System.out.println("2 - Soma");
        System.out.println("3 - Subtração ");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Divisão");
        System.out.println("6 - Potenciação");
        System.out.println("0 - Sair");
        System.out.print("Opção escolhida: ");
        return scanner.nextInt();
    }

    public static int valor1(Scanner scanner){
        System.out.print("Digite o 1° número: ");
        return scanner.nextInt();
    }

    public static int valor2(Scanner scanner){
        System.out.print("Digite o 2° número: ");
        return scanner.nextInt();
    }
}
