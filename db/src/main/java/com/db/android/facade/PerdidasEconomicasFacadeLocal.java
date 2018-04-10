package com.db.android.facade;

import com.db.android.model.PerdidasEconomicas;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public interface PerdidasEconomicasFacadeLocal {

    void crear(PerdidasEconomicas perdidasEconomicas) throws SQLException;

    void eliminar(PerdidasEconomicas perdidasEconomicas)throws SQLException;

    PerdidasEconomicas buscarPorId(Long id) throws SQLException;
}
