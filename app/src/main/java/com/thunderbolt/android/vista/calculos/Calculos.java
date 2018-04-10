package com.thunderbolt.android.vista.calculos;

import com.db.android.model.DimensionesEstructura;
import com.db.android.model.Proyecto;

/**
 * Created by Andres y Jess on 23/11/2016.
 */

public class Calculos {

    public static final Double K_S1= 0.12;
    public static final Double K_S2= 0.12;
    public static final Integer K_S4= 1;

    public static Double s1AD(DimensionesEstructura dimension) {
        return  (dimension.getLargo() * dimension.getAncho()) + (2 * (3 * dimension.getAlto()) * (dimension.getLargo() + dimension.getAncho())) + (3.1416 * Math.pow(3 * dimension.getAlto(), 2));
    }

    public static Double ng(Double valor){
        return  0.1*valor;
    }

    public static Double s1Nd(Proyecto proyecto){
        return ng((double) proyecto.getEstado().getValor())*s1AD(proyecto.getDimensionesEstructura())*proyecto.getEstructuraEnEvaluacion().getValor()* Math.pow(10, -6);
    }

    public static Double s2Am(DimensionesEstructura dimension){
        return (dimension.getLargo()*dimension.getAncho())+2*(500*dimension.getLargo())*3.1416*Math.pow(500,2);
    }

    public static Double S2Nm(Proyecto proyecto){
        return ng((double) proyecto.getEstado().getValor())*s2Am(proyecto.getDimensionesEstructura())*Math.pow(10,-6);
    }

    public static Double s3Al(Double l){
        return 40*l;
    }

   public static Double s3Nl(Proyecto proyecto){
       return ng((double) proyecto.getEstado().getValor())*s3Al(Double.valueOf(proyecto.getLongitudDeLaAcometida()))*proyecto.getAmbiente().getValor()*proyecto.getEnrutamientoDeAcometida().getValor()*proyecto.getTransformadorEnAcometida().getValor()*Math.pow(10,-6) ;
   }

    public static Double s4Al(Double l){
        return 4000*l;
    }

    public static Double s4Ni(Proyecto proyecto){
        return ng((double) proyecto.getEstado().getValor())*s4Al(Double.valueOf(proyecto.getLongitudDeLaAcometida()))*proyecto.getAmbiente().getValor()*proyecto.getEnrutamientoDeAcometida().getValor()*proyecto.getTransformadorEnAcometida().getValor()*Math.pow(10,-6);
    }

    public static Double calculoPAProbabilidadDeDanno(Proyecto proyecto){
        return proyecto.getMedidasDeProteccionAdicionales().getValor()*proyecto.getPropiedadesDeLaEstructura().getValor();
    }

    public static Double calculoPCProbabilidadDeDanno(Proyecto proyecto){
        return proyecto.getNivelDeProteccionContraRayosLPL().getValor()*proyecto.getTipoDeLineaExterna().getValorCLD();
    }

    public static Double calculoPMProbabilidadDeDanno(Proyecto proyecto){
        return proyecto.getNivelDeProteccionContraRayosLPL().getValor()*pMS(proyecto);
    }

    public static Double pMS(Proyecto proyecto){
        return Math.pow((K_S1*K_S2*proyecto.getTipoCableadoInterno().getValor()*K_S4),2);
    }

    public static Double calculoPUProbabilidadDeDanno(Proyecto proyecto){
        return proyecto.getMedidaDeProteccion().getValor()*proyecto.getNivelDeProteccionContraRayos().getValor()*proyecto.getTipoDeLineaDePotencia().getValor()*proyecto.getTipoDeLineaExterna().getValorCLD();
    }

    public static Double calculoPVProbabilidadDeDanno(Proyecto proyecto){
        return  proyecto.getNivelDeProteccionContraRayos().getValor()*proyecto.getTipoDeLineaDePotencia().getValor()*proyecto.getTipoDeLineaExterna().getValorCLD();
    }

    public static Double calculoPWProbabilidadDeDanno(Proyecto proyecto){
        return proyecto.getNivelDeProteccionContraRayosLPL().getValor()*proyecto.getTipoDeLineaDePotencia().getValor()*proyecto.getTipoDeLineaExterna().getValorCLD();
    }

    public static Double pZ(Proyecto proyecto){
        return proyecto.getNivelDeProteccionContraRayosLPL().getValor()*proyecto.getTipoDeLinea().getValor()*proyecto.getTipoDeLineaExterna().getValorCLI();
    }

    public static Double calculoLAPerdidaDeVidasHumanas(Proyecto proyecto){
       return ((proyecto.getTipoDeSuelo().getValor()*Math.pow(10,-2)*proyecto.getPersonasEnLaZona())/proyecto.getPersonasEnLaEstructura())/(proyecto.getTiempoDePermanenciaAlAnno()/8760);
    }

    public static Double calculoLBPerdidaDeVidasHumanas(Proyecto proyecto){
        return ((proyecto.getMedidaContraFuego().getValor()*proyecto.getRiesgoAlFuego().getValor()*proyecto.getTipoDeRiesgoEspecial().getValor()*proyecto.getTipoDeEstructuraParaVidaHumanaLF().getValor()*proyecto.getPersonasEnLaZona())/(proyecto.getPersonasEnLaEstructura()))/(proyecto.getTiempoDePermanenciaAlAnno()/8760);
    }

    public static Double calculoLCPerdidaDeVidasHumanas(Proyecto proyecto){
        return (((proyecto.getTipoDeEstructuraParaVidaHumanaLO().getValor()*proyecto.getPersonasEnLaZona())/(proyecto.getPersonasEnLaEstructura()))/(proyecto.getPersonasEnLaEstructura()))/(proyecto.getTiempoDePermanenciaAlAnno()/8760);
    }

    public static Double calculoLBPerdidasInaceptablesDeServiciosPublicos(Proyecto proyecto){
        return (proyecto.getMedidaContraFuego().getValor()*proyecto.getRiesgoAlFuego().getValor()*proyecto.getTipoDeServicioLF().getValor()*proyecto.getPersonasEnLaZona())/proyecto.getPersonasEnLaEstructura();
    }

    public static Double calculoLCPerdidasInaceptablesDeServiciosPublicos(Proyecto proyecto){
        return (proyecto.getTipoDeServicioLO().getValor()*proyecto.getPersonasEnLaZona())/proyecto.getPersonasEnLaEstructura();
    }

    public static Double calculoLBPerdidasDeValorCultural(Proyecto proyecto){
        return (proyecto.getMedidaContraFuego().getValor()*proyecto.getRiesgoAlFuego().getValor()*proyecto.getTipoDeEstructuraConValorCultural().getValor()*proyecto.getValorPatrimonial())/proyecto.getValorCultural();
    }

    public static Double calculoLAPerdidasEconomicas(Proyecto proyecto){
        return (proyecto.getTipoDeSuelo().getValor()*Math.pow(10,-2)*proyecto.getNumeroDeAnimalesEnLaZona())/(proyecto.getNumeroDeAnimalesEnLaZona()+proyecto.getValorMonetarioDeLaEstructura()+proyecto.getValorMonetarioDelContenido()+proyecto.getValorMonetarioDeLosSistemasInternos());
    }

    public static Double calculoLBPerdidasEconomicas(Proyecto proyecto){
        return (proyecto.getMedidaContraFuego().getValor()*proyecto.getRiesgoAlFuego().getValor()*proyecto.getTipoDeEstructuraParaEconomiaLF().getValor()*(proyecto.getNumeroDeAnimalesEnLaZona()+proyecto.getValorMonetarioDeLaEstructura()+proyecto.getValorMonetarioDelContenido()+proyecto.getValorMonetarioDeLosSistemasInternos()))/(proyecto.getNumeroDeAnimalesEnLaZona()+proyecto.getValorMonetarioDeLaEstructura()+proyecto.getValorMonetarioDelContenido()+proyecto.getValorMonetarioDeLosSistemasInternos());
    }

    public static Double calculoLCPerdidasEconomicas(Proyecto proyecto){
        return (proyecto.getTipoDeEstructuraParaEconomiaLO().getValor()*proyecto.getValorMonetarioDeLosSistemasInternos())/(proyecto.getNumeroDeAnimalesEnLaZona()+proyecto.getValorMonetarioDeLaEstructura()+proyecto.getValorMonetarioDelContenido()+proyecto.getValorMonetarioDeLosSistemasInternos());
    }
}

