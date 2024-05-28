package com.example.pruebahora;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;

@RestController
@RequestMapping("/Hora")
@CrossOrigin(origins="http://localhost:5173")
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
