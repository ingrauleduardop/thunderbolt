package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 08/01/17.
 */
public enum MedidaContraFuego {

    MEDIDA_UNO("No hay medidas",1.0),
    MEDIDA_DOS("Una de las siguientes medidas: Extintores, accionamientos manuales de extinción de incendios, alarmas manuales, hidrantes, zonas de incendio, rutas de escape.", 0.5),
    MEDIDA_TRES("Una de las siguientes medidas accionamientos automáticos de extinción de incendio, alarmas automáticas.", 0.2);

    private final String descripcion;
    private final Double valor;

    MedidaContraFuego(String descripcion, Double valor) {
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
        for(MedidaContraFuego vEnum: MedidaContraFuego.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= String.valueOf(vEnum.valor);
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
