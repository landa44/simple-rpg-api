package com.landa44.simplerpg.character.exception;

import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullNameException extends RuntimeException {
    public NullNameException() {
        super("name parameter can't be empty.");
    }
}
