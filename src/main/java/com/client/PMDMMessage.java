package com.client;

import org.springframework.stereotype.Component;

import com.kohls.schemas.cdm.bsinputoutputtypes.v1.GetSKUInput;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUAttributesType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUListType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUType;

@Component
public class PMDMMessage {

	
	public GetSKUInput getInput(Message message) {
		GetSKUInput input = new GetSKUInput();
		SKUListType skuList = new SKUListType();
		SKUType sku = new SKUType();
		SKUAttributesType skuAttr = new SKUAttributesType();
		skuAttr.setSKUNumber(Long.valueOf(message.getItemId()));
		sku.setSKUAttributes(skuAttr);
		skuList.getSKU().add(sku);
		input.setSKUList(skuList);
		return input;
	}
	
}
