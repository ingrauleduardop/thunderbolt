package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 08/01/17.
 */
public enum RiesgoAsociadoALaCapacidad {

    NO_HAY_RIESGO_ESPECIAL("No hay riesgo especial",1),
    BAJO_RIESGO_DE_PANICO("Bajo riesgo de pánico. (Ejemplo estructuras limitadas a dos plantas con capacidad para 100 personas).",2),
    NIVEL_MEDIO_DE_PANICO("Nivel medio de pánico. (Ejemplo estructuras para eventos culturales y deportivos con 100 a 1000 visitantes).",5),
    DIFICULTAD_DE_EVACUACION("Dificulta de evacuación. (Ejemplo estructuras con personas inmóviles, hospitales)",5),
    ALTO_RIESGO_DE_PANICO("Alto riesgo de pánico. (Ejemplo: Estructuras para eventos culturales y deportivos con más de 1000 visitantes)",10);

    private final String descripcion;
    private final float valor;

    RiesgoAsociadoALaCapacidad(String descripcion, float valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getdescripcion() {
        return descripcion;
    }
    public  float getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return descripcion;
    }

    public static Map<String, String[]> mapValuesEnum(){
        Map<String, String[]> values= new HashMap<>();
        for(RiesgoAsociadoALaCapacidad vEnum: RiesgoAsociadoALaCapacidad.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
