package AulaNaAlura.Desafios.music.Audios;

public class Music extends Audio{
    private String album;
    private String cantor;
    private int anoDeLancamento;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public int getClassification() {
        if (this.getTotalDeReproducao()>4000){
            return 10;
        }else {
            return 5;
        }
    }

    public void exibirInformacoesMusic(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cantor: " + getCantor());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Album: " + getAlbum());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Curtidas: " + getCurtida());
        System.out.println("Reproduções: " + getTotalDeReproducao());
    }
}
