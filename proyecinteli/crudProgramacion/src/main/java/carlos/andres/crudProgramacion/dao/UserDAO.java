package carlos.andres.crudProgramacion.dao;

import carlos.andres.crudProgramacion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Integer> {
}
