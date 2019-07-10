package pe.proyecto.losgudyob.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "pe.proyecto.losgudyob.persistence.repository",
		"pe.proyecto.losgudyob.transactional.service" })
@PropertySource("application.properties")
@Profile("test")
public class TestConfig {

}
