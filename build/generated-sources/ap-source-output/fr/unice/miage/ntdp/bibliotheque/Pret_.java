package fr.unice.miage.ntdp.bibliotheque;

import fr.unice.miage.ntdp.bibliotheque.Livre;
import fr.unice.miage.ntdp.bibliotheque.Users;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-14T20:56:27")
@StaticMetamodel(Pret.class)
public class Pret_ { 

    public static volatile SingularAttribute<Pret, Date> debut;
    public static volatile SingularAttribute<Pret, Integer> Duree;
    public static volatile SingularAttribute<Pret, Long> id;
    public static volatile SingularAttribute<Pret, Users> user;
    public static volatile SingularAttribute<Pret, Livre> livre;

}