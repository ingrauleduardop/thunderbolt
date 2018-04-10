package com.db.android.facade;

import com.base.android.ContextProvider;
import com.db.android.conection.DBHelper;
import com.db.android.model.PerdidasInaceptablesDeServiciosPublicos;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public class PerdidasInaceptablesDeServiciosPublicosFacade implements PerdidasInaceptablesDeServiciosPublicosFacadeLocal{

    @Override
    public void crear(PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidasInaceptablesDeServiciosPublicosDao();
        dao.createOrUpdate(perdidasInaceptablesDeServiciosPublicos);
    }

    @Override
    public void eliminar(PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getPerdidasInaceptablesDeServiciosPublicosDao();
        dao.delete(perdidasInaceptablesDeServiciosPublicos);
    }

    @Override
    public PerdidasInaceptablesDeServiciosPublicos buscarPorId(Long id) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getPerdidasInaceptablesDeServiciosPublicosDao();
        QueryBuilder queryBuilder = dao.queryBuilder();
        return (PerdidasInaceptablesDeServiciosPublicos) queryBuilder.where().eq("id", id).queryForFirst();
    }
}
