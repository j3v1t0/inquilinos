/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.configuracion;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class Moneda implements Serializable{

    private long idmoneda;
    private String moneda;
    private String simbolo;
    private Set empresa = new HashSet(0);

    public Moneda() {
    }

    public Moneda(long idmoneda, String moneda, String simbolo) {
        this.idmoneda = idmoneda;
        this.moneda = moneda;
        this.simbolo = simbolo;
    }

    public long getIdmoneda() {
        return idmoneda;
    }

    public void setIdmoneda(long idmoneda) {
        this.idmoneda = idmoneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Set getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Set empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return moneda;
    }
    
    
}
