package Calculadora;

public class Divisao implements OperacaoMatematica{
    @Override
    public double executar(int x, int y) {
        if (y==0){
            System.out.println("Aviso: Divisão por zero não é permitida");
            return 0;

        }else{
            return (double) x / y;
        }
    }
}
