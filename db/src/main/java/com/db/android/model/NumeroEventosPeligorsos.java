package com.db.android.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by Andres y Jess on 21/11/2016.
 */
@DatabaseTable(tableName="numero_eventos_peligrosos")
public class NumeroEventosPeligorsos implements Serializable{

    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private Long id;

    @DatabaseField
     private Double calculoNp;

    @DatabaseField
    private Double calculoNm;

    @DatabaseField
    private Double calculoNl;

    @DatabaseField
    private Double calculoNi;

    public NumeroEventosPeligorsos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCalculoNp() {
        return calculoNp;
    }

    public void setCalculoNp(Double calculoNp) {
        this.calculoNp = calculoNp;
    }

    public Double getCalculoNm() {
        return calculoNm;
    }

    public void setCalculoNm(Double calculoNm) {
        this.calculoNm = calculoNm;
    }

    public Double getCalculoNl() {
        return calculoNl;
    }

    public void setCalculoNl(Double calculoNl) {
        this.calculoNl = calculoNl;
    }

    public Double getCalculoNi() {
        return calculoNi;
    }

    public void setCalculoNi(Double calculoNi) {
        this.calculoNi = calculoNi;
    }
}
