public class OperadorTernario {
    public static void main(String[] args){
        int a = 20;
        int b = 80;

        int expre = (a + b)/2;

        int maior = (a > expre)? a:expre;
        System.out.println("O maior número é o " + a + " ou " + expre + ": " + maior);
    }
}
