package com.db.android.model;

import com.db.android.constantes.Ambiente;
import com.db.android.constantes.EnrutamientoDeAcometida;
import com.db.android.constantes.Estado;
import com.db.android.constantes.Estatus;
import com.db.android.constantes.EstructuraEnEvaluacion;
import com.db.android.constantes.MedidaContraFuego;
import com.db.android.constantes.MedidaDeProteccion;
import com.db.android.constantes.MedidasDeProteccionAdicionales;
import com.db.android.constantes.NivelDeProteccionContraRayos;
import com.db.android.constantes.NivelDeProteccionContraRayosLPL;
import com.db.android.constantes.PropiedadesDeLaEstructura;
import com.db.android.constantes.RiesgoAlFuego;
import com.db.android.constantes.TipoCableadoInterno;
import com.db.android.constantes.TipoDeEstructuraConValorCultural;
import com.db.android.constantes.TipoDeEstructuraParaEconomiaLF;
import com.db.android.constantes.TipoDeEstructuraParaEconomiaLO;
import com.db.android.constantes.TipoDeEstructuraParaVidaHumanaLF;
import com.db.android.constantes.TipoDeEstructuraParaVidaHumanaLO;
import com.db.android.constantes.TipoDeLinea;
import com.db.android.constantes.TipoDeLineaDePotencia;
import com.db.android.constantes.TipoDeLineaExterna;
import com.db.android.constantes.TipoDeRiesgoEspecial;
import com.db.android.constantes.TipoDeServicioLF;
import com.db.android.constantes.TipoDeServicioLO;
import com.db.android.constantes.TipoDeSuelo;
import com.db.android.constantes.TransformadorEnAcometida;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Andres y Jess on 20/11/2016.
 */
@DatabaseTable(tableName="proyecto")
public class Proyecto implements Serializable {

    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private Long id;

    @DatabaseField
    private String nombreEstructura;

    @DatabaseField
    private String pais;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private Estado estado;

    @DatabaseField
    private String direccion;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_usuario")
    private Usuario usuario;

    @DatabaseField
    private Date fechaCreacion;

    @DatabaseField
    private Integer personasEnLaZona;

    @DatabaseField
    private Integer personasEnLaEstructura;

    @DatabaseField
    private Double valorCultural;

    @DatabaseField
    private Double valorPatrimonial;

    @DatabaseField
    private Integer numeroDeAnimalesEnLaZona;

    @DatabaseField
    private Double valorMonetarioDeLaEstructura;

    @DatabaseField
    private Double valorMonetarioDelContenido;

    @DatabaseField
    private Double valorMonetarioDeLosSistemasInternos;

    @DatabaseField
    private Integer longitudDeLaAcometida;

    @DatabaseField
    private Integer tiempoDePermanenciaAlAnno;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_dimension_estructura")
    private DimensionesEstructura  dimensionesEstructura;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private EstructuraEnEvaluacion estructuraEnEvaluacion;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private EnrutamientoDeAcometida enrutamientoDeAcometida;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TransformadorEnAcometida transformadorEnAcometida;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private Ambiente ambiente;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private Estatus estatus;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private MedidasDeProteccionAdicionales medidasDeProteccionAdicionales;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private PropiedadesDeLaEstructura propiedadesDeLaEstructura;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private NivelDeProteccionContraRayos nivelDeProteccionContraRayos;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeLineaExterna tipoDeLineaExterna;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoCableadoInterno tipoCableadoInterno;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private MedidaDeProteccion medidaDeProteccion;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeLineaDePotencia tipoDeLineaDePotencia;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeLinea tipoDeLinea;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeSuelo tipoDeSuelo;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private MedidaContraFuego medidaContraFuego;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private RiesgoAlFuego riesgoAlFuego;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeRiesgoEspecial tipoDeRiesgoEspecial;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeEstructuraParaVidaHumanaLF tipoDeEstructuraParaVidaHumanaLF;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeEstructuraParaVidaHumanaLO tipoDeEstructuraParaVidaHumanaLO;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeEstructuraParaEconomiaLF tipoDeEstructuraParaEconomiaLF;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeEstructuraParaEconomiaLO tipoDeEstructuraParaEconomiaLO;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeServicioLF tipoDeServicioLF;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeServicioLO tipoDeServicioLO;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private TipoDeEstructuraConValorCultural tipoDeEstructuraConValorCultural;

    @DatabaseField (dataType = DataType.ENUM_STRING)
    private NivelDeProteccionContraRayosLPL nivelDeProteccionContraRayosLPL;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_numero_eventos_peligrosos")
    private  NumeroEventosPeligorsos numeroEventosPeligorsos;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_probabilidad_de_danno")
    private  ProbabilidadDeDanno probabilidadDeDanno;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_perdida_de_vidas_humanas")
    private  PerdidaDeVidasHumanas perdidaDeVidasHumanas;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_perdidas_inaceptables_de_servicios_publicos")
    private  PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_perdoda_de_valor_cultural_irremplazables")
    private  PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables;

    @DatabaseField(foreign = true, foreignAutoCreate = true , foreignAutoRefresh = true, columnName = "fk_perdidas_economicas")
    private  PerdidasEconomicas perdidasEconomicas;

    @DatabaseField
    private String nombrePDF;

    public  Proyecto(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEstructura() {
        return nombreEstructura;
    }

    public void setNombreEstructura(String nombreEstructura) {
        this.nombreEstructura = nombreEstructura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public NumeroEventosPeligorsos getNumeroEventosPeligorsos() {
        return numeroEventosPeligorsos;
    }

    public void setNumeroEventosPeligorsos(NumeroEventosPeligorsos numeroEventosPeligorsos) {
        this.numeroEventosPeligorsos = numeroEventosPeligorsos;
    }

    public ProbabilidadDeDanno getProbabilidadDeDanno() {
        return probabilidadDeDanno;
    }

    public void setProbabilidadDeDanno(ProbabilidadDeDanno probabilidadDeDanno) {
        this.probabilidadDeDanno = probabilidadDeDanno;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public MedidasDeProteccionAdicionales getMedidasDeProteccionAdicionales() {
        return medidasDeProteccionAdicionales;
    }

    public void setMedidasDeProteccionAdicionales(MedidasDeProteccionAdicionales medidasDeProteccionAdicionales) {
        this.medidasDeProteccionAdicionales = medidasDeProteccionAdicionales;
    }

    public PropiedadesDeLaEstructura getPropiedadesDeLaEstructura() {
        return propiedadesDeLaEstructura;
    }

    public void setPropiedadesDeLaEstructura(PropiedadesDeLaEstructura propiedadesDeLaEstructura) {
        this.propiedadesDeLaEstructura = propiedadesDeLaEstructura;
    }

    public NivelDeProteccionContraRayos getNivelDeProteccionContraRayos() {
        return nivelDeProteccionContraRayos;
    }

    public void setNivelDeProteccionContraRayos(NivelDeProteccionContraRayos nivelDeProteccionContraRayos) {
        this.nivelDeProteccionContraRayos = nivelDeProteccionContraRayos;
    }

    public TipoDeLineaExterna getTipoDeLineaExterna() {
        return tipoDeLineaExterna;
    }

    public void setTipoDeLineaExterna(TipoDeLineaExterna tipoDeLineaExterna) {
        this.tipoDeLineaExterna = tipoDeLineaExterna;
    }

    public TipoCableadoInterno getTipoCableadoInterno() {
        return tipoCableadoInterno;
    }

    public void setTipoCableadoInterno(TipoCableadoInterno tipoCableadoInterno) {
        this.tipoCableadoInterno = tipoCableadoInterno;
    }

    public MedidaDeProteccion getMedidaDeProteccion() {
        return medidaDeProteccion;
    }

    public void setMedidaDeProteccion(MedidaDeProteccion medidaDeProteccion) {
        this.medidaDeProteccion = medidaDeProteccion;
    }

    public TipoDeLineaDePotencia getTipoDeLineaDePotencia() {
        return tipoDeLineaDePotencia;
    }

    public void setTipoDeLineaDePotencia(TipoDeLineaDePotencia tipoDeLineaDePotencia) {
        this.tipoDeLineaDePotencia = tipoDeLineaDePotencia;
    }

    public NivelDeProteccionContraRayosLPL getNivelDeProteccionContraRayosLPL() {
        return nivelDeProteccionContraRayosLPL;
    }

    public void setNivelDeProteccionContraRayosLPL(NivelDeProteccionContraRayosLPL nivelDeProteccionContraRayosLPL) {
        this.nivelDeProteccionContraRayosLPL = nivelDeProteccionContraRayosLPL;
    }

    public TipoDeLinea getTipoDeLinea() {
        return tipoDeLinea;
    }

    public void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
        this.tipoDeLinea = tipoDeLinea;
    }

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public Integer getPersonasEnLaZona() {
        return personasEnLaZona;
    }

    public void setPersonasEnLaZona(Integer personasEnLaZona) {
        this.personasEnLaZona = personasEnLaZona;
    }

    public Integer getPersonasEnLaEstructura() {
        return personasEnLaEstructura;
    }

    public void setPersonasEnLaEstructura(Integer personasEnLaEstructura) {
        this.personasEnLaEstructura = personasEnLaEstructura;
    }

    public Integer getTiempoDePermanenciaAlAnno() {
        return tiempoDePermanenciaAlAnno;
    }

    public void setTiempoDePermanenciaAlAnno(Integer tiempoDePermanenciaAlAnno) {
        this.tiempoDePermanenciaAlAnno = tiempoDePermanenciaAlAnno;
    }

    public MedidaContraFuego getMedidaContraFuego() {
        return medidaContraFuego;
    }

    public void setMedidaContraFuego(MedidaContraFuego medidaContraFuego) {
        this.medidaContraFuego = medidaContraFuego;
    }

    public RiesgoAlFuego getRiesgoAlFuego() {
        return riesgoAlFuego;
    }

    public void setRiesgoAlFuego(RiesgoAlFuego riesgoAlFuego) {
        this.riesgoAlFuego = riesgoAlFuego;
    }

    public TipoDeRiesgoEspecial getTipoDeRiesgoEspecial() {
        return tipoDeRiesgoEspecial;
    }

    public void setTipoDeRiesgoEspecial(TipoDeRiesgoEspecial tipoDeRiesgoEspecial) {
        this.tipoDeRiesgoEspecial = tipoDeRiesgoEspecial;
    }

    public TipoDeEstructuraParaVidaHumanaLF getTipoDeEstructuraParaVidaHumanaLF() {
        return tipoDeEstructuraParaVidaHumanaLF;
    }

    public void setTipoDeEstructuraParaVidaHumanaLF(TipoDeEstructuraParaVidaHumanaLF tipoDeEstructuraParaVidaHumanaLF) {
        this.tipoDeEstructuraParaVidaHumanaLF = tipoDeEstructuraParaVidaHumanaLF;
    }

    public TipoDeEstructuraParaVidaHumanaLO getTipoDeEstructuraParaVidaHumanaLO() {
        return tipoDeEstructuraParaVidaHumanaLO;
    }

    public void setTipoDeEstructuraParaVidaHumanaLO(TipoDeEstructuraParaVidaHumanaLO tipoDeEstructuraParaVidaHumanaLO) {
        this.tipoDeEstructuraParaVidaHumanaLO = tipoDeEstructuraParaVidaHumanaLO;
    }

    public TipoDeServicioLF getTipoDeServicioLF() {
        return tipoDeServicioLF;
    }

    public void setTipoDeServicioLF(TipoDeServicioLF tipoDeServicioLF) {
        this.tipoDeServicioLF = tipoDeServicioLF;
    }

    public TipoDeServicioLO getTipoDeServicioLO() {
        return tipoDeServicioLO;
    }

    public void setTipoDeServicioLO(TipoDeServicioLO tipoDeServicioLO) {
        this.tipoDeServicioLO = tipoDeServicioLO;
    }

    public Double getValorCultural() {
        return valorCultural;
    }

    public void setValorCultural(Double valorCultural) {
        this.valorCultural = valorCultural;
    }

    public Double getValorPatrimonial() {
        return valorPatrimonial;
    }

    public void setValorPatrimonial(Double valorPatrimonial) {
        this.valorPatrimonial = valorPatrimonial;
    }

    public TipoDeEstructuraConValorCultural getTipoDeEstructuraConValorCultural() {
        return tipoDeEstructuraConValorCultural;
    }

    public void setTipoDeEstructuraConValorCultural(TipoDeEstructuraConValorCultural tipoDeEstructuraConValorCultural) {
        this.tipoDeEstructuraConValorCultural = tipoDeEstructuraConValorCultural;
    }

    public DimensionesEstructura getDimensionesEstructura() {
        return dimensionesEstructura;
    }

    public void setDimensionesEstructura(DimensionesEstructura dimensionesEstructura) {
        this.dimensionesEstructura = dimensionesEstructura;
    }

    public EstructuraEnEvaluacion getEstructuraEnEvaluacion() {
        return estructuraEnEvaluacion;
    }

    public void setEstructuraEnEvaluacion(EstructuraEnEvaluacion estructuraEnEvaluacion) {
        this.estructuraEnEvaluacion = estructuraEnEvaluacion;
    }

    public EnrutamientoDeAcometida getEnrutamientoDeAcometida() {
        return enrutamientoDeAcometida;
    }

    public void setEnrutamientoDeAcometida(EnrutamientoDeAcometida enrutamientoDeAcometida) {
        this.enrutamientoDeAcometida = enrutamientoDeAcometida;
    }

    public TransformadorEnAcometida getTransformadorEnAcometida() {
        return transformadorEnAcometida;
    }

    public void setTransformadorEnAcometida(TransformadorEnAcometida transformadorEnAcometida) {
        this.transformadorEnAcometida = transformadorEnAcometida;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Integer getLongitudDeLaAcometida() {
        return longitudDeLaAcometida;
    }

    public void setLongitudDeLaAcometida(Integer longitudDeLaAcometida) {
        this.longitudDeLaAcometida = longitudDeLaAcometida;
    }

    public Integer getNumeroDeAnimalesEnLaZona() {
        return numeroDeAnimalesEnLaZona;
    }

    public void setNumeroDeAnimalesEnLaZona(Integer numeroDeAnimalesEnLaZona) {
        this.numeroDeAnimalesEnLaZona = numeroDeAnimalesEnLaZona;
    }

    public Double getValorMonetarioDeLaEstructura() {
        return valorMonetarioDeLaEstructura;
    }

    public void setValorMonetarioDeLaEstructura(Double valorMonetarioDeLaEstructura) {
        this.valorMonetarioDeLaEstructura = valorMonetarioDeLaEstructura;
    }

    public Double getValorMonetarioDelContenido() {
        return valorMonetarioDelContenido;
    }

    public void setValorMonetarioDelContenido(Double valorMonetarioDelContenido) {
        this.valorMonetarioDelContenido = valorMonetarioDelContenido;
    }

    public Double getValorMonetarioDeLosSistemasInternos() {
        return valorMonetarioDeLosSistemasInternos;
    }

    public void setValorMonetarioDeLosSistemasInternos(Double valorMonetarioDeLosSistemasInternos) {
        this.valorMonetarioDeLosSistemasInternos = valorMonetarioDeLosSistemasInternos;
    }

    public PerdidasInaceptablesDeServiciosPublicos getPerdidasInaceptablesDeServiciosPublicos() {
        return perdidasInaceptablesDeServiciosPublicos;
    }

    public void setPerdidasInaceptablesDeServiciosPublicos(PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos) {
        this.perdidasInaceptablesDeServiciosPublicos = perdidasInaceptablesDeServiciosPublicos;
    }

    public PerdidaDeValorCulturalIrremplazables getPerdidaDeValorCulturalIrremplazables() {
        return perdidaDeValorCulturalIrremplazables;
    }

    public void setPerdidaDeValorCulturalIrremplazables(PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables) {
        this.perdidaDeValorCulturalIrremplazables = perdidaDeValorCulturalIrremplazables;
    }

    public PerdidasEconomicas getPerdidasEconomicas() {
        return perdidasEconomicas;
    }

    public void setPerdidasEconomicas(PerdidasEconomicas perdidasEconomicas) {
        this.perdidasEconomicas = perdidasEconomicas;
    }

    public PerdidaDeVidasHumanas getPerdidaDeVidasHumanas() {
        return perdidaDeVidasHumanas;
    }

    public void setPerdidaDeVidasHumanas(PerdidaDeVidasHumanas perdidaDeVidasHumanas) {
        this.perdidaDeVidasHumanas = perdidaDeVidasHumanas;
    }

    public TipoDeEstructuraParaEconomiaLF getTipoDeEstructuraParaEconomiaLF() {
        return tipoDeEstructuraParaEconomiaLF;
    }

    public void setTipoDeEstructuraParaEconomiaLF(TipoDeEstructuraParaEconomiaLF tipoDeEstructuraParaEconomiaLF) {
        this.tipoDeEstructuraParaEconomiaLF = tipoDeEstructuraParaEconomiaLF;
    }

    public TipoDeEstructuraParaEconomiaLO getTipoDeEstructuraParaEconomiaLO() {
        return tipoDeEstructuraParaEconomiaLO;
    }

    public void setTipoDeEstructuraParaEconomiaLO(TipoDeEstructuraParaEconomiaLO tipoDeEstructuraParaEconomiaLO) {
        this.tipoDeEstructuraParaEconomiaLO = tipoDeEstructuraParaEconomiaLO;
    }
}
