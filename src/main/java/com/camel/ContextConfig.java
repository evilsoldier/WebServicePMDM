package com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfComponent;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.jms.JmsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.kohls.commons.MQUtils;
import com.kohls.concrete_wsdl.getsku.v1.GetSKUPort;

@Component
@ComponentScan({ "com", "com.kohls.commons" })
public class ContextConfig {

	private CamelContext context;

	public ContextConfig(@Autowired CamelContext context, @Autowired MQUtils mqUtils) {
		this.context = context;
		context.addComponent("jms-test",
				JmsComponent.jmsComponentAutoAcknowledge(mqUtils.createMQConnectionFactory("test")));
	}

	@Bean
	public CxfEndpoint getCXFEndpoint() {
		CxfComponent cxfComponent = new CxfComponent(context);
		CxfEndpoint serviceEndpoint = new CxfEndpoint(
				"http://localhost:8061/BusinessServices/Interfaces/SKU/GetSKUService.serviceagent/HTTPConnection",
				cxfComponent);
		serviceEndpoint.setServiceClass(GetSKUPort.class);
		serviceEndpoint.setWsdlURL("src/main/resources/GetSKU.wsdl");
		serviceEndpoint.setCamelContext(context);
		return serviceEndpoint;
	}
}
