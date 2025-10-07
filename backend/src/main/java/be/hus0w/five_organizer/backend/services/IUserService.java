package be.hus0w.five_organizer.backend.services;

import be.hus0w.five_organizer.backend.models.User;

import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public List<User> getUsers();
    public User addUser(User user);
    public User updateUser(User user, int id_role);
    public void deleteUser(int id_role);
    public void deleteUserPhysically(int id_user);
}
