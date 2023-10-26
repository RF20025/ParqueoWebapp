/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.parqueowebapp.control;

import jakarta.ejb.Local;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.edu.occ.ues.ingenieria.prn335.parqueowebapp.app.entity.TipoEspacio;

/**
 *
 * @author Maria Regalado
 */
@Stateless
@LocalBean
public class TipoEspacioBean extends AbstractDataAccess<TipoEspacio> implements Serializable {
    
    @PersistenceContext(unitName = "ParqueoPU")
    EntityManager em;
    
    
    @Override
    public EntityManager getEntityManager() {
        return em;
    }
    
    public TipoEspacioBean(){
    super(TipoEspacio.class);
    }
public List<TipoEspacio> findRangeSlow(int first , int pageSIze){
        try {
            //// para dormir al findrange
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TipoEspacioBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.FindRange(first, pageSIze);
}
    
}
