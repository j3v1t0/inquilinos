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
public class Ciudad {

    private long idciudad;
    private String ciudad;
    private Pais pais;
    private Set municipios = new HashSet(0);

    public Ciudad() {
    }

    public Ciudad(long idciudad, String ciudad, Pais pais) {
        this.idciudad = idciudad;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public long getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(long idciudad) {
        this.idciudad = idciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Set getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Set municipios) {
        this.municipios = municipios;
    }

    @Override
    public String toString() {
        return ciudad;
    }
    
    
}
