package com.denisecasp.rentorbuy.Repository;

import com.denisecasp.rentorbuy.Entity.User;

import java.util.List;
import java.util.Optional;

public interface JpaRepository<T, T1> {
    void saveAll(List<User> user1);

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
