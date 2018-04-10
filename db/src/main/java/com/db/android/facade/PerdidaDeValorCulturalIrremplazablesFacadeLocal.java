package com.db.android.facade;

import com.db.android.model.PerdidaDeValorCulturalIrremplazables;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public interface PerdidaDeValorCulturalIrremplazablesFacadeLocal {

    void crear(PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables) throws SQLException;

    void eliminar(PerdidaDeValorCulturalIrremplazables perdidaDeValorCulturalIrremplazables)throws SQLException;

    PerdidaDeValorCulturalIrremplazables buscarPorId(Long id) throws SQLException;
}
