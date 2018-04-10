package com.db.android.constantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by conamerica36 on 14/01/17.
 */
public enum TipoDeLineaDePotencia {

    LINEA_TIPO_UNO("Línea aérea o subterránea, no protegidos o protegidos, cuyo blindaje no está unido a la misma red equipotencial del equipo.",Resistencia.TODAS,1.00),
    LINEA_TIPO_DOS_RESISTENCIA_UNO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (5Ω/km < RS ≤ 20Ω/km)", Resistencia.UNO, 1.00),
    LINEA_TIPO_DOS_RESISTENCIA_DOS("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (5Ω/km < RS ≤ 20Ω/km)", Resistencia.DOS, 1.00),
    LINEA_TIPO_DOS_RESISTENCIA_TRES("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (5Ω/km < RS ≤ 20Ω/km)", Resistencia.TRES, 0.95),
    LINEA_TIPO_DOS_RESISTENCIA_CUATRO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (5Ω/km < RS ≤ 20Ω/km)", Resistencia.CUATRO, 0.90),
    LINEA_TIPO_DOS_RESISTENCIA_CINCO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (5Ω/km < RS ≤ 20Ω/km)", Resistencia.CINCO, 0.80),
    LINEA_TIPO_TRES_RESISTENCIA_UNO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (1Ω/km < RS ≤ 5Ω/km)", Resistencia.UNO, 0.9),
    LINEA_TIPO_TRES_RESISTENCIA_DOS("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (1Ω/km < RS ≤ 5Ω/km)", Resistencia.DOS, 0.8),
    LINEA_TIPO_TRES_RESISTENCIA_TRES("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (1Ω/km < RS ≤ 5Ω/km)", Resistencia.TRES, 0.6),
    LINEA_TIPO_TRES_RESISTENCIA_CUATRO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (1Ω/km < RS ≤ 5Ω/km)", Resistencia.CUATRO, 0.3),
    LINEA_TIPO_TRES_RESISTENCIA_CINCO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (1Ω/km < RS ≤ 5Ω/km)", Resistencia.CINCO, 0.1),
    LINEA_TIPO_CUATRO_RESISTENCIA_UNO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (RS ≤ 1 Ω/km)", Resistencia.UNO, 0.6),
    LINEA_TIPO_CUATRO_RESISTENCIA_DOS("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (RS ≤ 1 Ω/km)", Resistencia.DOS, 0.4),
    LINEA_TIPO_CUATRO_RESISTENCIA_TRES("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (RS ≤ 1 Ω/km)", Resistencia.TRES, 0.2),
    LINEA_TIPO_CUATRO_RESISTENCIA_CUATRO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (RS ≤ 1 Ω/km)", Resistencia.CUATRO, 0.04),
    LINEA_TIPO_CUATRO_RESISTENCIA_CINCO("Línea aérea o line subterránea cuyo blindaje está unido a la misma red equipotencial con el equipo (RS ≤ 1 Ω/km)", Resistencia.CINCO, 0.02);

    private final String descripcion;
    private final Resistencia resistencia;
    private final Double valor;

    TipoDeLineaDePotencia(String descripcion, Resistencia resistencia, Double valor) {
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
        for(TipoDeLineaDePotencia vEnum: TipoDeLineaDePotencia.values()){
            String[] valuesEnum= new String[3];
            valuesEnum[0]= vEnum.descripcion;
            valuesEnum[1]= vEnum.valor.toString();
            valuesEnum[2]= vEnum.getResistencia().getDescripcion();
            values.put(vEnum.name(), valuesEnum);
        }
        return values;
    }
}
