package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private Set<Reservation> reservations;



    // Default constructor
    public Chambre() {
    }

    // Parameterized constructor
    public Chambre(Long idChambre, Long numeroChambre, TypeChambre typeC, Bloc bloc, Set<Reservation> reservations) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
        this.bloc = bloc;
        this.reservations = reservations;
    }

    // Getter and Setter for idChambre
    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    // Getter and Setter for numeroChambre
    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    // Getter and Setter for typeC
    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }

    // Getter and Setter for bloc
    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    // Getter and Setter for reservations
    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}