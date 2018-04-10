package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 08/01/17.
 */
public enum TipoDeSuelo {

    AGRICOLA_HORMIGON("Agrícola, Hormigón",Math.pow(10,-2)),
    MARMOL_CERAMICA("Marmol, Cerámica",Math.pow(10,-3)),
    GRAVA_MOQUETAS_ALFOMBRA("Grava, Moquetas, Alfombra",Math.pow(10,-4)),
    ASFALTO_LINOLEO_MADERA("Asfalto, Linóleo, Madera",Math.pow(10,-5));

    private final String descripcion;
    private final Double valor;

    TipoDeSuelo(String descripcion, Double valor) {
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
        for(TipoDeSuelo vEnum: TipoDeSuelo.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
