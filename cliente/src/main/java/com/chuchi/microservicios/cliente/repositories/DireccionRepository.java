package com.chuchi.microservicios.cliente.repositories;

import com.chuchi.microservicios.entidadesMySQL.domains.Direccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface DireccionRepository extends Repository<Direccion, Integer> {


    @Query("SELECT DISTINCT direccion FROM Direccion direccion WHERE direccion.client_id=:client_id")
    @Transactional(readOnly = true)
    Collection<Direccion> findByClient_id(@Param("client_id") Integer client_id);

    @Query("SELECT direccion FROM Direccion direccion WHERE direccion.id =:id")
    @Transactional(readOnly = true)
    Direccion findById(@Param("id") Integer id);

    void save(Direccion direccion);
    void delete(Direccion direccion);
}
