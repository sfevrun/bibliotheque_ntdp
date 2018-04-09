/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services;

import fr.unice.miage.ntdp.bibliotheque.Categorie;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.unice.miage.ntdp.bibliotheque.bean.AbstractFacade;
import java.util.List;



/**
 *
 * @author Administrator
 */
@Path("categorieTest")
public class CategorieRessource extends AbstractFacade<Categorie> {
    
    /**
     *
     * @return
     */
     public CategorieRessource() {
        super(Categorie.class);
         }
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categorie> list(){
          System.out.println("list");
          return super.findAll();
    }

    
}
