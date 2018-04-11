/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.cxc;

import com.inquilinos.inquilinos.model.configuracion.Empresas;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class Clientes {

    private long idCliente;
    private String cliente;
    private Empresas empresa;
    private Set identificacion_clientes = new HashSet(0);
    private Set datospersonales_cliente = new HashSet(0);

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

    public Set getIdentificacion_clientes() {
        return identificacion_clientes;
    }

    public void setIdentificacion_clientes(Set identificacion_clientes) {
        this.identificacion_clientes = identificacion_clientes;
    }

    public Set getDatospersonales_cliente() {
        return datospersonales_cliente;
    }

    public void setDatospersonales_cliente(Set datospersonales_cliente) {
        this.datospersonales_cliente = datospersonales_cliente;
    }

    @Override
    public String toString() {
        return cliente;
    }

}
