package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeRiesgoEspecial {

    UNO("No hay riesgo especial.", 1),
    DOS("Bajo riesgo de pánico. (Ejemplo estructuras limitadas a dos plantas con capacidad para 100 personas).", 2),
    TRES("Nivel medio de pánico. (Ejemplo estructuras para eventos culturales y deportivos con 100 a 1000 visitantes).", 5),
    CUATRO("Dificulta de evacuación. (Ejemplo estructuras con personas inmóviles, hospitales)", 5),
    CINCO("Alto riesgo de pánico. (Ejemplo: Estructuras para eventos culturales y deportivos con más de 1000 visitantes)", 10);

    private final String descripcion;
    private final Integer valor;

    TipoDeRiesgoEspecial(String descripcion, Integer valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public  Integer getValor(){
        return valor;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(TipoDeRiesgoEspecial vEnum: TipoDeRiesgoEspecial.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
