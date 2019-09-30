package com.gaetanogala.tksoluzionitest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.HashMap;

@Configuration
@PropertySource("classpath:model.properties")
public class ModelDataRepository {

    @Autowired
    private Environment env;

    public HashMap<Integer, Integer> getModelPrices(){

        return new HashMap<Integer, Integer>(){{
            put(0, Integer.valueOf(env.getProperty("model.0")));
            put(1, Integer.valueOf(env.getProperty("model.1")));
            put(2, Integer.valueOf(env.getProperty("model.2")));
            put(3, Integer.valueOf(env.getProperty("model.3")));
            put(4, Integer.valueOf(env.getProperty("model.4")));
            put(5, Integer.valueOf(env.getProperty("model.5")));
            put(6, Integer.valueOf(env.getProperty("model.6")));
        }};
    }

}
