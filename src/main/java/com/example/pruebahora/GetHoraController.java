package com.example.pruebahora;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;

@CrossOrigin(origins = "http://localhost:5175")
@RestController
@RequestMapping("/Hora")
public class GetHoraController {
    private HoraService hService;

    public GetHoraController(HoraService hs) {
        this.hService = hs;
    }

    @GetMapping
    public Time FindDate(){
        return hService.GetDate();
    }
}
