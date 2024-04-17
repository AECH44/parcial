package carlos.andres.crudProgramacion.services.impl;

import carlos.andres.crudProgramacion.dao.UserDAO;
import carlos.andres.crudProgramacion.dto.UserDTO;
import carlos.andres.crudProgramacion.entity.UserEntity;
import carlos.andres.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDAO UserDAO;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        UserEntity userEntity= UserEntity.builder()
                .IDuser(userDTO.getIDuser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birhtday(userDTO.getBirhtday())
                .build();

        UserEntity saveUser = userDAO.save (userEntity);
        return UserDTO.builder()
                .IDuser(userDTO.getIDuser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birhtday(userDTO.getBirhtday())
                .build();

    }

    @Override
    public List<UserDTO> getUser() {
        List <UserEntity> userEntities = userDAO.findAll();
        return userEntities.stream() Stream<UserEntity>
        .map(userEntities.stream())
                .IDuser(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birhtday(userDTO.getBirthdate())
                .build()

        return null;
    }
}
