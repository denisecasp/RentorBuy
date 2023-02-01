package com.denisecasp.rentorbuy.Repository;

import com.denisecasp.rentorbuy.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}