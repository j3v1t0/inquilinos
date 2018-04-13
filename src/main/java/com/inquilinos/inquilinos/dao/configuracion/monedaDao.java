/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inquilinos.inquilinos.dao.configuracion;

import com.inquilinos.inquilinos.model.configuracion.Moneda;
import java.util.List;

/**
 *
 * @author root
 */
public interface monedaDao {
    
    public List<Moneda> listarMonedas();
    
}
