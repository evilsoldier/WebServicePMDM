package com.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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