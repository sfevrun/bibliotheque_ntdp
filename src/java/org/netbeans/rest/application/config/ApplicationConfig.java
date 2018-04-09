/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Administrator
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.CategorieRessource.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.AuteurFacadeREST.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.CategorieFacadeREST.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.LivreFacadeREST.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.PersonneFacadeREST.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.PretFacadeREST.class);
        resources.add(fr.unice.miage.ntdp.bibliotheque.services.service.UsersFacadeREST.class);
        resources.add(org.netbeans.rest.application.config.RequestFilter.class);
    }
    
}
