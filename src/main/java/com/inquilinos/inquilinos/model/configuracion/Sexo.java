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
public class Sexo {

    private char idsexo;
    private String sexo;
    private Set datospersonales_cliente = new HashSet(0);

    public Sexo() {
    }

    public Sexo(char idsexo, String sexo) {
        this.idsexo = idsexo;
        this.sexo = sexo;
    }

    public char getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(char idsexo) {
        this.idsexo = idsexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set getDatospersonales_cliente() {
        return datospersonales_cliente;
    }

    public void setDatospersonales_cliente(Set datospersonales_cliente) {
        this.datospersonales_cliente = datospersonales_cliente;
    }

    @Override
    public String toString() {
        return sexo;
    }
    
    
}
