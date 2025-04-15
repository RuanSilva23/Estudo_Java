public class Vetores {
    public static void main(String[] args ){
        int[] number = {1,2,3,4,5};
        String[] nomes = {"José", "Ruan", "Maria Luisa"};
        int[][] matriz = {
                {1,4},
                {4,1}
        };
        System.out.println("Mostrar os números: ");

        for (int i = 0; i < number.length; i++){
            System.out.println("Os números são: "+number[i]);
        }

        for (String nome: nomes){
            System.out.println(nome);
        }



        System.out.println("\nValores da matriz:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }
}
