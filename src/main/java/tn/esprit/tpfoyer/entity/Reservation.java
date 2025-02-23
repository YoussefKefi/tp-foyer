package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne(cascade = CascadeType.ALL)
    private Chambre chambre;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Etudiant> etudiants;

    // Default constructor
    public Reservation() {
    }

    // Parameterized constructor
    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide, Chambre chambre, Set<Etudiant> etudiants) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
        this.chambre = chambre;
        this.etudiants = etudiants;
    }

    // Getter and Setter for idReservation
    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    // Getter and Setter for anneeUniversitaire
    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    // Getter and Setter for estValide
    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    // Getter and Setter for chambre
    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    // Getter and Setter for etudiants
    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}