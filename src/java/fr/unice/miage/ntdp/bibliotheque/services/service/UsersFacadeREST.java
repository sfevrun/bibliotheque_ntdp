/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque.services.service;

import fr.unice.miage.ntdp.bibliotheque.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 *
 * @author Administrator
 */
@Stateless
@Path("users")
public class UsersFacadeREST extends AbstractFacade<Users> {
    @PersistenceContext(unitName = "BibliothequePU")
    private EntityManager em;

    public UsersFacadeREST() {
        super(Users.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public Users create(Users entity) {
        String da=entity.getPhoto();
      entity.setPhoto("image1");
     super.create(entity);      
       entity.saveImage(da);
         return entity;
    }
  
    
   
    
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public Users edit(@PathParam("id") Long id, Users entity) {
        super.edit(entity);
        return entity;
    }

    @DELETE
    @Path("{id}")
    public Long remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
        return id;
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Users find(@PathParam("id") Long id) {
        Users.findImage(id.toString());
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Users> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Users> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
