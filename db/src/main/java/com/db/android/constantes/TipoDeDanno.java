package com.db.android.constantes;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeDanno {

    LECCIONES("Lecciones"),
    DANNO_FISICOS("Daño físico"),
    FALLA_DE_SISTEMAS_INTERNOS("Falla de sistemas internos");

    private final String descripcion;

    TipoDeDanno(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
