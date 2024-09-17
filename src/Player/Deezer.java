package Player;

import interfaces.ReprodutorMusical;

public class Deezer implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música pelo Deezer");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no Deezer");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Deezer");
    }
}