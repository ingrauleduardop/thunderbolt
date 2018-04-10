package com.db.android.facade;

import com.db.android.model.ProbabilidadDeDanno;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public interface ProbabilidadDeDannoFacadeLocal {

    void crear(ProbabilidadDeDanno probabilidadDeDanno) throws SQLException;

    void eliminar(ProbabilidadDeDanno probabilidadDeDanno)throws SQLException;

    ProbabilidadDeDanno buscarPorId(Long id) throws SQLException;
}
