package AulaNaAlura.com.Avalieton.Modelos;

public class Titulo {
    private String nome;
    private int totalDeAvaliacao;
    private double mediaAvaliacao;
    private int DuracaoEmMinutos;
    private int anoDeLancamento;
    private String incluidoNoPlano;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getIncluidoNoPlano() {
        return incluidoNoPlano = "Incluído";
    }

    public void exibirNome(){
        System.out.println("O nome do filme: " + nome);
        System.out.println("O ano de lançamento: " + anoDeLancamento);
        System.out.println("A duração: " + DuracaoEmMinutos + " minutos.");
        System.out.println("Esse filme está " + getIncluidoNoPlano() + " no plano.");
    }

    public void media(double nota){
        mediaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double mediaAvalia(){
        return mediaAvaliacao/totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        DuracaoEmMinutos = duracaoEmMinutos;
    }
}
