package com.gaetanogala.tksoluzionitest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.HashMap;

@Configuration
@PropertySource("classpath:cpu.properties")
public class CpuDataRepository {

    @Autowired
    private Environment env;

    public HashMap<Integer, Integer> getCpuPrices(){

        return new HashMap<Integer, Integer>(){{
            put(0, Integer.valueOf(env.getProperty("cpu.0")));
            put(1, Integer.valueOf(env.getProperty("cpu.1")));
            put(2, Integer.valueOf(env.getProperty("cpu.2")));
        }};
    }

}
