package fr.unice.miage.ntdp.bibliotheque;

import fr.unice.miage.ntdp.bibliotheque.AccountStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-14T20:56:27")
@StaticMetamodel(Users.class)
public class Users_ extends Personne_ {

    public static volatile SingularAttribute<Users, String> motDePasse;
    public static volatile SingularAttribute<Users, AccountStatus> statutCompte;
    public static volatile SingularAttribute<Users, String> nomUtilisateur;
    public static volatile SingularAttribute<Users, Date> derniereConnexion;

}