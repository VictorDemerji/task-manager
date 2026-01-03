package com.example.task_manager.service;
import com.example.task_manager.model.User;
import com.example.task_manager.repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User login(String username, String password) {
        User user = repo.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Transactional
    public User register(User user) {
        entityManager.persist(user);
        return user;
    }
}
