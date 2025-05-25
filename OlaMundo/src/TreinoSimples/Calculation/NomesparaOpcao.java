package TreinoSimples.Calculation;

public enum NomesparaOpcao {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO,
    MODULO,
    SAIR;

    public static NomesparaOpcao fromCodigo(int codigo){
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
                return SAIR;

            default:
                return null;
        }
    }
}
