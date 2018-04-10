package com.db.android.facade;

import com.base.android.ContextProvider;
import com.db.android.conection.DBHelper;
import com.db.android.model.PerdidasEconomicas;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public class PerdidasEconomicasFacade implements PerdidasEconomicasFacadeLocal {

    @Override
    public void crear(PerdidasEconomicas perdidasEconomicas) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidasEconomicasDao();
        dao.createOrUpdate(perdidasEconomicas);
    }

    @Override
    public void eliminar(PerdidasEconomicas perdidasEconomicas) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidasEconomicasDao();
        dao.delete(perdidasEconomicas);
    }

    @Override
    public PerdidasEconomicas buscarPorId(Long id) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getPerdidasEconomicasDao();
        QueryBuilder queryBuilder = dao.queryBuilder();
        return (PerdidasEconomicas) queryBuilder.where().eq("id", id).queryForFirst();
    }
}
