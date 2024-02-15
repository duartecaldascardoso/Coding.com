package duarte.codingmaterials.codingpuzzlesbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoPuzzleFoundException extends NullPointerException{

    public NoPuzzleFoundException(String message){
        super(message);
    }
}
