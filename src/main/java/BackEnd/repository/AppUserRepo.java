package BackEnd.repository;

import BackEnd.entity.AppUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepo {
    Optional<AppUser> findByEmail(String email);
}
