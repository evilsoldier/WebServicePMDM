package com.camel;


import com.kohls.concrete_wsdl.getsku.v1.GetSKUPort;
import com.kohls.concrete_wsdl.updatesku.v1.UpdateWarehouseAttributesPort;
import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfComponent;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@ComponentScan({ "com", "com.kohls.commons" })
@EnableTransactionManagement
public class ContextConfig {

	private CamelContext context;

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

}
