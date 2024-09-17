package ModeloIphone;

import Discador.DiscadorSecundario;
import Navegador.Firefox;
import Player.Deezer;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone_02 {
    public static void main(String[] args) {
        AparelhoTelefonico discador = new DiscadorSecundario();
        discador.atenderChamada();
        discador.fazerChamada();
        discador.iniciarCorreioVoz();

        NavegadorInternet navegador = new Firefox();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ReprodutorMusical player = new Deezer();
        player.selecionarMusica();
        player.reproduzirMusica();
        player.pausarMusica();
    }

}
