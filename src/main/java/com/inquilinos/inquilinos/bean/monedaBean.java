/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.bean;

import com.inquilinos.inquilinos.dao.configuracion.monedaDao;
import com.inquilinos.inquilinos.imp.configuracion.monedaDaoImp;
import com.inquilinos.inquilinos.model.configuracion.Moneda;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@ViewScoped
public class monedaBean {

    private List<SelectItem> listaMoneda;
    private Moneda moneda;

    public monedaBean() {
        moneda = new Moneda();
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public List<SelectItem> getListaMoneda() {
        this.listaMoneda = new ArrayList<SelectItem>();
        monedaDao mDao = new monedaDaoImp();

        List<Moneda> m = mDao.listarMonedas();
        listaMoneda.clear();

        for (Moneda monedas : m) {
            SelectItem monedaItem = new SelectItem(monedas.getIdmoneda(),  monedas.getMoneda());
            this.listaMoneda.add(monedaItem);
        }
        return listaMoneda;
    }

}
