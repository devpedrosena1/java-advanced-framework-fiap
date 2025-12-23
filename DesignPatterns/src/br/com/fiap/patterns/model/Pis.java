package br.com.fiap.patterns.model;

import java.util.Observable;

public class Pis extends Observable implements Imposto{

    private float aliquota = 0.6f;
    private float valorPis;

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
