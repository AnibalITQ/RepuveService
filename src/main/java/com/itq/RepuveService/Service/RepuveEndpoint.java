package com.itq.RepuveService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.RepuveService.business.RepuveService;
import com.itq.RepuveService.dto.ConsultarVehiculoRequest;
import com.itq.RepuveService.dto.EstadoVehiculo;

@Endpoint
public class RepuveEndpoint {
    @Autowired RepuveService repuveService;
    private static final String NAMESPACE_URI = "http://itq.com/parking/consultaRepuve";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarVehiculoRequest")
	@ResponsePayload
	public EstadoVehiculo ConsultarVehiculo(@RequestPayload ConsultarVehiculoRequest request) {
		EstadoVehiculo response = repuveService.consultarVehiculo(request.getPlaca());
		return response;
		
	}

}
