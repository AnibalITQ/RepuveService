package com.itq.RepuveService.business;

import org.springframework.stereotype.Component;

import com.itq.RepuveService.dto.EstadoVehiculo;

@Component
public class RepuveService {
    public EstadoVehiculo consultarVehiculo(String placa) {
        EstadoVehiculo response = new EstadoVehiculo();
        response.setPlaca(placa);
        response.setMarca("Nissan");
        response.setModelo("Versa");
        response.setAnioModelo(2018);
        response.setCilindros("4");
        response.setTipo("Sedan");

        return response;
    }
}
