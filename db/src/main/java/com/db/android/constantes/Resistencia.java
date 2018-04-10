package com.db.android.constantes;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum Resistencia {

    UNO("Resistencia al Impulso de Tensión U W en kV: 1"),
    DOS("Resistencia al Impulso de Tensión U W en kV: 1.5"),
    TRES("Resistencia al Impulso de Tensión U W en kV: 2.5"),
    CUATRO("Resistencia al Impulso de Tensión U W en kV: 4"),
    CINCO("Resistencia al Impulso de Tensión U W en kV: 6"),
    TODAS("Resistencia al Impulso de Tensión U W en kV: 1 - 1.5 - 2.5 - 4 - 6");

    private final String descripcion;

    Resistencia(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
