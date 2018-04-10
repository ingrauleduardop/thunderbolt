package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 08/01/17.
 */
public enum RiesgoAlFuego {

    EXPLOSION_1("Explosión: Zona 0, 20. Sólidos explosivos", 1.0),
    EXPLOSION_2("Explosión: Zona 1, 21",Math.pow(10,-1)),
    EXPLOSION_3("Explosión: Zona 2, 22",Math.pow(10,-2)),
    FUEGO_1("Fuego: Alto",Math.pow(10,-1)),
    FUEGO_2("Fuego: Ordinario",Math.pow(10,-2)),
    FUEGO_3("Fuego: Bajo",Math.pow(10,-3)),
    EXPLOSION_O_FUEGO("Ninguno", 0.0);

    private final String descripcion;
    private final Double valor;

    RiesgoAlFuego(String descripcion, Double valor) {
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
        for(RiesgoAlFuego vEnum: RiesgoAlFuego.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
