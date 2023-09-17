package com.landa44.simplerpg.hero.exception;

//spring dependencies
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class HeroNotFoundException extends RuntimeException {
    public HeroNotFoundException(String msg) {
        super(msg);
    }
}
