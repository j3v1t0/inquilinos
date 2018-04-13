/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.dao.configuracion;

import com.inquilinos.inquilinos.model.configuracion.Empresas;
import java.util.List;

/**
 *
 * @author root
 */
public interface empresaDao {

    public List<Empresas> listarEmpresas();

    public boolean newEmpresas(Empresas empresa);

    public boolean updateEmpresas(Empresas empresa);

    public boolean deleteEmpresas(Empresas empresa);
    
}
