package fr.unice.miage.ntdp.bibliotheque;

import fr.unice.miage.ntdp.bibliotheque.Livre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-09T16:26:09")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> description;
    public static volatile SingularAttribute<Categorie, Long> id;
    public static volatile ListAttribute<Categorie, Livre> livres;
    public static volatile SingularAttribute<Categorie, String> nom;

}