package com.chuchi.microservicios.cliente.services;

import com.chuchi.microservicios.cliente.repositories.ClienteRepository;
import com.chuchi.microservicios.entidadesMySQL.domains.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveClient(Cliente cliente){
        clienteRepository.save(cliente);
        return null;
    }

    public Cliente findById(Integer id){
        return clienteRepository.findById(id);

    }

    public Collection<Cliente> findByLastName(String last_name){
        return clienteRepository.findByLastName(last_name);
    }

    public Cliente deleteClient(Cliente cliente){
        clienteRepository.delete(cliente);
        return null;
    }

}
