package com.kohls.concrete_wsdl.updatesku.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-03-14T13:00:46.199+02:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "LogisticsAttributeUpdateService",
                  wsdlLocation = "file:/C:/PRJ/WebServicePMDM/src/main/resources/PMDMLogisticsWarehouseAttributeUpdateServiceV1.wsdl",
                  targetNamespace = "http://www.kohls.com/Concrete_Wsdl/UpdateSKU/v1")
public class LogisticsAttributeUpdateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.kohls.com/Concrete_Wsdl/UpdateSKU/v1", "LogisticsAttributeUpdateService");
    public final static QName UpdateWarehouseAttributesPortEndpoint1 = new QName("http://www.kohls.com/Concrete_Wsdl/UpdateSKU/v1", "UpdateWarehouseAttributesPortEndpoint1");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/PRJ/WebServicePMDM/src/main/resources/PMDMLogisticsWarehouseAttributeUpdateServiceV1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LogisticsAttributeUpdateService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/PRJ/WebServicePMDM/src/main/resources/PMDMLogisticsWarehouseAttributeUpdateServiceV1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LogisticsAttributeUpdateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LogisticsAttributeUpdateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogisticsAttributeUpdateService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LogisticsAttributeUpdateService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LogisticsAttributeUpdateService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LogisticsAttributeUpdateService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UpdateWarehouseAttributesPort
     */
    @WebEndpoint(name = "UpdateWarehouseAttributesPortEndpoint1")
    public UpdateWarehouseAttributesPort getUpdateWarehouseAttributesPortEndpoint1() {
        return super.getPort(UpdateWarehouseAttributesPortEndpoint1, UpdateWarehouseAttributesPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateWarehouseAttributesPort
     */
    @WebEndpoint(name = "UpdateWarehouseAttributesPortEndpoint1")
    public UpdateWarehouseAttributesPort getUpdateWarehouseAttributesPortEndpoint1(WebServiceFeature... features) {
        return super.getPort(UpdateWarehouseAttributesPortEndpoint1, UpdateWarehouseAttributesPort.class, features);
    }

}
