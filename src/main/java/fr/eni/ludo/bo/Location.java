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
@Table(name="location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "date_deb")
    private Date dateDeb;

    @Column(name = "est_paye")
    private boolean estPaye;

    @OneToMany(mappedBy = "location")
    private List<LocationExemplaire> locationExemplaires;

    @ManyToOne
    @JoinColumn(name = "id")
    private Client client;

}
