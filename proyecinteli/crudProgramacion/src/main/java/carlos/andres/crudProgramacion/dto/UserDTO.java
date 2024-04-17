package carlos.andres.crudProgramacion.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class UserDTO {
    private long IDuser;
    private String name;
    private String email;
    private Date birhtday;

}
