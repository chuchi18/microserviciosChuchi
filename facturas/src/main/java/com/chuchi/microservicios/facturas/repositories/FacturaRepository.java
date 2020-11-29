package com.chuchi.microservicios.facturas.repositories;

import com.chuchi.microservicios.entidadesMongo.domains.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FacturaRepository extends MongoRepository<Factura, String> {

    List<Factura> findAll();

    List<Factura> findByStatus(String status);

    Optional<Factura> findById(String id);

    Factura save(Factura factura);

    void delete(Factura factura);
}
