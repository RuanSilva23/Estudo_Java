package instructions;

public class if_else {
    public static void main(String[] args){
        int numero_a = 20;
        int numero_b = -20;
        int soma = numero_a + numero_b;

        // 1º caso : If
        if (soma > 0){
            System.out.println("O número é maior que 0.");
        }

        // 2º Estrutura If-Else:
        if(soma % 2 == 0) {
            System.out.println("O número é par.");
        }else {
            System.out.println("O número é Impar.");
        }

        // 3º Estrutura If-Else Aninhado:
        if (soma > 0){
            System.out.println("O número é positivo.");
        }else if (soma<0){
            System.out.println("O número é negativo.");
        }else{
            System.out.println("O número é igual a 0.");
        }

    }
}
