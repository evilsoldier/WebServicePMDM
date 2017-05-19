package com.camel;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfComponent;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.spring.spi.SpringTransactionPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.connection.JmsTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.kohls.commons.MQUtils;
import com.kohls.concrete_wsdl.getsku.v1.GetSKUPort;
import com.kohls.concrete_wsdl.updatesku.v1.UpdateWarehouseAttributesPort;

@Component
@ComponentScan({ "com", "com.kohls.commons" })
@EnableTransactionManagement
public class ContextConfig {

	private CamelContext context;
	private ConnectionFactory connFactory;

	public ContextConfig(@Autowired CamelContext context, @Autowired MQUtils mqUtils) {
		this.context = context;
		connFactory = mqUtils.createMQConnectionFactory("test");
		JmsComponent jmsComponent = JmsComponent.jmsComponentAutoAcknowledge(connFactory);
		jmsComponent.setTransacted(true);
		context.addComponent("jms-test", jmsComponent);
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

	@Bean
	public CxfEndpoint updateCXFEndpoint() {
		CxfComponent cxfComponent = new CxfComponent(context);
		CxfEndpoint serviceEndpoint = new CxfEndpoint(
				"http://localhost:8061/PrivateBusinessServices/Interfaces/Logistics/LogisticsAttributeUpdateService.serviceagent/UpdateWarehouseAttributesPortEndpoint1",
				cxfComponent);
		serviceEndpoint.setServiceClass(UpdateWarehouseAttributesPort.class);
		serviceEndpoint.setWsdlURL("src/main/resources/PMDMLogisticsWarehouseAttributeUpdateServiceV1.wsdl");
		serviceEndpoint.setCamelContext(context);
		return serviceEndpoint;
	}

	@Bean
	public JmsTransactionManager txManager(@Autowired MQUtils mqUtils) {
		JmsTransactionManager jtm = new JmsTransactionManager();
		jtm.setConnectionFactory(connFactory);
		return jtm;
	}

	@Bean
	public SpringTransactionPolicy required(@Autowired PlatformTransactionManager ptm) {
		SpringTransactionPolicy stp = new SpringTransactionPolicy();
		stp.setTransactionManager(ptm);
		stp.setPropagationBehaviorName("PROPAGATION_REQUIRED");
		return stp;
	}

}
