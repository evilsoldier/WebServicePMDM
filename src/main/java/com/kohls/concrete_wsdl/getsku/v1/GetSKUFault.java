
package com.kohls.concrete_wsdl.getsku.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-25T11:20:55.606+03:00
 * Generated source version: 3.1.10
 */

@WebFault(name = "Fault", targetNamespace = "http://www.kohls.com/schemas/cdm/BSInputOutputTypes/V1")
public class GetSKUFault extends Exception {
    
    private com.kohls.schemas.cdm.bsinputoutputtypes.v1.Fault fault;

    public GetSKUFault() {
        super();
    }
    
    public GetSKUFault(String message) {
        super(message);
    }
    
    public GetSKUFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetSKUFault(String message, com.kohls.schemas.cdm.bsinputoutputtypes.v1.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public GetSKUFault(String message, com.kohls.schemas.cdm.bsinputoutputtypes.v1.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.kohls.schemas.cdm.bsinputoutputtypes.v1.Fault getFaultInfo() {
        return this.fault;
    }
}
