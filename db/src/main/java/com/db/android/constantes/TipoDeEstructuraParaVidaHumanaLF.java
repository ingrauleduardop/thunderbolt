package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeEstructuraParaVidaHumanaLF {

    UNO("Riesgo de Explosión.",TipoDeDanno.DANNO_FISICOS, Math.pow(10,-1)),
    DOS("Hospital, Hotel, Escuela, Edificio Público.",TipoDeDanno.DANNO_FISICOS, Math.pow(10,-1)),
    TRES("Edificio con instalaciones de ocio, iglesias y museos.",TipoDeDanno.DANNO_FISICOS, 5*Math.pow(10,-2)),
    CUATRO("Estructuras industriales y planta con fines económicos.",TipoDeDanno.DANNO_FISICOS, 2*Math.pow(10,-2)),
    CINCO("Otras.",TipoDeDanno.DANNO_FISICOS, Math.pow(10,-2));

    private final String descripcion;
    private final TipoDeDanno tipoDeDanno;
    private final Double valor;

    TipoDeEstructuraParaVidaHumanaLF(String descripcion, TipoDeDanno tipoDeDanno, Double valor) {
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
        for(TipoDeEstructuraParaVidaHumanaLF vEnum: TipoDeEstructuraParaVidaHumanaLF.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getTipoDeDanno().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
