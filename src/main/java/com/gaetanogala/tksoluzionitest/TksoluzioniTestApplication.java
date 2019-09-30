package com.gaetanogala.tksoluzionitest;

import com.gaetanogala.tksoluzionitest.model.Mac;
import com.gaetanogala.tksoluzionitest.repository.CpuDataRepository;
import com.gaetanogala.tksoluzionitest.repository.ModelDataRepository;
import com.gaetanogala.tksoluzionitest.service.MacPriceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class TksoluzioniTestApplication {

    @Bean
    public CpuDataRepository getCpuDataRepository(){return new CpuDataRepository();}

    @Bean
    public ModelDataRepository getModelDataRepository(){return new ModelDataRepository();}

    public static void main(String[] args) throws Exception {SpringApplication.run(TksoluzioniTestApplication.class, args);}

}
