package honestit.akwilina.projects.promises.domain.repositories;

import honestit.akwilina.projects.promises.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
