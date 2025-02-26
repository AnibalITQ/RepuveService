package com.itq.RepuveService.Service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.RepuveService.dto.ConsultarVehiculoRequest;
import com.itq.RepuveService.dto.EstadoVehiculo;

@Endpoint
public class RepuveEndpoint {
    private static final String NAMESPACE_URI = "http://itq.com/parking/consultaRepuve";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "auto")
	@ResponsePayload
	public EstadoVehiculo ConsultarVehiculo(@RequestPayload ConsultarVehiculoRequest request) {
		EstadoVehiculo response = new EstadoVehiculo();
		response.setPlaca(request.getPlaca());
        response.setMarca("Nissan");
        response.setModelo("Versa");
        response.setAnioModelo(2018);
        response.setCilindros("4");
        response.setTipo("Sedan");

		return response;
		
	}

}
