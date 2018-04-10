package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum MedidaDeProteccion {

    MEDIDA_UNO("Ninguna medida de protección",1.00),
    MEDIDA_DOS("Avisos de Advertencia",Math.pow(10,-1)),
    MEDIDA_TRES("Aislamiento Eléctrico",Math.pow(10,-2)),
    MEDIDA_CUATRO("Restricciones Físicas",0.00);

    private final String descripcion;
    private final Double valor;

    MedidaDeProteccion(String descripcion, Double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getdescripcion() {
        return descripcion;
    }
    public  Double getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return descripcion;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(MedidaDeProteccion vEnum: MedidaDeProteccion.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
