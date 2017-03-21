package com.client;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitRoute extends RouteBuilder {

	@Autowired
	private CxfEndpoint serviceEndpoint;

	@Autowired
	private PMDMMessage pmdmMsg;

	@Autowired 
	private TestBean testBean;
	
	@Autowired
	private MessageProcessor msgProcessor;
	
	@Autowired
	private PMDMProcessor pmdmProcessor;
	
	@Override
	public void configure() {

		from("jms-test:queue:{{test.mqQueue}}").routeId(this.getClass().getSimpleName()).process(msgProcessor).transform()
		.method(pmdmMsg, "getInput")
				.to(serviceEndpoint).process(pmdmProcessor).bean(testBean,"transform");
	}
}
