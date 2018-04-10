package com.db.android.facade;

import com.base.android.ContextProvider;
import com.db.android.conection.DBHelper;
import com.db.android.model.PerdidaDeVidasHumanas;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public class PerdidaDeVidasHumanasFacade implements PerdidaDeVidasHumanasFacadeLocal {

    @Override
    public void crear(PerdidaDeVidasHumanas perdidaDeVidasHumanas) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidaDeVidasHumanasDao();
        dao.createOrUpdate(perdidaDeVidasHumanas);
    }

    @Override
    public void eliminar(PerdidaDeVidasHumanas perdidaDeVidasHumanas) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidaDeVidasHumanasDao();
        dao.delete(perdidaDeVidasHumanas);
    }

    @Override
    public PerdidaDeVidasHumanas buscarPorId(Long id) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getPerdidaDeVidasHumanasDao();
        QueryBuilder queryBuilder = dao.queryBuilder();
        return (PerdidaDeVidasHumanas) queryBuilder.where().eq("id", id).queryForFirst();
    }
}
