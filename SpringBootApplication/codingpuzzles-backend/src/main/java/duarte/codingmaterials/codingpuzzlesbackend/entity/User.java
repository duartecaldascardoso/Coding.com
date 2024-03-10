package duarte.codingmaterials.codingpuzzlesbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "eloId", nullable = false)
    private String eloId;
    @Column(name = "username")
    private String username;
    @Column(name = "countryId")
    private String countryId;
    @Column(name = "birthDate")
    private Date birthDate;

}

