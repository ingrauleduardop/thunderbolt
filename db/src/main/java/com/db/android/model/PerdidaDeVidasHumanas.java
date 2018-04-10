package com.db.android.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by conamerica36 on 14/01/17.
 */
@DatabaseTable(tableName="perdida_de_vidas_humanas")
public class PerdidaDeVidasHumanas {

    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private Long id;

    @DatabaseField
    private Double calculoLa;

    @DatabaseField
    private Double calculoLb;

    @DatabaseField
    private Double calculoLc;

    public PerdidaDeVidasHumanas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCalculoLa() {
        return calculoLa;
    }

    public void setCalculoLa(Double calculoLa) {
        this.calculoLa = calculoLa;
    }

    public Double getCalculoLb() {
        return calculoLb;
    }

    public void setCalculoLb(Double calculoLb) {
        this.calculoLb = calculoLb;
    }

    public Double getCalculoLc() {
        return calculoLc;
    }

    public void setCalculoLc(Double calculoLc) {
        this.calculoLc = calculoLc;
    }
}
