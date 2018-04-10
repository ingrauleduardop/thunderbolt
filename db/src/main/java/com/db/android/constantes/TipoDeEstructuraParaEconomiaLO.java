package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 15/01/17.
 */
public enum TipoDeEstructuraParaEconomiaLO {

    UNO("Riesgo de Explosión.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-1)),
    DOS("Hospital, Estructura Industrial, Edificio de Oficinas, Hotel, Planta de uso comercial.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-2)),
    TRES("Museos, Planta de uso comercial, Iglesia, Centro de Entretenimiento.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-3)),
    CUATRO("Otros.",TipoDeDanno.FALLA_DE_SISTEMAS_INTERNOS, Math.pow(10,-4));

    private final String descripcion;
    private final TipoDeDanno tipoDeDanno;
    private final Double valor;

    TipoDeEstructuraParaEconomiaLO(String descripcion, TipoDeDanno tipoDeDanno, Double valor) {
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
        for(TipoDeEstructuraParaEconomiaLO vEnum: TipoDeEstructuraParaEconomiaLO.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getTipoDeDanno().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
