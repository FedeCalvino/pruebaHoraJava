package com.example.pruebahora;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HoraService {

    private static final GetConexion Conexion= new GetConexion();

    public Date GetDate(){
        return Conexion.FindDate();
    }
}
