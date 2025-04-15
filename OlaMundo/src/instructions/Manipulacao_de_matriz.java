package instructions;

public class Manipulacao_de_matriz {
    public static void main(String [] args){
        int[][] matriz = {
                {1, 10, 15},
                {20, 5, 6}
        };
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" "+' ');
            }
            System.out.println();
        }

        System.out.println("O número da linha 2 e coluna 2 é "+matriz[1][1]);

        matriz[0][1] = 50;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" "+' ');
            }
            System.out.println();
        }

    }
}
