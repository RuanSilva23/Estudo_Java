package TreinoSimples.Calculation;

import java.util.Scanner;



public class Interface {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        boolean continuar = true;

        double x = 0;
        double y = 0;

        while(continuar){
            Menu menu = new Menu();
            menu.exibicaoMenu();
            System.out.print("Qual a opção escolhida: ");
            int opcao = leitura.nextInt();

            if (opcao > 6 || opcao <= 0){
                System.out.println("Opção Invalida.");
                System.out.println("Tente Novamente.");
                continue;
            }

            if (opcao < 6){
                 x = primeiroNumero(leitura);
                 y = segundoNumero(leitura);
            }

            NomesparaOpcao operacao = NomesparaOpcao.fromCodigo(opcao);


            switch (operacao){
                case SOMA -> {
                    double soma = x + y;
                    System.out.println("A soma de " + x + " + " + y + " = " + soma);

                }

                case SUBTRACAO -> {
                    double subtracao = x - y;
                    System.out.println("A soma de " + x + " - " + y + " = " + subtracao);

                }

                case MULTIPLICACAO -> {
                    double multi = x * y;
                    System.out.println("A soma de " + x + " * " + y + " = " + multi);

                }

                case DIVISAO -> {
                    System.out.println(" 1 - x/y");
                    System.out.println(" 2 - y/x");
                    int opcaodiv = leitura.nextInt();

                    switch (opcaodiv){
                        case 1:{
                            if (y != 0) {
                                double divpory = x / y;
                                System.out.println("A divisão de " + x + " por " + y + " = " + divpory);
                            }else {
                                System.out.println("Não se dividi nenhum número por 0.");
                            }
                            break;
                        }
                        case 2:{
                            if (y != 0){
                                double divpory = y / x;
                                System.out.println("A divisão de " + y + " por " + x + " = " + divpory);
                            }else {
                                System.out.println("Não se dividi nenhum número por 0.");
                            }
                            break;
                        }
                        default:
                            System.out.println("Opção invalida.");

                    }
                }

                case MODULO -> {
                    int modulo = (int)(x%y);
                    System.out.println("O módulo de " + x + " por " + y + " = " + modulo);
                }

                case SAIR -> {
                    continuar = false;
                    System.out.println("Encerrando.....");

                }

            }
        }
    }

    public static int primeiroNumero(Scanner leitura){
        System.out.print("Escolha o primeiro número: ");
        return leitura.nextInt();
    }

    public static int segundoNumero(Scanner leitura){
        System.out.print("Escolha o segudo número: ");
        return leitura.nextInt();
    }
}
