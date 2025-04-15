public class OperadoresAritmeticos {
    public static void main(String[] args){
        int a = 45;
        int b = 15;

        int soma = a + b;
        System.out.println("Soma:" + soma);

        int subtra = a - b;
        System.out.println("Subtração:" + subtra);

        int multi = a * b;
        System.out.println("Multiplicação: "+ multi);

        int divisao = a/b;
        System.out.println("Divisão: "+ divisao);

        int modulo = a % b;
        System.out.println("modulo(resto):"+ modulo);

        int incremento = 100;
        int decremento = 80;

        incremento++;
        System.out.println(incremento);
        decremento--;
        System.out.println(decremento);
    }
}
