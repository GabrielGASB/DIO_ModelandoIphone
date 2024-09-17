package Navegador;

import interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página do Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do Safari");
    }
}
