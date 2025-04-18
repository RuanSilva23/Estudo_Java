package Calculadora;

public class Divisao implements OperacaoMatematica{
    @Override
    public double executar(int x, int y) {
        if (y==0){
            return 0;

        }else{
            return (double) x / y;
        }
    }
}
