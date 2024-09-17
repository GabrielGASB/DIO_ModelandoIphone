package Discador;

import interfaces.AparelhoTelefonico;

public class DiscadorSecundario implements AparelhoTelefonico {
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada pelo discador secundário");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada pelo discador secundário");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo discador secundário");
    }
}
