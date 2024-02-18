package duarte.codingmaterials.codingpuzzlesbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PuzzleNotFoundException extends RuntimeException {

    public PuzzleNotFoundException(String message) {
        super(message);
    }
}
