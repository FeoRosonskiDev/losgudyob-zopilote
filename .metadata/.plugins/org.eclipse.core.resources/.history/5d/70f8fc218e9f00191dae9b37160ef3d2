package pe.proyecto.losgudyob.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.proyecto.losgudyob.view.endpoint.LosGudYobEndpoint;

@Configuration
public class CXFConfig {
	
	@Autowired
	private LosGudYobEndpoint lgyEndpoint;
	
	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/services/*");
	}
	
	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), lgyEndpoint);
		endpoint.getFeatures().add(new LoggingFeature());
		endpoint.publish("/LosGudYob");
		return endpoint;
	}

}
