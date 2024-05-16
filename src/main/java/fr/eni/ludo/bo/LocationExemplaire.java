package fr.eni.ludo.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="location_exemplaire")
public class LocationExemplaire {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "date_fin")
    private Date dateFin;

    @Column(name = "prix_final")
    private double prixFinal;

    @ManyToOne
    @JoinColumn(name = "id")
    private Exemplaire exemplaire;

    @ManyToOne
    @JoinColumn(name = "id")
    private Location location;

}
