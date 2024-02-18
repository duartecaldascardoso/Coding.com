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
@Table(name = "puzzle")
public class Puzzle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "puzzleQuestion", nullable = false)
    private String question;
    @Column(name = "puzzleAnswer", nullable = false)
    private String answer;
    @Column(name = "answerString", nullable = false)
    private String answerString;
}
