package com.chuchi.microservicios.facturas.services;

import com.chuchi.microservicios.entidadesMongo.domains.Factura;
import com.chuchi.microservicios.facturas.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;

    public List<Factura> getAllFacturas(){
        return this.facturaRepository.findAll();
    }

    public Optional<Factura> getFacturaId(String id){
        return this.facturaRepository.findById(id);
    }

    public Factura saveFactura(Factura factura) {
        return this.facturaRepository.save(factura);
    }

    public void deleteFactura(Factura factura){
        this.facturaRepository.delete(factura);
    }
}
