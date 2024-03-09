package duarte.codingmaterials.codingpuzzlesbackend.controller;

import duarte.codingmaterials.codingpuzzlesbackend.dto.EloRatingDto;
import duarte.codingmaterials.codingpuzzlesbackend.service.impl.EloRatingServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EloRatingController {
    EloRatingServiceImpl eloRatingService;


    /*
    REST API to update the elo rating by the ID of the elo rating (may pass to user ID)
     */
    @PutMapping("update/{id}")
    public ResponseEntity<EloRatingDto> updateEloRatingByID(@PathVariable("id") Long eloRatingId, @RequestBody EloRatingDto updatedElo) {
        EloRatingDto puzzleDto = eloRatingService.updateEloRating(eloRatingId, updatedElo);

        return ResponseEntity.ok(puzzleDto);
    }

}
