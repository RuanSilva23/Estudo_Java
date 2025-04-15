public class TabelaVerdade {
    public static void main(String[] args){
        System.out.println("Tabela Verdade: ");
        System.out.println("Operador AND( && ):");
        System.out.println("A \t B \t A && B");
        System.out.println(true + "\t"+ true + "\t" + (true && true));
        System.out.println(false + "\t"+ true + "\t" + (false));
        System.out.println(true + "\t"+ false + "\t" + (false));
        System.out.println(false + "\t"+ false + "\t" + (false));

        System.out.println("Operador OR( || ):");
        System.out.println("A \t B \t A || B");
        System.out.println(true + "\t"+ true + "\t" + (true || true));
        System.out.println(false + "\t"+ true + "\t" + (true));
        System.out.println(true + "\t"+ false + "\t" + (true));
        System.out.println(false + "\t"+ false + "\t" + (false));

    }
}
