package duarte.codingmaterials.codingpuzzlesbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Table(name = "eloRating")
public class EloRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userId", nullable = false)
    private String userId;
    @Column(name = "eloValue", nullable = false)
    private String eloValue;
}

