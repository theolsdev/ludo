package fr.eni.ludo.dal;

import fr.eni.ludo.bo.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationRepository extends JpaRepository<Reservation, UUID> {
}
