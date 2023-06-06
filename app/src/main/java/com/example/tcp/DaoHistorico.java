package com.example.tcp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoHistorico {

    @Insert
    void insertarHistorico(Historico...historicos);

    @Query("SELECT * FROM Historico")
    List<Historico> consultarTodosHistorico();

    @Query("SELECT * FROM Historico WHERE idSesion =:idSesion")
    List<Historico> consultarHistoricoPorSesion(int idSesion);

    @Query("SELECT h.* FROM Historico h JOIN Sesion s ON (h.idSesion = s.idSesion) WHERE s.idCategoria =:idCategoria")
    List<Historico> consultarHistoricoPorCategoria(int idCategoria);

    @Query("DELETE FROM Historico WHERE idSesion =:idSesion")
    void eliminarHistorico(int idSesion);

}
