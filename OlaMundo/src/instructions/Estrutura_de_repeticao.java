package instructions;

public class Estrutura_de_repeticao {
    public static void main(String [] args) {
        System.out.println("Estrutura for:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("Estrutura while:");
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        System.out.println("Estrutura do-while:");
        int l = 1;
        do {
            System.out.println(l);
            l++;
        } while (l < 10);
    }
}
