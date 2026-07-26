package be.hus0w.five_organizer.backend.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_game;

    private int id_user;
    private String location;
    private Calendar date;
    private int[] participants;

    public Game() {}

    public Game(int id_game, int id_user, String location, Calendar date, int[] participants) {
        this.id_game = id_game;
        this.id_user = id_user;
        this.location = location;
        this.date = date;
        this.participants = participants;
    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int[] getParticipants() {
        return participants;
    }

    public void setParticipants(int[] participants) {
        this.participants = participants;
    }
}
