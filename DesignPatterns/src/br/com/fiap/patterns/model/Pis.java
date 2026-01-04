package br.com.fiap.patterns.model;

import br.com.fiap.patterns.config.ConfigSingleton;

import java.io.IOException;
import java.util.Observable;

public class Pis extends Observable implements Imposto{

    private float aliquota;
    private float valorPis;

    public Pis() throws IOException {
        aliquota = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquota"));
    }

    @Override
    public void CalcularImposto(float valor) {
        setChanged();
        valorPis = valor * aliquota;
        notifyObservers(valorPis);
    }

    public float getValorPis() {
        return valorPis;
    }
}
