package com.chuchi.microservicios.cliente.controllers;

import com.chuchi.microservicios.cliente.services.DireccionService;
import com.chuchi.microservicios.entidadesMySQL.domains.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    //Añadir nueva direccion
    @PostMapping("/address/new")
    public Direccion add(@RequestBody Direccion direccion){
        return direccionService.saveAddress(direccion);
    }

    //Listar una determinada direccion
    @GetMapping("/address/{id}")
    public Direccion getId(@PathVariable("id") Integer id){
        return direccionService.findById(id);
    }

    //Listar todas las direcciones de un determinado cliente
    @GetMapping("/address/find/{client_id}")
    public Collection<Direccion> getClientAddresses(@PathVariable("client_id") Integer client_id){
        return direccionService.findByClientId(client_id);
    }

    //Eliminar direccion por id
    @DeleteMapping("/address/delete/{id}")
    public Direccion removeAddress(@PathVariable("id") Integer id){
        return direccionService.deleteAddress(direccionService.findById(id));
    }
}
