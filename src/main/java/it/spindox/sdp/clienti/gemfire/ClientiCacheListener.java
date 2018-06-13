package it.spindox.sdp.clienti.gemfire;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.util.CacheListenerAdapter;

import it.spindox.sdp.clienti.domain.Clienti;

public class ClientiCacheListener extends CacheListenerAdapter<String, Clienti> implements Declarable {

	private static final Logger log = LogManager.getLogger(ClientiCacheListener.class);
	
	@Override
	public void afterCreate(EntryEvent<String, Clienti> event) {
		//
		log.info("processEvent: " + event.toString());
	}

	@Override
	public void afterUpdate(EntryEvent<String, Clienti> event) {
		//
		log.info("processEvent: " + event.toString());
		
	}

	@Override
	public void init(Properties arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
