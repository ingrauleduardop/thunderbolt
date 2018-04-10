package com.db.android.facade;


import com.db.android.model.PerdidaDeVidasHumanas;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public interface PerdidaDeVidasHumanasFacadeLocal {

    void crear(PerdidaDeVidasHumanas perdidaDeVidasHumanas) throws SQLException;

    void eliminar(PerdidaDeVidasHumanas perdidaDeVidasHumanas)throws SQLException;

    PerdidaDeVidasHumanas buscarPorId(Long id) throws SQLException;
}
