package fr.eni.ludo.dal;

import fr.eni.ludo.bo.LocationExemplaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationExemplaireRepository extends JpaRepository<LocationExemplaire, UUID> {
}
