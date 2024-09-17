package Navegador;

import interfaces.NavegadorInternet;

public class Firefox implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página do Firefox");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Firefox");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do Firefox");
    }
}
