package it.spindox.sdp.clienti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.integration.amqp.outbound.AmqpOutboundEndpoint;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
@Import({AMQPConfig.class})
public class IntegrationConfig {
	
	private static final String INTGR_AMQP_OUTBOUND_CHANNEL_NAME = "amqpOutboundChannel";
	
	@Autowired
	private AMQPConfig amqpConfig;
	
	
	@Bean
	public MessageChannel amqpOutboundChannel() {
		return new DirectChannel();
	}
	
	
	@MessagingGateway(defaultRequestChannel = INTGR_AMQP_OUTBOUND_CHANNEL_NAME)
    public interface ClientiGateway {
        void sendToRabbit(String payload);
    }
	
	
	@Bean
    @ServiceActivator(inputChannel = INTGR_AMQP_OUTBOUND_CHANNEL_NAME)
    public AmqpOutboundEndpoint amqpOutbound() {
		//
        AmqpOutboundEndpoint outbound = new AmqpOutboundEndpoint(amqpConfig.rabbitTemplate());
        // default exchange - route to queue 'queueName'
        outbound.setRoutingKey(amqpConfig.getQueueName());
        return outbound;
    }

}
