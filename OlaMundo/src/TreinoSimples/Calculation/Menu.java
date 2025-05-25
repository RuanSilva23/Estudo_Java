package TreinoSimples.Calculation;

public class Menu {
    public void exibicaoMenu(){
        String menu = """
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Módulo
                6 - Sair""";

        System.out.println("------Calculadora------- ");
        System.out.println();
        System.out.println(menu);
    }
}
