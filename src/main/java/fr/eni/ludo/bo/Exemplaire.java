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
@Table(name="exemplaire")
public class Exemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column()
    private String codeBarre;

    @Column(name = "est_louable")
    private boolean estLouable;

    @ManyToOne()
    @JoinColumn(name = "jeu_id")
    private Jeu jeu;

    // @OneToMany
    // private List<Reservation> reservations;
    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @OneToMany(mappedBy = "exemplaire")
    private List<LocationExemplaire> locationExemplaires;

}


