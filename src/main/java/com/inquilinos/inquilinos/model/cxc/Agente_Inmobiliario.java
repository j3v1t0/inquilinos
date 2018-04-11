/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.cxc;

import com.inquilinos.inquilinos.model.configuracion.Empresas;

/**
 *
 * @author root
 */
public class Agente_Inmobiliario {
    
    private int idagente_inmobiliario;
    private String agente_inmobiliario;
    private Empresas empresa;
    private String tipo_agente;
    private String direccion;
    private String email;
    private String telefono;
    private String celular;
    private String estado_civil;
    private String porcentaje_comision;

    public Agente_Inmobiliario() {
        
    }

    public Agente_Inmobiliario(int idagente_inmobiliario, String agente_inmobiliario, Empresas empresa, String tipo_agente, String direccion, String email, String telefono, String celular, String estado_civil, String porcentaje_comision) {
        this.idagente_inmobiliario = idagente_inmobiliario;
        this.agente_inmobiliario = agente_inmobiliario;
        this.empresa = empresa;
        this.tipo_agente = tipo_agente;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.celular = celular;
        this.estado_civil = estado_civil;
        this.porcentaje_comision = porcentaje_comision;
    }

    public int getIdagente_inmobiliario() {
        return idagente_inmobiliario;
    }

    public void setIdagente_inmobiliario(int idagente_inmobiliario) {
        this.idagente_inmobiliario = idagente_inmobiliario;
    }

    public String getAgente_inmobiliario() {
        return agente_inmobiliario;
    }

    public void setAgente_inmobiliario(String agente_inmobiliario) {
        this.agente_inmobiliario = agente_inmobiliario;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public String getTipo_agente() {
        return tipo_agente;
    }

    public void setTipo_agente(String tipo_agente) {
        this.tipo_agente = tipo_agente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getPorcentaje_comision() {
        return porcentaje_comision;
    }

    public void setPorcentaje_comision(String porcentaje_comision) {
        this.porcentaje_comision = porcentaje_comision;
    }

    @Override
    public String toString() {
        return agente_inmobiliario;
    }

    
}
