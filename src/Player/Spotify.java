package Player;

import interfaces.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música pelo Spotify");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no Spotify");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Spotify");
    }
}
