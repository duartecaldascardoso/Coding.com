package duarte.codingmaterials.codingpuzzlesbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PuzzleDto {

    private Long id;
    private String question;
    private String answer;
    private String answerString;
}
