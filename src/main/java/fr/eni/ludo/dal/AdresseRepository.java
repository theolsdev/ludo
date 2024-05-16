package fr.eni.ludo.dal;

import fr.eni.ludo.bo.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdresseRepository extends JpaRepository<Adresse, UUID> {
}
