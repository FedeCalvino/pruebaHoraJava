package com.example.pruebahora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaHoraApplication {
static HoraService horaService = new HoraService();
    public static void main(String[] args) {
        horaService.GetDate();
        SpringApplication.run(PruebaHoraApplication.class, args);
    }


}
