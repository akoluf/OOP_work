package Seminar5.notebook.model.repository;

import Seminar5.notebook.model.User;

import java.util.List;
import java.util.Optional;

public interface GBRepository {
    List<User> findAll();
    User create(User user);
    Optional<User> findById(Long id);
    List<String> readAll();
    void saveAll(List<String> data);
    Optional<User> update(Long userId, User update);
    void delete(Long userId);
}
