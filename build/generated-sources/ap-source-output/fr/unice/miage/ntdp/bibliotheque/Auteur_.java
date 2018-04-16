package fr.unice.miage.ntdp.bibliotheque;

import fr.unice.miage.ntdp.bibliotheque.Livre;
import fr.unice.miage.ntdp.bibliotheque.TypeAuteur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-14T20:56:27")
@StaticMetamodel(Auteur.class)
public class Auteur_ extends Personne_ {

    public static volatile SingularAttribute<Auteur, String> nationalite;
    public static volatile SingularAttribute<Auteur, String> aProposDe;
    public static volatile SingularAttribute<Auteur, TypeAuteur> type;
    public static volatile ListAttribute<Auteur, Livre> livres;

}