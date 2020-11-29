package com.chuchi.microservicios.cliente.repositories;

import com.chuchi.microservicios.entidadesMySQL.domains.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface ClienteRepository extends Repository<Cliente, Integer> {

    @Query("SELECT DISTINCT cliente FROM Cliente cliente WHERE cliente.last_name LIKE :last_name%")
    @Transactional(readOnly = true)
    Collection<Cliente> findByLastName(@Param("last_name") String last_name);


    @Query("SELECT cliente FROM Cliente cliente WHERE cliente.id =:id")
    @Transactional(readOnly = true)
    Cliente findById(@Param("id") Integer id);


    void save(Cliente cliente);
    void delete(Cliente cliente);
}
