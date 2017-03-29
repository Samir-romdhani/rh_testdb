/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tn.ensi.entities.Formation;

/**
 *
 * @author user
 */
@Stateless
public class FormationFacade extends AbstractFacade<Formation> {

    @PersistenceContext(unitName = "App_rhtestdbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormationFacade() {
        super(Formation.class);
    }
    
}
