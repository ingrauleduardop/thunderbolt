package com.db.android.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by conamerica36 on 14/01/17.
 */
@DatabaseTable(tableName="perdidas_inaceptables_de_servicios_publicos")
public class PerdidasInaceptablesDeServiciosPublicos implements Serializable{

    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private Long id;

    @DatabaseField
    private Double calculoLv;

    @DatabaseField
    private Double calculoLm;

    public PerdidasInaceptablesDeServiciosPublicos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCalculoLv() {
        return calculoLv;
    }

    public void setCalculoLv(Double calculoLv) {
        this.calculoLv = calculoLv;
    }

    public Double getCalculoLm() {
        return calculoLm;
    }

    public void setCalculoLm(Double calculoLm) {
        this.calculoLm = calculoLm;
    }
}
