package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Reservation> reservations;

    // Default constructor
    public Etudiant() {
    }

    // Parameterized constructor
    public Etudiant(Long idEtudiant, String nomEt, String prenomEt, Long cin, String ecole, Date dateNaissance, Set<Reservation> reservations) {
        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecole = ecole;
        this.dateNaissance = dateNaissance;
        this.reservations = reservations;
    }

    // Getter and Setter for idEtudiant
    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    // Getter and Setter for nomEt
    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    // Getter and Setter for prenomEt
    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    // Getter and Setter for cin
    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    // Getter and Setter for ecole
    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    // Getter and Setter for dateNaissance
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // Getter and Setter for reservations
    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}