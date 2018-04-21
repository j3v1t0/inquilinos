/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.empresaDao;
import com.inquilinos.inquilinos.dao.configuracion.monedaDao;
import com.inquilinos.inquilinos.dao.configuracion.tipoempresaDao;
import com.inquilinos.inquilinos.imp.configuracion.empresaDaoImp;
import com.inquilinos.inquilinos.imp.configuracion.monedaDaoImp;
import com.inquilinos.inquilinos.imp.configuracion.tipoempresaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.Empresas;
import com.inquilinos.inquilinos.model.configuracion.Moneda;
import com.inquilinos.inquilinos.model.configuracion.TipoEmpresa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class empresaBean {

    private List<Empresas> listaEmpresas = new ArrayList<>();
    private Empresas empresa;
    private String tipoempresa;
    private String moneda;
    private empresaDao eDao;
    public empresaBean() {

    }
    
    public String init(){
        eDao = new empresaDaoImp();
        listaEmpresas = eDao.listarEmpresas();
        return null;
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

    public String getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(String tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void prepararNuevoEmpresa() {
        empresa = new Empresas();
    }

    public void nuevoEmpresa() {
        empresa.setTipoempresa(new TipoEmpresa(tipoempresa));
        empresa.setMoneda(new Moneda(Integer.valueOf(moneda)));
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
