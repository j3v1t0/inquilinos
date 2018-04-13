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
public class TipoEmpresa implements Serializable{

    private String idtipoempresa;
    private String tipoempresa;
    private Set empresa = new HashSet(0);

    public TipoEmpresa() {
    }

    public TipoEmpresa(String idtipoempresa, String tipoempresa) {
        this.idtipoempresa = idtipoempresa;
        this.tipoempresa = tipoempresa;
    }

    public String getIdtipoempresa() {
        return idtipoempresa;
    }

    public void setIdtipoempresa(String idtipoempresa) {
        this.idtipoempresa = idtipoempresa;
    }

    public String getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(String tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public Set getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Set empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return tipoempresa;
    }
    
    
}
