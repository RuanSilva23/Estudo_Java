package Calculadora;

public enum NomesOperadores {
    SOMA,
    SUBTRACAO,
    DIVISAO,
    MULTIPLICACAO,
    MODULO,
    POTENCIACAO;

    public static NomesOperadores fromCodigo(int codigo){
        switch (codigo){
            case 1:
                return SOMA;

            case 2:
                return SUBTRACAO;

            case 3:
                return MULTIPLICACAO;

            case 4:
                return DIVISAO;


            case 5:
                return MODULO;


            case 6:
                return POTENCIACAO;


            default:
                return null;
        }
    }
}
