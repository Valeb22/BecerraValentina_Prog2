package co.edu.unbosque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.unbosque")
public class CrudSistemaTransportesBogota1Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudSistemaTransportesBogota1Application.class, args);
	}

}
