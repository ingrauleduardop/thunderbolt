package com.db.android.facade;

import com.base.android.ContextProvider;
import com.db.android.conection.DBHelper;
import com.db.android.model.ProbabilidadDeDanno;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public class ProbabilidadDeDannoFacade implements ProbabilidadDeDannoFacadeLocal {

    @Override
    public void crear(ProbabilidadDeDanno probabilidadDeDanno) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getProbabilidadDeDannosDao();
        dao.createOrUpdate(probabilidadDeDanno);
    }

    @Override
    public void eliminar(ProbabilidadDeDanno probabilidadDeDanno) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getHelper().getProbabilidadDeDannosDao();
        dao.delete(probabilidadDeDanno);
    }

    @Override
    public ProbabilidadDeDanno buscarPorId(Long id) throws SQLException {
        Dao dao = null;
        DBHelper dbHelper = new DBHelper(ContextProvider.getContext());
        dao = dbHelper.getProbabilidadDeDannosDao();
        QueryBuilder queryBuilder = dao.queryBuilder();
        return (ProbabilidadDeDanno) queryBuilder.where().eq("id", id).queryForFirst();
    }
}
