package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoCableadoInterno {

    TIPO_UNO("Cable no Apantallado – Ninguna precaución de enrutamiento con el fin de evitar bucles. (Bucles formados por conductores con diferentes enrutamientos en grandes edificios, lo que significa una superficie de bucles de unos 50m 2 )", 1.00),
    TIPO_DOS("Cable no Apantallado – Precaución en enrutamiento a fin de evitar grandes bucles. (Bucles formados por conductores enrutados en el mismo tubo de instalación o buces formados por conductores con diferentes rutas de instalación en edificios pequeños, es decir una superficie de bucle de aproximadamente 10m 2",0.2),
    TIPO_TRES("Cable no Apantallado – Precaución en enrutamiento a fin de evitar bucles (Bucles formados por conductores enrutados por el mismo cable, lo que significa una superficie de aproximadamente 0, 5m 2",0.01),
    TIPO_CUATRO("Cables Apantallados y cables enrutados en conductos metálicos.\n (Apantallamiento de cables y conductos metálicos conectados en ambos extremos a la barra del sistema equipotencial.",0.0001);

    private final String descripcion;
    private final Double valor;

    TipoCableadoInterno(String descripcion, Double valor) {
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
        for(TipoCableadoInterno vEnum: TipoCableadoInterno.values()){
            String[] valuesEnum= new String[2];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
