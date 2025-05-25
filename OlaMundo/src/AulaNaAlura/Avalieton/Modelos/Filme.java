package AulaNaAlura.Avalieton.Modelos;

public class Filme {
    private String nome;
    private int totalDeAvaliacao;
    private double mediaAvaliacao;
    private int anoDeLancamento;
    private String incluidoNoPlano;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getIncluidoNoPlano() {
        return incluidoNoPlano = "Incluído";
    }

    public void exibirNome(){
        System.out.println("O nome do filme: " + nome);
        System.out.println("O ano de lançamento: " + anoDeLancamento);
        System.out.println("Esse filme está " + getIncluidoNoPlano() + " no plano.");
    }

    public void media(double nota){
        mediaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double mediaAvalia(){
        return mediaAvaliacao/totalDeAvaliacao;
    }
}
