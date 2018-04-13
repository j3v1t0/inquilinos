/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.tipoempresaDao;
import com.inquilinos.inquilinos.imp.configuracion.tipoempresaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.TipoEmpresa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class tipoempresaBean {

    private List<TipoEmpresa> listatipoempresa;
    private TipoEmpresa tipoempresa;

    public tipoempresaBean() {

    }

    public List<TipoEmpresa> getListatipoempresa() {
        tipoempresaDao teDao = new tipoempresaDaoImp();
        listatipoempresa = teDao.listarTipoEmpresa();
        return listatipoempresa;
    }

    public void setListatipoempresa(List<TipoEmpresa> listatipoempresa) {
        this.listatipoempresa = listatipoempresa;
    }

    public TipoEmpresa getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(TipoEmpresa tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public void prepararTipoEmpresa() {
        tipoempresa = new TipoEmpresa();
    }

}
