package com.client;

import java.net.ConnectException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.UncategorizedJmsException;
import org.springframework.stereotype.Component;

import com.kohls.concrete_wsdl.getsku.v1.GetSKUFault;

@Component
public class InitRoute extends SpringRouteBuilder {

	@Autowired
	@Qualifier("getCXFEndpoint")
	private CxfEndpoint serviceEndpoint;

	@Autowired
	private PMDMMessage pmdmMsg;

	@Autowired
	private TestBean testBean;

	@Autowired
	private MessageProcessor msgProcessor;

	@Autowired
	private PMDMProcessor pmdmProcessor;

	private static final String KLOG_ERR_QUEUE = "klog:err";

	@Override
	public void configure() {
//		onException(UncategorizedJmsException.class).maximumRedeliveries(5).redeliveryDelay(1200).to(KLOG_ERR_QUEUE);
//		onException(ConnectException.class).maximumRedeliveries(5).redeliveryDelay(1200).to(KLOG_ERR_QUEUE);
//		onException(GetSKUFault.class).maximumRedeliveries(0).handled(true).process(new Processor() {
//			public void process(Exchange exchange) throws Exception {
//				GetSKUFault fault = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, GetSKUFault.class);
//				exchange.getOut().setBody(fault);
//			}
//
//		}).to(KLOG_ERR_QUEUE);
//		onException(Exception.class).to(KLOG_ERR_QUEUE);

		from("jms-test:queue:{{test.mqQueue}}").routeId(this.getClass().getSimpleName()).process(msgProcessor)
				.transform().method(pmdmMsg, "getInput").transacted("required").to(serviceEndpoint)
				.process(pmdmProcessor).bean(testBean, "transform").to("jms-test:queue:result");
	}
}
