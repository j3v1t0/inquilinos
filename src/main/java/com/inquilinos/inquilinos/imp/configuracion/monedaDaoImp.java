/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.imp.configuracion;

import com.inquilinos.inquilinos.dao.configuracion.monedaDao;
import com.inquilinos.inquilinos.model.configuracion.Moneda;
import com.inquilinos.inquilinos.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author root
 */
public class monedaDaoImp implements monedaDao {

    Session sesion;
    Transaction tx;

    @Override
    public List<Moneda> listarMonedas() {
        List<Moneda> lista = null;
        try {
            this.iniciarOperacion();
            lista = sesion.createCriteria(Moneda.class).addOrder(Order.asc("idmoneda"))
                    .list();
        } catch (HibernateException he) {
            throw he;
        } finally {
            if (sesion.isOpen()) {
                sesion.close();
            }
        }

        return lista;
    }

    public void iniciarOperacion() throws HibernateException {

        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        tx.setTimeout(2);
    }

    public void manejaException(HibernateException he) throws HibernateException {

        tx.rollback();
        throw new HibernateException("Ocurrio un error en la capa de acceso a datos. ", he);
    }
}
