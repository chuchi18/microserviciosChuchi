package com.chuchi.microservicios.cliente.services;

import com.chuchi.microservicios.cliente.repositories.DireccionRepository;
import com.chuchi.microservicios.entidadesMySQL.domains.Direccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public Direccion saveAddress(Direccion direccion){
        direccionRepository.save(direccion);
        return null;
    }

    public Collection<Direccion> findByClientId(Integer client_id){
        return direccionRepository.findByClient_id(client_id);
    }

    public Direccion findById(Integer id){
        return direccionRepository.findById(id);

    }

    public Direccion deleteAddress(Direccion direccion){
        direccionRepository.delete(direccion);
        return null;
    }
}
