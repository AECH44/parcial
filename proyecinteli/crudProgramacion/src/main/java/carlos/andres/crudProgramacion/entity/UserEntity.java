package carlos.andres.crudProgramacion.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Table (name= "users")

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity implements Serializable {
    @Id
    @Column (name = "id_user")
    private long IDuser;
    private String name;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date birhtday;

}
