package Discador;

import interfaces.AparelhoTelefonico;

public class DiscadorDefault implements AparelhoTelefonico {
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada pelo discador padrão");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada pelo discador padrão");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo discador padrão");
    }
}
