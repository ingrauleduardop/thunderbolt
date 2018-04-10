package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeServicioLO {

    UNO("Gas, Agua, Suministro energía.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-2)),
    DOS("TV, Telecomunicación.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-3));

    private final String descripcion;
    private final TipoDeDanno tipoDeDanno;
    private final Double valor;

    TipoDeServicioLO(String descripcion, TipoDeDanno tipoDeDanno, Double valor) {
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
        for(TipoDeServicioLO vEnum: TipoDeServicioLO.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getTipoDeDanno().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
