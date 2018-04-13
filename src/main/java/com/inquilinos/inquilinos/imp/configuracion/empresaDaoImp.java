/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.imp.configuracion;

import com.inquilinos.inquilinos.dao.configuracion.empresaDao;
import com.inquilinos.inquilinos.model.configuracion.Empresas;
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
public class empresaDaoImp implements empresaDao {

    Session sesion;
    Transaction tx;

    @Override
    public List<Empresas> listarEmpresas() {
        List<Empresas> lista = null;
        try {
            this.iniciarOperacion();
            lista = sesion.createCriteria(Empresas.class).addOrder(Order.asc("idempresa"))
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

    @Override
    public boolean newEmpresas(Empresas empresa) {
        boolean resp = false;
        try {
            iniciarOperacion();
            //tr.setTimeout(2);
            sesion.save(empresa);
            tx.commit();
            resp = true;
        } catch (HibernateException he) {
            tx.rollback();
            manejaException(he);
            resp = false;
            throw he;
        } finally {
            if (sesion.isOpen()) {
                sesion.close();
            }
        }
        return resp;
    }

    @Override
    public boolean updateEmpresas(Empresas empresa) {
        boolean resp = false;
        try {
            iniciarOperacion();
            //tr.setTimeout(2);
            sesion.saveOrUpdate(empresa);
            tx.commit();
            resp = true;
        } catch (HibernateException he) {
            tx.rollback();
            manejaException(he);
            resp = false;
            throw he;
        } finally {
            if (sesion.isOpen()) {
                sesion.close();
            }
        }
        return resp;
    }

    @Override
    public boolean deleteEmpresas(Empresas empresa) {
        boolean resp = false;
        try {
            iniciarOperacion();
            //tr.setTimeout(2);
            sesion.delete(empresa);
            tx.commit();
            resp = true;
        } catch (HibernateException he) {
            tx.rollback();
            manejaException(he);
            resp = false;
            throw he;
        } finally {
            if (sesion.isOpen()) {
                sesion.close();
            }
        }
        return resp;
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
