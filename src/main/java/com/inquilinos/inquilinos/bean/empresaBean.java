/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.empresaDao;
import com.inquilinos.inquilinos.imp.configuracion.empresaDaoImp;
import com.inquilinos.inquilinos.imp.configuracion.tipoempresaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.Empresas;
import com.inquilinos.inquilinos.model.configuracion.TipoEmpresa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class empresaBean {

    private List<Empresas> listaEmpresas;
    private Empresas empresa;


    public empresaBean() {

    }

    public List<Empresas> getListaEmpresas() {
        empresaDao eDao = new empresaDaoImp();
        listaEmpresas = eDao.listarEmpresas();
        return listaEmpresas;
    }

    public void setListaEmpresas(List<Empresas> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    public Empresas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresas empresa) {
        this.empresa = empresa;
    }

    public void prepararNuevoEmpresa() {
        empresa = new Empresas();
    }

    public void nuevoEmpresa() {
        empresaDao eDao = new empresaDaoImp();
        eDao.newEmpresas(empresa);
    }

    public void modificarEmpresa() {
        empresaDao eDao = new empresaDaoImp();
        eDao.updateEmpresas(empresa);
        empresa = new Empresas();
    }

    public void eliminarEmpresa() {
        empresaDao eDao = new empresaDaoImp();
        eDao.deleteEmpresas(empresa);
        empresa = new Empresas();
    }
   
}
