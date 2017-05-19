package com.camel;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.CastUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;

import com.tibco.schemas.urn.kohls.xml.schemas.message_header.v1_0.MessageHeader;

@Component
public class GetSKURoute extends RouteBuilder {

	private GetSKUServiceImpl service;
	
	private CxfEndpoint cxfEndpoint;

	public GetSKURoute(@Autowired GetSKUServiceImpl service, @Autowired @Qualifier("getCXFEndpoint") CxfEndpoint cxfEndpoint) {
		this.service = service;
		this.cxfEndpoint = cxfEndpoint;
	}

	@Override
	public void configure() {
		from(cxfEndpoint).routeId(GetSKURoute.class.getSimpleName()).bean(service);
	}

}