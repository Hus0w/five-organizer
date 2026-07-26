package be.hus0w.five_organizer.backend.repositories.jpa;

import be.hus0w.five_organizer.backend.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
