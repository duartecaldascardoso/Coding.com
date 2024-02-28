package duarte.codingmaterials.codingpuzzlesbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EloRatingDto {

    private Long id;
    private String userId;
    private String eloValue;
}

