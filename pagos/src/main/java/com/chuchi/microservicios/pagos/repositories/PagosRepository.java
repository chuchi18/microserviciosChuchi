package com.chuchi.microservicios.pagos.repositories;

import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PagosRepository extends ReactiveMongoRepository<Pagos, String> {

    Flux<Pagos> findAll();

    Mono<Pagos> findById(Integer id);

    Mono<Pagos> save(Pagos pago);

    Mono<Void> delete(Pagos pago);

    Mono<Void> deleteById(Integer id);

   // Flux<Pagos> findByClient_id(Integer client_id);

   // Flux<Pagos> findByBill_id(Integer bill_id);

    Flux<Pagos> findByStatus(String status);
}
