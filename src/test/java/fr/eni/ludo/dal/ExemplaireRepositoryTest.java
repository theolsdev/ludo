package fr.eni.ludo.dal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import fr.eni.ludo.bo.Exemplaire;
import fr.eni.ludo.bo.Jeu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ExemplaireRepositoryTest {

    @Autowired
    private ExemplaireRepository exemplaireRepository;

    @Autowired
    private JeuRepository jeuRepository;

    @Test
    void testSave() {

        Jeu jeu = Jeu.builder().nom("Monopoly").build();

        Jeu jeuSauvegarde = jeuRepository.save(jeu);


        // Creation d'un nouvel exemplaire
        Exemplaire exemplaire = Exemplaire.builder().codeBarre("123456789").estLouable(true).jeu(jeuSauvegarde)

                .build();

        // Sauvegarder l'exemplaire
        Exemplaire exemplaireSauvegarde = exemplaireRepository.save(exemplaire);


        // Vérifications
        assertNotNull(exemplaire.getId());
    }

    @Test
    void testFindAll() {
        List<Exemplaire> exemplaires = exemplaireRepository.findAll();
        assertNotNull(exemplaires);
    }
}
