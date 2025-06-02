package AulaNaAlura.com.Avalieton.Modelos;

public class Musica extends Titulo{
    private String estilo;
    private String album;
    private int tempoDaMusica;
    private String cantor;

    public Musica(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getTempoDaMusica() {
        return tempoDaMusica;
    }

    public void setTempoDaMusica(int tempoDaMusica) {
        this.tempoDaMusica = tempoDaMusica;
    }

    public String getCantor() {
        return cantor;
    }


    public void setCantor(String cantor) {
        this.cantor = cantor;
    }


}
