/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.parqueowebapp.boundary.jsf;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Maria Regalado
 */
@Named
@SessionScoped
public class SesionUsuario implements Serializable {
    
    @Inject
    FacesContext fc;
    
    Map<String, Object> idiomas=new HashMap<>();
    String idiomaSeleccionado;

    @PostConstruct
    public void inicializar() {
        this.iniciarIdiomas();

    }

    public void iniciarIdiomas() {
        idiomas.put("English", new Locale("en", "US"));
        idiomas.put("Spanish", new Locale("es", "ES"));
    }

    public Map<String, Object> getIdiomas() {
        return idiomas;
    }

    public String getIdiomaSeleccionado() {
        return idiomaSeleccionado;
    }

    public void setIdiomaSeleccionado(String idiomaSeleccionado) {
        this.idiomaSeleccionado = idiomaSeleccionado;
    }

    public void cambiarIdioma(ValueChangeEvent vce){
        String idioma = vce.getNewValue().toString();
        for (Map.Entry<String, Object> idio : idiomas.entrySet()) {
            if (idio.getValue().toString().equalsIgnoreCase(idioma)) {
                fc.getViewRoot().setLocale((Locale) idio.getValue());
                
            }
            
        }
    }
    

}
