package fr.eni.ludo.dal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import fr.eni.ludo.bo.Exemplaire;
import fr.eni.ludo.bo.Genre;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class GenreRepositoryTest {

    @Autowired
    private GenreRepository genreRepository;

    @Test
    void testSave() {
        // Creation d'un nouveau genre
        Genre genre = Genre.builder()
                .libelle("Action")
                .build();

        // Sauvegarder le genre
        Genre genreSauvegarde = genreRepository.save(genre);

        // Vérifications
        assertNotNull(genreSauvegarde.getId());
        assertThat(genreSauvegarde.getLibelle()).isEqualTo("Action");
    }

}
