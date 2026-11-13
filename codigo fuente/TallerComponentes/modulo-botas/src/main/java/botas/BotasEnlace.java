package botas;

import core.GemaEnergia;

public class BotasEnlace implements GemaEnergia {
    private final boolean energia;

    public BotasEnlace(boolean energia) {
        this.energia = energia;
    }

    @Override
    public boolean tieneCarga() {
        return energia;
    }
}
