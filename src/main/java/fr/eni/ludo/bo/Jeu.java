package fr.eni.ludo.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "jeu")
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column()
    private String nom;

    @Column(name = "prix_location")
    private double prixLocation;

    @ManyToMany()
    @JoinTable(name = "genre_jeu", joinColumns = @JoinColumn(name = "jeu_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;

    @OneToMany(mappedBy = "jeu")
    private List<Exemplaire> exemplaires;

}
