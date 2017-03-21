package com.camel;

import java.math.BigDecimal;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.kohls.concrete_wsdl.getsku.v1.GetSKUFault;
import com.kohls.concrete_wsdl.getsku.v1.GetSKUPort;
import com.kohls.schemas.cdm.bsinputoutputtypes.v1.GetSKUInput;
import com.kohls.schemas.cdm.bsinputoutputtypes.v1.GetSKUOutput;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUDimensionListType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUDimensionType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUListType;
import com.kohls.schemas.cdm.producttypescdm.v1.SKUType;

@Component
@WebService(endpointInterface = "com.kohls.concrete_wsdl.getsku.v1.GetSKUPORT")
public class GetSKUServiceImpl implements GetSKUPort {

	@Override
	public GetSKUOutput getSKUOperation(GetSKUInput getSKUInput) throws GetSKUFault {
		GetSKUOutput output = new GetSKUOutput();
		SKUListType skuList = new SKUListType();
		SKUType sku = new SKUType();
		SKUDimensionListType dimList = new SKUDimensionListType();
		SKUDimensionType dim = new SKUDimensionType();
		dim.setSKUNumber(getSKUInput.getSKUList().getSKU().get(0).getSKUAttributes().getSKUNumber());
		dim.setSKUDimensionUsageCode("2");
		dim.setPieceNumber(1l);
		dim.setHeightQuantity(new BigDecimal("4.0"));
		dim.setWidthQuantity(new BigDecimal("4.0"));
		dim.setDepthQuantity(new BigDecimal("4.0"));
		dim.setHeightWidthDepthUnitOfMeasureCode("1");
		dim.setWeightQuantity(new BigDecimal("4.0"));
		dim.setWeightUnitOfMeasureCode("2");
		dim.setVolumeQuantity(new BigDecimal("4.0"));
		dim.setVolumeUnitOfMeasureCode("1");
		//dim.setModifiedDateTime(value);
		dim.setRecordStatusFlag("M");
		dim.setAccuracyLevelCode("2");
		dimList.getSKUDimension().add(dim);
		sku.setSKUDimensionList(dimList);
		skuList.getSKU().add(sku);
		output.setSKUList(skuList);
		return output;
	}

}
