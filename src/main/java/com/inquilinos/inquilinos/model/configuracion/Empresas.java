/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.configuracion;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Empresas implements Serializable{

    private long idempresa;
    private String empresa;
    private TipoEmpresa tipoempresa;
    private String rnc;
    private Moneda moneda;
    private String direccion;
    private String telefono1;
    private String telefono2;
    private String fax;
    private String email;
    private String slogan;

    public Empresas() {
    }

    public Empresas(long idempresa, String empresa, TipoEmpresa tipoempresa, String rnc, Moneda moneda, String direccion, String telefono1, String telefono2, String fax, String email, String slogan) {
        this.idempresa = idempresa;
        this.empresa = empresa;
        this.tipoempresa = tipoempresa;
        this.rnc = rnc;
        this.moneda = moneda;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.fax = fax;
        this.email = email;
        this.slogan = slogan;
    }

    public long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(long idempresa) {
        this.idempresa = idempresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public TipoEmpresa getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(TipoEmpresa tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public String getRnc() {
        return rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return empresa;
    }
    
    
}
