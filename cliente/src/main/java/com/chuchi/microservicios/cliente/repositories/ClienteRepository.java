package com.chuchi.microservicios.cliente.repositories;

import com.chuchi.microservicios.cliente.domains.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface ClienteRepository extends Repository<Cliente, Integer> {
   /* @Query("SELECT DISTINCT cliente FROM Cliente cliente left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
    @Transactional(readOnly = true)
    Collection<Cliente> findByLastName(@Param("lastName") String lastName);


    @Query("SELECT cliente FROM Cliente cliente left join fetch owner.pets WHERE owner.id =:id")
    @Transactional(readOnly = true)
    Cliente findById(@Param("id") Integer id);
*/

    void save(Cliente cliente);
}
