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
public class Municipio {

    private long idmunicipio;
    private String municipio;
    private Ciudad ciudad;
    private Set sectores = new HashSet(0);

    public Municipio() {
    }

    public Municipio(long idmunicipio, String municipio, Ciudad ciudad) {
        this.idmunicipio = idmunicipio;
        this.municipio = municipio;
        this.ciudad = ciudad;
    }

    public long getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(long idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Set getSectores() {
        return sectores;
    }

    public void setSectores(Set sectores) {
        this.sectores = sectores;
    }

    @Override
    public String toString() {
        return municipio;
    }
    
    
}
