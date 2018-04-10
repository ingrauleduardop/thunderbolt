package com.db.android.facade;

import com.base.android.ContextProvider;
import com.db.android.conection.DBHelper;
import com.db.android.model.PerdidaDeValorCulturalIrremplazables;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public class PerdidaDeValorCulturalIrremplazablesFacade implements PerdidaDeValorCulturalIrremplazablesFacadeLocal {

    @Override
    public void crear(PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidaDeValorCulturalIrremplazablesDao();
        dao.createOrUpdate(perdidaDeValorCulturalIrremplazables);
    }

    @Override
    public void eliminar(PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidaDeValorCulturalIrremplazablesDao();
        dao.delete(perdidaDeValorCulturalIrremplazables);
    }

    @Override
    public PerdidaDeValorCulturalIrremplazables buscarPorId(Long id) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getPerdidaDeValorCulturalIrremplazablesDao();
        QueryBuilder queryBuilder = dao.queryBuilder();
        return (PerdidaDeValorCulturalIrremplazables) queryBuilder.where().eq("id", id).queryForFirst();
    }
}
