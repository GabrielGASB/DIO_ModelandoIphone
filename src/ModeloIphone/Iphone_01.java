package ModeloIphone;

import Discador.DiscadorDefault;
import Navegador.Safari;
import Player.Spotify;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone_01 {
    public static void main(String[] args) {

        DiscadorDefault discador = new DiscadorDefault();
        discador.atenderChamada();
        discador.fazerChamada();
        discador.iniciarCorreioVoz();

        NavegadorInternet navegador = new Safari();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ReprodutorMusical player = new Spotify();
        player.selecionarMusica();
        player.reproduzirMusica();
        player.pausarMusica();

    }
}
