package carlos.andres.crudProgramacion.services;

import carlos.andres.crudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {
   UserDTO saveUser(UserDTO userDTO );
   List<UserDTO> getUser();
}
