package carlos.andres.crudProgramacion.controllers;

import carlos.andres.crudProgramacion.dto.UserDTO;
import carlos.andres.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    public ResponseEntity<UserDTO> saveUserController (UserDTO obj){
        return ResponseEntity.ok(userService.saveUser(obj));
    }
    public  ResponseEntity<List<UserDTO>>getALL

}
