package Calculadora;

public class Modulo implements OperacaoMatematica{
    @Override
    public double executar(int x, int y) {
        return x % y;
    }
}
