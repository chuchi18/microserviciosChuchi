package com.chuchi.microservicios.pagos.services;


import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PagosService {

    public Mono<Pagos> getPagoId(String id);

    public Flux<Pagos> getAllPagos();

    public Mono<Pagos> savePago(Pagos nuevoPago);

    public Mono<Void> deletePago(Pagos pago);

    public Mono<Void> deletePago(String id);

  //  public Flux<Pagos> getPagoByClient_id(Integer clienteId);


    public Flux<Pagos> getPagoByStatus(String status);

}
