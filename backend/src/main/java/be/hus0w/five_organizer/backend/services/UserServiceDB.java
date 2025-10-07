package be.hus0w.five_organizer.backend.services;

import be.hus0w.five_organizer.backend.models.User;
import be.hus0w.five_organizer.backend.repositories.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceDB implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findByActivatedTrue();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, int id_role) {
        return null;
    }

    @Override
    public void deleteUser(int id_role) {

    }

    @Override
    public void deleteUserPhysically(int id_user) {

    }
}
