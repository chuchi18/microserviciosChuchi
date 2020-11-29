package com.chuchi.microservicios.cliente.controllers;

import com.chuchi.microservicios.cliente.services.ClienteService;
import com.chuchi.microservicios.entidadesMySQL.domains.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //Añadir nuevo cliente
    @PostMapping("/clients/new")
    public Cliente add(@RequestBody Cliente cliente){
        return clienteService.saveClient(cliente);
    }

    //Listar un determinado cliente por id
    @GetMapping("/clients/{id}")
    public Cliente getId(@PathVariable("id") Integer id){
        return clienteService.findById(id);
    }

    //Listar un determinado cliente por apellido
    @GetMapping("/clients/find/{last_name}")
    public Collection<Cliente> getLastName(@PathVariable("last_name") String last_name){
        return clienteService.findByLastName(last_name);
    }

    //Listar clientes por una determinada ciudad
    @GetMapping("/clients/city/{city}")
    public Collection<Cliente> getClientsCity(@PathVariable("city") String city){
        return clienteService.findByCity(city);
    }

    //Eliminar cliente por id
    @DeleteMapping("/clients/delete/{id}")
    public Cliente removeClient(@PathVariable("id") Integer id){
        return clienteService.deleteClient(clienteService.findById(id));
    }


}
