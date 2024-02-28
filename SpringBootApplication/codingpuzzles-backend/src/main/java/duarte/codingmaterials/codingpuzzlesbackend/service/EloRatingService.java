package duarte.codingmaterials.codingpuzzlesbackend.service;

import duarte.codingmaterials.codingpuzzlesbackend.dto.EloRatingDto;

public interface EloRatingService {

    EloRatingDto getEloForUser(Long userId, EloRatingDto eloRatingDto);
    EloRatingDto updateEloRating(Long eloRatingId, EloRatingDto eloRatingDto);

}
