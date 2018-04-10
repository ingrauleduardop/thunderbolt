package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeLinea {

    ELECTRICA_UNO("Lineas Eléctricas",Resistencia.UNO, 1.00),
    ELECTRICA_DOS("Lineas Eléctricas",Resistencia.DOS, 0.6),
    ELECTRICA_TRES("Lineas Eléctricas",Resistencia.TRES, 0.3),
    ELECTRICA_CUATRO("Lineas Eléctricas",Resistencia.CUATRO, 0.16),
    ELECTRICA_CINCO("Lineas Eléctricas",Resistencia.CINCO, 0.1),
    TELECOMUNICION_UNO("Lineas de Telecomunicación",Resistencia.UNO, 1.00),
    TELECOMUNICION_DOS("Lineas de Telecomunicación",Resistencia.DOS, 0.5),
    TELECOMUNICION_TRES("Lineas de Telecomunicación",Resistencia.TRES, 0.2),
    TELECOMUNICION_CUATRO("Lineas de Telecomunicación",Resistencia.CUATRO, 0.08),
    TELECOMUNICION_CINCO("Lineas de Telecomunicación",Resistencia.CINCO, 0.04);


    private final String descripcion;
    private final Resistencia resistencia;
    private final Double valor;

    TipoDeLinea(String descripcion, Resistencia resistencia, Double valor) {
        this.descripcion = descripcion;
        this.resistencia = resistencia;
        this.valor = valor;
    }

    public String getdescripcion() {
        return descripcion;
    }
    public Double getValor(){
        return valor;
    }
    public Resistencia getResistencia() {
        return resistencia;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(TipoDeLinea vEnum: TipoDeLinea.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getResistencia().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
