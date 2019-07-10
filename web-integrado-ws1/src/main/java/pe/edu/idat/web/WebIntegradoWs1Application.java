package pe.edu.idat.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // -- Para que lea los Servlets que vamos a crear
@SpringBootApplication
public class WebIntegradoWs1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebIntegradoWs1Application.class, args);
	}
}
