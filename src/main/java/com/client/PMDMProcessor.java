package com.client;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.kohls.schemas.cdm.bsinputoutputtypes.v1.GetSKUOutput;

@Component
public class PMDMProcessor implements Processor{

	private GetSKUOutput output;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		this.setOutput(exchange.getIn().getBody(GetSKUOutput.class));
	}

	public GetSKUOutput getOutput() {
		return output;
	}

	public void setOutput(GetSKUOutput output) {
		this.output = output;
	}

	
	
}
