package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum NivelDeProteccionContraRayosLPL {

    SIN_PROTECCION_COORDINADA_CONTRA_SOBRETENSIONES("Sin protección coordinada contra sobretensiones",1.00),
    III_IV("III-IV", 0.05),
    II("II", 0.02),
    I("I", 0.01),
    DISPOSITIVO_DE_PROTECCION_CONTRA_SOBRETENSIONES("Pararrayos con una características de protección mejor que para LPL I (capacidad de derivación de corriente de rayo superior, nivel de protección de tensión más bajo)",0.005);

    private final String descripcion;
    private final Double valor;

    NivelDeProteccionContraRayosLPL(String descripcion, Double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getdescripcion() {
        return descripcion;
    }
    public Double getValor(){
        return valor;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(NivelDeProteccionContraRayosLPL vEnum: NivelDeProteccionContraRayosLPL.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }

}
