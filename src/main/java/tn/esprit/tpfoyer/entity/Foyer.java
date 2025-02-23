package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> blocs;

    // Default constructor
    public Foyer() {
    }

    // Parameterized constructor
    public Foyer(Long idFoyer, String nomFoyer, Long capaciteFoyer, Universite universite, Set<Bloc> blocs) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
        this.universite = universite;
        this.blocs = blocs;
    }

    // Getter and Setter for idFoyer
    public Long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    // Getter and Setter for nomFoyer
    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    // Getter and Setter for capaciteFoyer
    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    // Getter and Setter for universite
    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    // Getter and Setter for blocs
    public Set<Bloc> getBlocs() {
        return blocs;
    }

    public void setBlocs(Set<Bloc> blocs) {
        this.blocs = blocs;
    }
}