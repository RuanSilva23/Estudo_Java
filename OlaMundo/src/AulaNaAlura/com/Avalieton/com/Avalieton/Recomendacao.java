package AulaNaAlura.com.Avalieton.com.Avalieton;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento.");

        }else if (classificavel.getClassificacao()>=2) {
            System.out.println("Muito bom");

        }else {
            System.out.println("Esta entre os piores clasificados.");
        }
    }
}
