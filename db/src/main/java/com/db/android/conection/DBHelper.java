package com.db.android.conection;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;


import com.base.android.ContextProvider;
import com.db.android.model.DimensionesEstructura;
import com.db.android.model.NumeroEventosPeligorsos;
import com.db.android.model.PerdidaDeValorCulturalIrremplazables;
import com.db.android.model.PerdidaDeVidasHumanas;
import com.db.android.model.PerdidasEconomicas;
import com.db.android.model.PerdidasInaceptablesDeServiciosPublicos;
import com.db.android.model.ProbabilidadDeDanno;
import com.db.android.model.Proyecto;
import com.db.android.model.Usuario;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by Andres y Jess on 18/11/2016.
 */

public class DBHelper extends OrmLiteSqliteOpenHelper {

    private static final int DB_SCHEME_VERSION = 1;
    private static final String DB_NAME = "smileMobile.sqlite";
    private static DBHelper mDBHelper;

    private Dao<Usuario, Integer> usuarioDao;
    private Dao<Proyecto, Integer> proyectoDao;
    private Dao<DimensionesEstructura, Integer> dimensionesEstructurasDao;
    private Dao<NumeroEventosPeligorsos, Integer> numeroEventosPeligorsosesDao;
    private Dao<ProbabilidadDeDanno, Integer> probabilidadDeDannosDao;
    private Dao<PerdidaDeVidasHumanas, Integer> perdidaDeVidasHumanasDao;
    private Dao<PerdidaDeValorCulturalIrremplazables, Integer> perdidaDeValorCulturalIrremplazablesDao;
    private Dao<PerdidasInaceptablesDeServiciosPublicos, Integer> perdidasInaceptablesDeServiciosPublicosDao;
    private Dao<PerdidasEconomicas, Integer> perdidasEconomicasDao;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Usuario.class);
            TableUtils.createTable(connectionSource, Proyecto.class);
            TableUtils.createTable(connectionSource, DimensionesEstructura.class);
            TableUtils.createTable(connectionSource, NumeroEventosPeligorsos.class);
            TableUtils.createTable(connectionSource, ProbabilidadDeDanno.class);
            TableUtils.createTable(connectionSource, PerdidaDeVidasHumanas.class);
            TableUtils.createTable(connectionSource, PerdidasInaceptablesDeServiciosPublicos.class);
            TableUtils.createTable(connectionSource, PerdidaDeValorCulturalIrremplazables.class);
            TableUtils.createTable(connectionSource, PerdidasEconomicas.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        onCreate(database, connectionSource);
    }

    public Dao<Usuario, Integer> getUsuarioDao() throws SQLException{
        if(usuarioDao==null){
            usuarioDao= getDao(Usuario.class);
        }
        return usuarioDao;
    }

    public Dao<Proyecto, Integer> getProyectoDao() throws SQLException{
        if(proyectoDao==null){
            proyectoDao= getDao(Proyecto.class);
        }
        return proyectoDao;
    }

    public Dao<DimensionesEstructura, Integer> getDimensionesEstructurasDao() throws SQLException{
        if(dimensionesEstructurasDao==null){
            dimensionesEstructurasDao= getDao(DimensionesEstructura.class);
        }
        return dimensionesEstructurasDao;
    }

    public Dao<NumeroEventosPeligorsos, Integer> getNumeroEventosPeligorsosesDao() throws SQLException{
        if(numeroEventosPeligorsosesDao==null){
            numeroEventosPeligorsosesDao= getDao(NumeroEventosPeligorsos.class);
        }
        return numeroEventosPeligorsosesDao;
    }

    public Dao<ProbabilidadDeDanno, Integer> getProbabilidadDeDannosDao() throws SQLException{
        if(probabilidadDeDannosDao==null){
            probabilidadDeDannosDao= getDao(ProbabilidadDeDanno.class);
        }
        return probabilidadDeDannosDao;
    }

    public Dao<PerdidaDeVidasHumanas, Integer> getPerdidaDeVidasHumanasDao() throws SQLException{
        if(perdidaDeVidasHumanasDao==null){
            perdidaDeVidasHumanasDao= getDao(PerdidaDeVidasHumanas.class);
        }
        return perdidaDeVidasHumanasDao;
    }

    public Dao<PerdidaDeValorCulturalIrremplazables, Integer> getPerdidaDeValorCulturalIrremplazablesDao() throws SQLException{
        if(perdidaDeValorCulturalIrremplazablesDao==null){
            perdidaDeValorCulturalIrremplazablesDao= getDao(PerdidaDeValorCulturalIrremplazables.class);
        }
        return perdidaDeValorCulturalIrremplazablesDao;
    }

    public Dao<PerdidasInaceptablesDeServiciosPublicos, Integer> getPerdidasInaceptablesDeServiciosPublicosDao() throws SQLException{
        if(perdidasInaceptablesDeServiciosPublicosDao==null){
            perdidasInaceptablesDeServiciosPublicosDao= getDao(PerdidasInaceptablesDeServiciosPublicos.class);
        }
        return perdidasInaceptablesDeServiciosPublicosDao;
    }

    public Dao<PerdidasEconomicas, Integer> getPerdidasEconomicasDao() throws SQLException {
        if(perdidasEconomicasDao==null){
            perdidasEconomicasDao= getDao(PerdidasEconomicas.class);
        }
        return perdidasEconomicasDao;
    }

    public DBHelper getHelper()  {
        if (mDBHelper == null) {
            mDBHelper = OpenHelperManager.getHelper(ContextProvider.getContext(), DBHelper.class);
        }
        return mDBHelper;
    }

    public void closeHelper() {
        if (mDBHelper != null) {
            OpenHelperManager.releaseHelper();
            mDBHelper = null;
        }
    }

    @Override
    public void close() {
        super.close();
    }
}