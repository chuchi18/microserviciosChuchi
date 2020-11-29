package com.chuchi.microservicios.pagos.controllers;

import com.chuchi.microservicios.entidadesMongo.domains.Pagos;
import com.chuchi.microservicios.pagos.services.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
public class PagosController {

    @Autowired
    PagosService pagosService;

    @GetMapping("/pagos")
    public List<Pagos> getAllPagos(){
        return this.pagosService.getAllPagos();
    }

    @GetMapping("/pagos/{id}")
    public Optional<Pagos> getPago(@PathVariable("id") String id){
        return this.pagosService.getPagoId(id);
    }

    @PostMapping(value="/pagos/insert")
    public Pagos insertPago(@RequestBody Pagos pago) {
            return this.pagosService.savePago(pago);
    }

    @DeleteMapping(value="/pagos/delete")
    public void deletePago(@RequestBody Pagos pago) {
        pagosService.deletePago(pago);
    }

    @DeleteMapping(value="/pagos/delete/{id}")
    public void deletePago(@PathVariable("id") String id) {
        pagosService.deletePago(id);
    }
/*
    @GetMapping("/pagos/client/{id}")
    public Flux<Pagos> getPagoByClientId(@PathVariable("id") Integer id){
        return this.pagosService.getPagoByClient_id(id);
    }
*/

    @GetMapping("/pagos/status/{status}")
    public List<Pagos> getPagoByStatus(@PathVariable("status") String status){
        return this.pagosService.getPagoByStatus(status);
    }
}
