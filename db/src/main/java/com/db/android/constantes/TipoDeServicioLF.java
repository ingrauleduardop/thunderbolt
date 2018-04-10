package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeServicioLF {

    UNO("Gas, Agua, Suministro energía.",TipoDeDanno.DANNO_FISICOS, Math.pow(10,-1)),
    DOS("TV, Telecomunicación.",TipoDeDanno.DANNO_FISICOS, Math.pow(10,-2));

    private final String descripcion;
    private final TipoDeDanno tipoDeDanno;
    private final Double valor;

    TipoDeServicioLF(String descripcion, TipoDeDanno tipoDeDanno, Double valor) {
        this.descripcion = descripcion;
        this.tipoDeDanno = tipoDeDanno;
        this.valor = valor;
    }

    public String getdescripcion() {
        return descripcion;
    }
    public Double getValor(){
        return valor;
    }
    public TipoDeDanno getTipoDeDanno() {
        return tipoDeDanno;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(TipoDeServicioLF vEnum: TipoDeServicioLF.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getTipoDeDanno().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
