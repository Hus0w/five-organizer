package be.hus0w.five_organizer.backend.services;

import be.hus0w.five_organizer.backend.models.Game;
import be.hus0w.five_organizer.backend.repositories.jpa.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class GameServiceDB implements IGameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Optional<Game> getGame(Integer id_game) {
        return gameRepository.findById(id_game);
    }

    @Override
    public Game addGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game updateGame(Game game, int id_game) {
        return null;
    }

    @Override
    public void deleteGame(int id_game) {
        gameRepository.deleteById(id_game);
    }
}
