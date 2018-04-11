/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.model.cxc;

import com.inquilinos.inquilinos.model.configuracion.Nacionalidades;
import com.inquilinos.inquilinos.model.configuracion.Sexo;
import java.util.Date;

/**
 *
 * @author root
 */
public class Datos_Personales {

    private long iddatos_personales;
    private Clientes cliente;
    private Sexo sexo;
    private Nacionalidades nacionalidades;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String celular;
    private String email;
    private Date fecha_nacimiento;
    private String estado_civil;

    public Datos_Personales() {
    }

    public Datos_Personales(long iddatos_personales, Clientes cliente, Sexo sexo, Nacionalidades nacionalidades, String nombres, String apellidos, String direccion, String telefono, String celular, String email, Date fecha_nacimiento, String estado_civil) {
        this.iddatos_personales = iddatos_personales;
        this.cliente = cliente;
        this.sexo = sexo;
        this.nacionalidades = nacionalidades;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
    }

    public long getIddatos_personales() {
        return iddatos_personales;
    }

    public void setIddatos_personales(long iddatos_personales) {
        this.iddatos_personales = iddatos_personales;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Nacionalidades getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(Nacionalidades nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    
}
