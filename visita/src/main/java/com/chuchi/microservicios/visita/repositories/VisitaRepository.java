package com.chuchi.microservicios.visita.repositories;

import com.chuchi.microservicios.entidadesMySQL.domains.Visita;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface VisitaRepository extends Repository<Visita, Integer> {

    @Query("SELECT DISTINCT visita FROM Visita visita WHERE visita.client_id =:client_id")
    @Transactional(readOnly = true)
    Collection<Visita> findByClient_id(@Param("client_id") Integer client_id);


    @Query("SELECT visita FROM Visita visita WHERE visita.id =:id")
    @Transactional(readOnly = true)
    Visita findById(@Param("id") Integer id);


    void save(Visita visita);
    void delete(Visita visita);
}
