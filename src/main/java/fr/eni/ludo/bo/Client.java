package fr.eni.ludo.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="client")
public class Client extends Utilisateur {

    @Column
    private String tel;

    @OneToOne
    @JoinColumn(name = "id")
    private Adresse adresse;

}
