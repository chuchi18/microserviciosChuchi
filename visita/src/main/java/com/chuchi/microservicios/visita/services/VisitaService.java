package com.chuchi.microservicios.visita.services;

import com.chuchi.microservicios.entidadesMySQL.domains.Visita;
import com.chuchi.microservicios.visita.repositories.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VisitaService {
    @Autowired
    private VisitaRepository visitaRepository;

    public Visita saveVisit(Visita visita){
        visitaRepository.save(visita);
        return null;
    }

    public Visita findById(Integer id){
        return visitaRepository.findById(id);

    }

    public Collection<Visita> findByClient_id(Integer client_id){
        return visitaRepository.findByClient_id(client_id);
    }

    public Visita deleteVisit(Visita visita){
        visitaRepository.delete(visita);
        return null;
    }
}
