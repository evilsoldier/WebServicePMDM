package com.client;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor implements Processor {

	private Message message;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		 this.message = exchange.getIn().getBody(Message.class);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}
