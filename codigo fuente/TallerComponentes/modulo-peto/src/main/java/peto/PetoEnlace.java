package peto;

import core.GemaEnergia;

public class PetoEnlace {
    private final GemaEnergia gema;

    public PetoEnlace(GemaEnergia gema) {
        this.gema = gema;
    }

    public boolean escudoActivo(GemaEnergia botas) {
        boolean escudoBase = gema == null || gema.tieneCarga();
        boolean escudoBotas = botas == null || botas.tieneCarga();
        return escudoBase && escudoBotas;
    }
}
