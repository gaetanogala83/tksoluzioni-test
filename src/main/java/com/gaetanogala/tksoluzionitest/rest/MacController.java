package com.gaetanogala.tksoluzionitest.rest;

import com.gaetanogala.tksoluzionitest.service.MacPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class MacController {

    @Autowired
    private MacPriceService macPriceService;

    @GetMapping("price")
    public String getMacPrice(@RequestParam(name = "model") Integer model, @RequestParam(name = "cpu", required = false, defaultValue = "0") Integer cpu) throws Exception {

        return String.valueOf(macPriceService.getMac(model, cpu).getPrice());
    }
}
