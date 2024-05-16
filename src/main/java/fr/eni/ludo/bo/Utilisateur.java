package fr.eni.ludo.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column(name = "mot_de_passe")
    private String motDePasse;


    @OneToMany(mappedBy = "utilisateur")
    private List<Location> locations;

    @OneToMany(mappedBy = "utilisateur")
    private List<Reservation> reservations;

}
