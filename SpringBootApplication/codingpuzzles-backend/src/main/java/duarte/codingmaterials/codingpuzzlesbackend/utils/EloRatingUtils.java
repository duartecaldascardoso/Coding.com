package duarte.codingmaterials.codingpuzzlesbackend.utils;

public class EloRatingUtils {

    private static final Integer INITIAL_USER_RATING = 400;
    private double timePassed;
    private static final double RATING_COEFFICIENT = 0.3;

    public double calculateEloForUser(Double timePassed, int currentRating, int puzzleElo){
         return currentRating*(RATING_COEFFICIENT*timePassed)*puzzleElo;
    }


}
