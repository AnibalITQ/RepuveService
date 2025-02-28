package com.itq.RepuveService.Service;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs //Habilita a la clase con la funcionalidad para crear un WS SOAP
@Configuration //Habilita a la clase con la funcionalidad para procesar Beans
public class RepuveWebServiceConfig {
    
    	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);

		ServletRegistrationBean<MessageDispatcherServlet> registration = new ServletRegistrationBean<>(servlet, "/ws/*");
		registration.setName("messageDispatcherServlet");
		registration.setLoadOnStartup(1);
		registration.setOrder(1);
		return registration;
	}
	
	@Bean(name = "Repuve")
	public Wsdl11Definition defaultWsdl11Definition() {
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		ClassPathResource wsdlResource = new ClassPathResource("wsdl/Repuve.wsdl");
		if (wsdlResource.exists()) {
			System.out.println("El archivo WSDL se encuentra en la ruta: " + wsdlResource.getPath());
		} else {
			System.out.println("El archivo WSDL no se encuentra en la ruta especificada.");
		}
		wsdl11Definition.setWsdl(wsdlResource);
		return wsdl11Definition;
	}
	
	@Bean (name = "repuve")
	public XsdSchema tallerSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/Repuve.xsd"));
	}

}
