/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.imp.configuracion;

import com.inquilinos.inquilinos.dao.configuracion.tipoempresaDao;
import com.inquilinos.inquilinos.model.configuracion.TipoEmpresa;
import com.inquilinos.inquilinos.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class tipoempresaDaoImp implements tipoempresaDao {

    Session sesion;
    Transaction tx;

    @Override
    public List<TipoEmpresa> listarTipoEmpresa() {
        List<TipoEmpresa> lista = null;
        try {
            this.iniciarOperacion();
            lista = sesion.createCriteria(TipoEmpresa.class).addOrder(Order.asc("idtipoempresa"))
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
