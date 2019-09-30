package com.gaetanogala.tksoluzionitest.service;

import com.gaetanogala.tksoluzionitest.model.Mac;
import com.gaetanogala.tksoluzionitest.repository.CpuDataRepository;
import com.gaetanogala.tksoluzionitest.repository.ModelDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MacPriceService {

    @Autowired
    private CpuDataRepository cpuDataRepository;
    @Autowired
    private ModelDataRepository modelDataRepository;

    public Mac getMac(Integer cpu, Integer model) throws Exception {

        return new Mac(){{

            Integer cpuValue = cpuDataRepository.getCpuPrices().get(cpu),
                    modelValue = modelDataRepository.getModelPrices().get(model);

            if(cpuValue == null || modelValue == null)
                throw new Exception("Input parameters have no match");

            setCpu(cpuValue);
            setModel(modelValue);
            setPrice(Integer.sum(cpuValue,modelValue));
        }};
    }


}
