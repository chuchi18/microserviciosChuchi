package com.chuchi.microservicios.pagos.services;


import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import com.chuchi.microservicios.pagos.repositories.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PagosService {

    @Autowired
    PagosRepository pagosRepository;

    public Optional<Pagos> getPagoId(String id){
        return pagosRepository.findById(id);
    }

    public List<Pagos> getAllPagos(){
        return pagosRepository.findAll();
    }

    public Pagos savePago(Pagos pago){
        return pagosRepository.save(pago);
    }

    public void deletePago(Pagos pago){
        pagosRepository.delete(pago);
    }

    public void deletePago(String id){
        pagosRepository.deleteById(id);
    }

  //  public Flux<Pagos> getPagoByClient_id(Integer clienteId);


    public List<Pagos> getPagoByStatus(String status){
        return pagosRepository.findByStatus(status);
    }

}
