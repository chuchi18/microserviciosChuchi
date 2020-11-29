package com.chuchi.microservicios.pagos.services.imp;

import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import com.chuchi.microservicios.pagos.repositories.PagosRepository;
import com.chuchi.microservicios.pagos.services.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PagosServiceImp implements PagosService {

    @Autowired
    PagosRepository pagosRepository;

    public Mono<Pagos> getPagoId(String  id){
        return  pagosRepository.findById(id);
    }

    public Flux<Pagos> getAllPagos(){
        return pagosRepository.findAll();
    }

    public Mono<Pagos> savePago(Pagos nuevoPago) {
        return pagosRepository.save(nuevoPago);
    }

    public Mono<Void> deletePago(Pagos pago){
        return this.pagosRepository.delete(pago);
    }

    public Mono<Void> deletePago(String id){
        return this.pagosRepository.deleteById(id);
    }
/*
    public Flux<Pagos> getPagoByClient_id(Integer cliente_id){
        return pagosRepository.findByClient_id(cliente_id);
    }*/

    public Flux<Pagos> getPagoByStatus(String status){
        return pagosRepository.findByStatus(status);
    }
}
