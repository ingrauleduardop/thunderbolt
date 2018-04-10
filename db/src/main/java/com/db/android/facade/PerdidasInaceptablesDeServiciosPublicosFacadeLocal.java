package com.db.android.facade;

import com.db.android.model.PerdidasInaceptablesDeServiciosPublicos;

import java.sql.SQLException;

/**
 * Created by conamerica36 on 15/01/17.
 */
public interface PerdidasInaceptablesDeServiciosPublicosFacadeLocal {

    void crear(PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos) throws SQLException;

    void eliminar(PerdidasInaceptablesDeServiciosPublicos perdidasInaceptablesDeServiciosPublicos)throws SQLException;

    PerdidasInaceptablesDeServiciosPublicos buscarPorId(Long id) throws SQLException;
}
