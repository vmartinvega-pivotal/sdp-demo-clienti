package it.spindox.sdp.clienti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.integration.annotation.IntegrationComponentScan;

//import it.spindox.sdp.clienti.config.GemFireConfigClienti;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
//@Import({GemFireConfigClienti.class})
@IntegrationComponentScan(basePackages="it.spindox.sdp.clienti.config")
@ComponentScan(basePackages = { 
		"it.spindox.sdp.clienti", 
		"it.spindox.sdp.clienti.api"})
public class Application implements CommandLineRunner {
	
	public static void main(String[] args) throws Exception {
        new SpringApplication(Application.class).run(args);
    }

	@Override
	public void run(String... args) throws Exception {
		// Nothing to do ...
	}
    
}
