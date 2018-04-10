package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 15/01/17.
 */
public enum TipoDeEstructuraParaEconomiaLF {

    UNO("Riesgo de Explosión.",TipoDeDanno.DANNO_FISICOS,1.0),
    DOS("Hospital, Estructura Industrial, Museo, Planta de uso agrícola.",TipoDeDanno.DANNO_FISICOS, 0.5),
    TRES("Hotel, Escuela, Edificio de Oficinas, Iglesias, Centro de Entretenimiento, Planta de uso comercial.",TipoDeDanno.DANNO_FISICOS, 0.2),
    CUATRO("Otras.",TipoDeDanno.DANNO_FISICOS, 0.1);

    private final String descripcion;
    private final TipoDeDanno tipoDeDanno;
    private final Double valor;

    TipoDeEstructuraParaEconomiaLF(String descripcion, TipoDeDanno tipoDeDanno, Double valor) {
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
        for(TipoDeEstructuraParaEconomiaLF vEnum: TipoDeEstructuraParaEconomiaLF.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getTipoDeDanno().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
