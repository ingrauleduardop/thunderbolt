package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andres y Jess on 23/11/2016.
 */

public enum MedidasDeProteccionAdicionales {

    NINGUNA_MEDIDA_DE_PROTECCION("Ninguna medida de protección",1.00),
    AVISOS_DE_ADVERTENCIA("Avisos de advertencia",Math.pow(10,-1)),
    AISLAMIENTO_ELECTRICO("Aislamiento Eléctrico (ejemplo 3 mm de polietileno reticulado) de las partes expuestas (por ejemplo conductores bajantes)",Math.pow(10,-2)),
    CONTROL_EFECTIVO_DE_POTENCIA_A_TIERRA("Control efectivo de potencial a tierra ",Math.pow(10,-2)),
    RESTRICCIONES_FISICAS_O_ESTRUCTURALES_DEL_EDIFICIO("Restricciones físicas o estructurales del edificio utilizados como conductores bajantes",0.00);

    private final String descripcion;
    private final Double valor;
    MedidasDeProteccionAdicionales(String descripcion, Double valor) {
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
        for(MedidasDeProteccionAdicionales vEnum: MedidasDeProteccionAdicionales.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
