package com.camel;

import com.kohls.concrete_wsdl.updatesku.v1.UpdateWarehouseAttributesFault;
import com.kohls.concrete_wsdl.updatesku.v1.UpdateWarehouseAttributesPort;
import com.kohls.schemas.productmdm.logisticsinterface.v1.UpdateWarehouseAttributesInputType;
import com.kohls.schemas.productmdm.logisticsinterface.v1.UpdateWarehouseAttributesOutputType;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(endpointInterface = "com.kohls.concrete_wsdl.updatesku.v1.UpdateWarehouseAttributesPort")
public class UpdateSKUServiceImpl implements UpdateWarehouseAttributesPort {

    @Override
    public UpdateWarehouseAttributesOutputType updateWarehouseAttributesOperation(
            UpdateWarehouseAttributesInputType updateWarehouseAttributesInput) throws UpdateWarehouseAttributesFault {
//		throw new UpdateWarehouseAttributesFault("The dummiest message on the world!");
        UpdateWarehouseAttributesOutputType output = new UpdateWarehouseAttributesOutputType();
        return output;
    }

}
