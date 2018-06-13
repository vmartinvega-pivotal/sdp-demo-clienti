package it.spindox.sdp.clienti.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:amqp.properties")
@EnableRabbit
public class AMQPConfig  extends AbstractCloudConfig {
	
	@Value("${amqp.host}") 
	String host;
	
	@Value("${amqp.port}") 
	Integer port;
	
	@Value("${amqp.username}") 
	String username;
	
	@Value("${amqp.password}") 
	String password;
	
	@Value("${amqp.queue.name.sdp.clienti.update}") 
	String sdpQueue;
	
    @Bean
    public ConnectionFactory rabbitConnectionFactory() {
        return connectionFactory().rabbitConnectionFactory();
    }
	
	/**
	 * Configura il connection factory. In caso i parametri non consentono la connessione si innesca un processo di 
	 * auto-configurazione (in Cloud Foundry ad es.)
	 * @return
	 */
//	@Bean
//    public ConnectionFactory connectionFactory() {
//		//
//		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host, port);
//    	connectionFactory.setUsername(username);
//    	connectionFactory.setPassword(password);
//    	return connectionFactory;
//    }
	
	@Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(rabbitConnectionFactory());
    }
	
	@Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(rabbitConnectionFactory());
    }
	
//	@Bean
//    public Queue clientiQueue() {
//       return new Queue(sdpQueue);
//    }

	public String getQueueName() {
		return sdpQueue;
	}
	
}
