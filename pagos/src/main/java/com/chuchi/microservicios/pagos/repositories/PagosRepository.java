package com.chuchi.microservicios.pagos.repositories;

import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.List;

public interface PagosRepository extends MongoRepository<Pagos, String> {

    List<Pagos> findAll();

    Optional<Pagos> findById(Integer id);

    Pagos save(Pagos pago);

    void delete(Pagos pago);

    void deleteById(Integer id);

   // List<Pagos> findByClient_id(Integer client_id);

   // List<Pagos> findByBill_id(Integer bill_id);

    List<Pagos> findByStatus(String status);
}
