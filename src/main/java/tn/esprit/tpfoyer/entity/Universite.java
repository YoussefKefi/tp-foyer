package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    private Foyer foyer;

    // Default constructor
    public Universite() {
    }

    // Parameterized constructor
    public Universite(Long idUniversite, String nomUniversite, String adresse, Foyer foyer) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
        this.foyer = foyer;
    }

    // Getter and Setter for idUniversite
    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    // Getter and Setter for nomUniversite
    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    // Getter and Setter for adresse
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter and Setter for foyer
    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}