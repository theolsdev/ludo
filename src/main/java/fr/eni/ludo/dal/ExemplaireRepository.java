package fr.eni.ludo.dal;

import fr.eni.ludo.bo.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExemplaireRepository extends JpaRepository<Exemplaire, UUID> {
}
