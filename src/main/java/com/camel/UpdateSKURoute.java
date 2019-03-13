package com.camel;

import com.kohls.schemas.productmdm.logisticsinterface.v1.UpdateWarehouseAttributesInputType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UpdateSKURoute extends RouteBuilder {

	private UpdateSKUServiceImpl service;
	private CxfEndpoint cxfEndpoint;

	public UpdateSKURoute(@Autowired UpdateSKUServiceImpl service, @Autowired @Qualifier("updateCXFEndpoint") CxfEndpoint cxfEndpoint) {
		this.service = service;
		this.cxfEndpoint = cxfEndpoint;
	}

	@Override
	public void configure() {
		from(cxfEndpoint).routeId(UpdateSKURoute.class.getSimpleName()).process(new Processor() {
			
			@Override
			public void process(Exchange ex) throws Exception {
				UpdateWarehouseAttributesInputType body = ex.getIn().getBody(UpdateWarehouseAttributesInputType.class);
				Long skuNumber = body.getSKU().getSKUAttributes().getSKUNumber();
				System.out.println(skuNumber);
			}
		})
		.bean(service);
	}
}

