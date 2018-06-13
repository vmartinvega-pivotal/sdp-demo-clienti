//package it.spindox.sdp.clienti.config;
//
//import java.util.Collections;
//import java.util.Properties;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.gemfire.client.ClientCacheFactoryBean;
//import org.springframework.data.gemfire.client.ClientRegionFactoryBean;
//import org.springframework.data.gemfire.client.PoolFactoryBean;
//import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
//import org.springframework.data.gemfire.support.ConnectionEndpoint;
//
//import com.gemstone.gemfire.cache.GemFireCache;
//import com.gemstone.gemfire.cache.client.ClientRegionShortcut;
//
//import it.spindox.sdp.clienti.domain.Clienti;
//import it.spindox.sdp.clienti.gemfire.ClientiCacheListener;
//
//@Configuration
//@PropertySource("classpath:gemf.properties")
//@EnableGemfireRepositories(basePackages="it.spindox.sdp.clienti.repository")
//public class GemFireConfigClienti {
//	
//	private static final String REGION_CLIENTI_NAME = "Clienti";
//	private static final String CLIENTI_POOL_NAME = "gemfirePoolClienti";
//    
//    @Value("${gemfire.locator.host}")
//    private String locatorHost;
//    
//    @Value("${gemfire.locator.port}")
//    private int locatorPort;
//    
//    @Value("${gemfire.deploy.working.dir}")
//    private String gemfireDeployWorkingDir;
//    
//    @Bean
//	Properties gemfireProperties() {
//		Properties gemfireProperties = new Properties();
//		gemfireProperties.setProperty("log-level", "config");
//		gemfireProperties.setProperty("deploy-working-dir", gemfireDeployWorkingDir);
//		return gemfireProperties;
//	}
//    
//    @Bean
//	public ClientCacheFactoryBean gemfireCache() {
//		//
//		ClientCacheFactoryBean clientCacheFactory = new ClientCacheFactoryBean();
//		clientCacheFactory.setProperties(gemfireProperties());
//		clientCacheFactory.setClose(true);
//		clientCacheFactory.setPoolName(CLIENTI_POOL_NAME);
//		return clientCacheFactory;
//	}
//    
//  
//	@Bean
//	public ClientiCacheListener[] clientiCacheListenerArray(){
//		//
//		ClientiCacheListener[] clientiListenerArray = {new ClientiCacheListener()};
//		return clientiListenerArray;
//	}
//	
//	
//	@Bean
//	public ClientRegionFactoryBean<String, Clienti> clientiRegionFactory(final GemFireCache gemfireCache) {
//		//
//	    ClientRegionFactoryBean<String, Clienti> regionFactory = new ClientRegionFactoryBean<>();
//	    regionFactory.setPoolName(CLIENTI_POOL_NAME);
//	    regionFactory.setName(REGION_CLIENTI_NAME);
//	    regionFactory.setCache(gemfireCache);
//	    regionFactory.setShortcut(ClientRegionShortcut.PROXY);
//	    regionFactory.setCacheListeners(clientiCacheListenerArray());
//	    return regionFactory;
//	}
//	
//	
//	@Bean
//	public PoolFactoryBean gemfirePoolClienti() {
//		//
//		PoolFactoryBean gemfirePool = new PoolFactoryBean();
//		gemfirePool.setName(CLIENTI_POOL_NAME);
//		gemfirePool.setRetryAttempts(1);
//		gemfirePool.setSubscriptionEnabled(true);
//		gemfirePool.setThreadLocalConnections(false);
//		gemfirePool.setLocators(Collections.singletonList(new ConnectionEndpoint(locatorHost, locatorPort)));
//		return gemfirePool;
//	}
//
//}
