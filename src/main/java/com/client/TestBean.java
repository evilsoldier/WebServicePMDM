package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kohls.schemas.cdm.bsinputoutputtypes.v1.GetSKUOutput;

@Component
public class TestBean {
	
	@Autowired
	private MessageProcessor msgProcessor;
	
	@Autowired
	private PMDMProcessor pmdmProcessor;
	
	public void transform() {
		if(msgProcessor.getMessage() !=null && pmdmProcessor.getOutput() != null) {
			System.out.println("-----------------------------------------------------------------------------");
		}
		System.out.println(msgProcessor.getMessage());
		System.out.println(pmdmProcessor.getOutput());
	}
	
}
