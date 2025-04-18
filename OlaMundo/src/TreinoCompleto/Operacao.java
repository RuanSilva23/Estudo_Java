package TreinoCompleto;

public enum Operacao {
    SOMA,
    SUBTRACAO_NEGATIVO,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO,
    MODULO;

    public static Operacao fromCodigo(int codigo){
        switch (codigo){
            case 1:
                return SOMA;

            case 2:
                return SUBTRACAO_NEGATIVO;

            case 3:
                return SUBTRACAO;

            case 4:
                return MULTIPLICACAO;

            case 5:
                return DIVISAO;

            case 6:
                return MODULO;

            default:
                return null;
        }
    }

}
