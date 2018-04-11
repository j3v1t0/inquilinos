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
public class Clientes {

    private long idCliente;
    private String cliente;
    private Empresas empresa;

    public Clientes() {
    }

    public Clientes(long idCliente, String cliente, Empresas empresa) {
        this.idCliente = idCliente;
        this.cliente = cliente;
        this.empresa = empresa;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return cliente;
    }
    
    
}
