package ua.edu.ucu.apps.demo.flowerStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.apps.demo.flowerStore.model.AppUser;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{

    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser>findUserByEmail(String email);
}