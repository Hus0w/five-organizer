package be.hus0w.five_organizer.backend.services;

import be.hus0w.five_organizer.backend.models.Game;

import java.util.List;
import java.util.Optional;

public interface IGameService {
    public List<Game> getAllGames();
    public Optional<Game> getGame(Integer id_game);
    public Game addGame(Game game);
    public Game updateGame(Game game, int id_game);
    public void deleteGame(int id_game);
}
