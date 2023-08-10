package com.landa44.simplerpg.enemy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EnemyNotFoundException extends RuntimeException {
    public EnemyNotFoundException(String msg) {
        super(msg);
    }
}
