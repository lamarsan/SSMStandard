package com.example.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Config {

    public static String CONSTTEST;


    @Value("${CONST.TEST}")
    public void setTEST(String CONSTTEST) {
        Config.CONSTTEST = CONSTTEST;
    }
}
