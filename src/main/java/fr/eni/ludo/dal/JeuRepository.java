package fr.eni.ludo.dal;

import fr.eni.ludo.bo.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JeuRepository extends JpaRepository<Jeu, UUID> {
}
