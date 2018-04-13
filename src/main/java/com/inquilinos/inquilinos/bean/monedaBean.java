/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.monedaDao;
import com.inquilinos.inquilinos.imp.configuracion.monedaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.Moneda;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class monedaBean {

    private List<Moneda> listaMoneda;
    private Moneda moneda;

    public monedaBean() {
    }

    public List<Moneda> getListaMoneda() {
        monedaDao mDao = new monedaDaoImp();
        listaMoneda = mDao.listarMonedas();
        return listaMoneda;
    }

    public void setListaMoneda(List<Moneda> listaMoneda) {
        this.listaMoneda = listaMoneda;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

}
