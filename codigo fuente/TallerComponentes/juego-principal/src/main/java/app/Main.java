package app;

import armas.EspadaExplorador;
import botas.BotasEnlace;
import casco.CascoRunico;
import core.GemaEnergia;
import peto.PetoEnlace;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA FINAL: COMPONENT QUEST ===");

        EspadaExplorador espada = new EspadaExplorador();
        System.out.println("Ataque con espada: " + espada.atacar() + " pts");

        GemaEnergia gemaPeto = () -> true;
        PetoEnlace peto = new PetoEnlace(gemaPeto);
        System.out.println("Escudo del peto sin botas: " + peto.escudoActivo(null));

        BotasEnlace botas = new BotasEnlace(true);
        System.out.println("Escudo con botas activas: " + peto.escudoActivo(botas));

        CascoRunico casco = new CascoRunico();
        System.out.println("Defensa elemental ante FUEGO: " + casco.resistirAtaque("FUEGO"));
    }
}
