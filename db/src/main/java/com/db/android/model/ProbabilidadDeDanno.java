package com.db.android.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by conamerica36 on 14/01/17.
 */
@DatabaseTable(tableName="probabilidad_de_danno")
public class ProbabilidadDeDanno implements Serializable{

    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private Long id;

    @DatabaseField
    private Double calculo_pa;

    @DatabaseField
    private Double calculo_pb;

    @DatabaseField
    private Double calculo_pc;

    @DatabaseField
    private Double calculo_pM;

    @DatabaseField
    private Double calculo_pU;

    @DatabaseField
    private Double calculo_pV;

    @DatabaseField
    private Double calculo_pW;

    @DatabaseField
    private Double calculo_pZ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCalculo_pa() {
        return calculo_pa;
    }

    public void setCalculo_pa(Double calculo_pa) {
        this.calculo_pa = calculo_pa;
    }

    public Double getCalculo_pb() {
        return calculo_pb;
    }

    public void setCalculo_pb(Double calculo_pb) {
        this.calculo_pb = calculo_pb;
    }

    public Double getCalculo_pc() {
        return calculo_pc;
    }

    public void setCalculo_pc(Double calculo_pc) {
        this.calculo_pc = calculo_pc;
    }

    public Double getCalculo_pM() {
        return calculo_pM;
    }

    public void setCalculo_pM(Double calculo_pM) {
        this.calculo_pM = calculo_pM;
    }

    public Double getCalculo_pU() {
        return calculo_pU;
    }

    public void setCalculo_pU(Double calculo_pU) {
        this.calculo_pU = calculo_pU;
    }

    public Double getCalculo_pV() {
        return calculo_pV;
    }

    public void setCalculo_pV(Double calculo_pV) {
        this.calculo_pV = calculo_pV;
    }

    public Double getCalculo_pW() {
        return calculo_pW;
    }

    public void setCalculo_pW(Double calculo_pW) {
        this.calculo_pW = calculo_pW;
    }

    public Double getCalculo_pZ() {
        return calculo_pZ;
    }

    public void setCalculo_pZ(Double calculo_pZ) {
        this.calculo_pZ = calculo_pZ;
    }
}
