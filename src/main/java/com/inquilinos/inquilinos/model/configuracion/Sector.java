/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.configuracion;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class Sector {

    private long idsector;
    private String sector;
    private Municipio municipio;
    private Set datospersonales_cliente = new HashSet(0);

    public Sector() {
    }

    public Sector(long idsector, String sector, Municipio municipio) {
        this.idsector = idsector;
        this.sector = sector;
        this.municipio = municipio;
    }

    public long getIdsector() {
        return idsector;
    }

    public void setIdsector(long idsector) {
        this.idsector = idsector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Set getDatospersonales_cliente() {
        return datospersonales_cliente;
    }

    public void setDatospersonales_cliente(Set datospersonales_cliente) {
        this.datospersonales_cliente = datospersonales_cliente;
    }

    @Override
    public String toString() {
        return sector;
    }
    
    
}
