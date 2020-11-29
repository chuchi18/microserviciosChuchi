package com.chuchi.microservicios.visita.controllers;

import com.chuchi.microservicios.entidadesMySQL.domains.Visita;
import com.chuchi.microservicios.visita.services.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    //Añadir nueva visita
    @PostMapping("/visits/new")
    public Visita add(@RequestBody Visita visita){
        return visitaService.saveVisit(visita);
    }

    //Listar una determinada visita por id
    @GetMapping("/visits/{id}")
    public Visita getId(@PathVariable("id") Integer id){
        return visitaService.findById(id);
    }

    //Listar visitas dependiendo del estado
    @GetMapping("/visits/status/{status}")
    public Collection<Visita> getStatus(@PathVariable("status") String status){
        return visitaService.findByStatus(status);
    }

    //Listar todas las visitas de un determinado cliente
    @GetMapping("/visits/find/{client_id}")
    public Collection<Visita> getVisitsByClient(@PathVariable("client_id") Integer client_id){
        return visitaService.findByClient_id(client_id);
    }

    //Eliminar cliente por id
    @DeleteMapping("/visits/delete/{id}")
    public Visita removeClient(@PathVariable("id") Integer id){
        return visitaService.deleteVisit(visitaService.findById(id));
    }
}
