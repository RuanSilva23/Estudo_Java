package Calculadora;

public class Potenciacao implements OperacaoMatematica {
    public double executar(int x, int y){
        double base = x;
        double expoente = y;
        return Math.pow(base, expoente);
    }
}
