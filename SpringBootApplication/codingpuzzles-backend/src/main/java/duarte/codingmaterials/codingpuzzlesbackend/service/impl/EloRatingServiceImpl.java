package duarte.codingmaterials.codingpuzzlesbackend.service.impl;

import duarte.codingmaterials.codingpuzzlesbackend.dto.EloRatingDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.EloRating;
import duarte.codingmaterials.codingpuzzlesbackend.exception.EloRatingNotFoundException;
import duarte.codingmaterials.codingpuzzlesbackend.exception.PuzzleNotFoundException;
import duarte.codingmaterials.codingpuzzlesbackend.mapper.EloRatingMapper;
import duarte.codingmaterials.codingpuzzlesbackend.repository.EloRatingRepository;
import duarte.codingmaterials.codingpuzzlesbackend.service.EloRatingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@AllArgsConstructor
@Service
public class EloRatingServiceImpl implements EloRatingService {
    private EloRatingRepository eloRatingRepository;
    private static final String ELO_RATING_NOT_FOUND_BY_ID = "No Puzzle was found with the provided id.";

    @Override
    public EloRatingDto getEloForUser(Long userId, EloRatingDto eloRatingDto) {
        return null;
    }

    @Override
    public EloRatingDto updateEloRating(Long eloRatingId, EloRatingDto eloRatingDto) {
        EloRating eloRating = eloRatingRepository.findById(eloRatingId).orElseThrow(() -> new EloRatingNotFoundException(ELO_RATING_NOT_FOUND_BY_ID));

        eloRating.setId(eloRatingDto.getId());
        eloRating.setEloValue(eloRating.getEloValue());
        eloRating.setUserId(eloRating.getUserId());

        EloRating updatedEloRating = eloRatingRepository.save(eloRating);
        return EloRatingMapper.mapToEloRatingDto(updatedEloRating);
    }
}
