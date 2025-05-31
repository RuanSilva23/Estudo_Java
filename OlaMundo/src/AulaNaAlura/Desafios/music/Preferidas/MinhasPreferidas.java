package AulaNaAlura.Desafios.music.Preferidas;

import AulaNaAlura.Desafios.music.Audios.Audio;

public class MinhasPreferidas {
    public void inclue(Audio audio){
        if (audio.getClassification()>=9){
            System.out.println(audio.getNome() + ": É o favorita da galera.");
        }else{
            System.out.println(audio.getNome() + ": Não é a preferida, porém é uma boa para se escutar");
        }
    }
}
