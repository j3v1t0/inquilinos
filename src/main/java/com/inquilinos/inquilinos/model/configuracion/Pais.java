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
public class Pais {

    private long idpais;
    private String pais;
    private Set ciudades = new HashSet(0);
    private Set nacionalidades = new HashSet(0);

    public Pais() {
    }

    public Pais(long idpais, String pais) {
        this.idpais = idpais;
        this.pais = pais;
    }

    public long getIdpais() {
        return idpais;
    }

    public void setIdpais(long idpais) {
        this.idpais = idpais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Set getCiudades() {
        return ciudades;
    }

    public void setCiudades(Set ciudades) {
        this.ciudades = ciudades;
    }

    public Set getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(Set nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    @Override
    public String toString() {
        return pais;
    }
    
    
}
