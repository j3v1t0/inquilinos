/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.tipoempresaDao;
import com.inquilinos.inquilinos.imp.configuracion.tipoempresaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.TipoEmpresa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class tipoempresaBean implements Serializable {

    private List<SelectItem> listatipoempresa;
    private TipoEmpresa tipoempresa;

    public tipoempresaBean() {

    }

    public TipoEmpresa getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(TipoEmpresa tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    public List<SelectItem> getListatipoempresa() {
        this.listatipoempresa = new ArrayList<SelectItem>();
        tipoempresaDao teDao = new tipoempresaDaoImp();

        List<TipoEmpresa> te = teDao.listarTipoEmpresa();
        listatipoempresa.clear();

        for (TipoEmpresa tiposempresa : te) {

            SelectItem tipoempresaItem = new SelectItem(tiposempresa.getIdtipoempresa(), tiposempresa.getTipoempresa());
            this.listatipoempresa.add(tipoempresaItem);

        }
        return listatipoempresa;
    }

}
