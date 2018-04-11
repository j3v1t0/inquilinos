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
public class Nacionalidades {

    private int idnacionalidad;
    private Pais pais;
    private String nacionalidad;
    private Set datospersonales_cliente = new HashSet(0);

    public Nacionalidades() {
    }

    public Nacionalidades(int idnacionalidad, Pais pais, String nacionalidad) {
        this.idnacionalidad = idnacionalidad;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
    }

    public int getIdnacionalidad() {
        return idnacionalidad;
    }

    public void setIdnacionalidad(int idnacionalidad) {
        this.idnacionalidad = idnacionalidad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Set getDatospersonales_cliente() {
        return datospersonales_cliente;
    }

    public void setDatospersonales_cliente(Set datospersonales_cliente) {
        this.datospersonales_cliente = datospersonales_cliente;
    }

    @Override
    public String toString() {
        return nacionalidad;
    }
    
    
}
