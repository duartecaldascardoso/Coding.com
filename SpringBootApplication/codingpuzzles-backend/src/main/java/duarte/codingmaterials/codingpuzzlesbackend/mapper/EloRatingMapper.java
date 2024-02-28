package duarte.codingmaterials.codingpuzzlesbackend.mapper;

import duarte.codingmaterials.codingpuzzlesbackend.dto.EloRatingDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.EloRating;

public class EloRatingMapper {

    public static EloRatingDto mapToEloRatingDto(EloRating eloRating){
        return new EloRatingDto(eloRating.getId(), eloRating.getUserId(), eloRating.getEloValue());
    }

    public static EloRating mapToEloRating(EloRatingDto eloRatingDto){
        return new EloRating(eloRatingDto.getId(), eloRatingDto.getUserId(), eloRatingDto.getEloValue());
    }
}
