package com.chuchi.microservicios.entidadesMongo.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Factura")
public class Factura {
    private @Id String id;

    private String paymentType;

    private List<Integer> bill_lines;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public List<Integer> getBill_lines() {
        return bill_lines;
    }

    public void setBill_lines(List<Integer> bill_lines) {
        this.bill_lines = bill_lines;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
