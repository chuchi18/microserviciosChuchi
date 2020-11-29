package com.chuchi.microservicios.entidadesMySQL.domains;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "address")
    protected String address;

    @Column(name = "client_id")
    protected Integer client_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }
}
