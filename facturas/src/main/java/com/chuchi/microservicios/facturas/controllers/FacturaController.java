package com.chuchi.microservicios.facturas.controllers;

import com.chuchi.microservicios.entidadesMongo.domains.Factura;
import com.chuchi.microservicios.facturas.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/bills")
    public List<Factura> getAllBills(){
        return this.facturaService.getAllFacturas();
    }

    @GetMapping("/bills/{id}")
    public Optional<Factura> getBill(@PathVariable("id") String id){
        return this.facturaService.getFacturaId(id);
    }

    @PostMapping(value="/bills/insert")
    public Factura saveBill(@RequestBody Factura factura) {
        return this.facturaService.saveFactura(factura);

    }

    @DeleteMapping(value="/bills/delete")
    public void deleteBill(@RequestBody Factura f) {
        this.facturaService.deleteFactura(f);
    }

}
