package com.kohls.concrete_wsdl.getsku.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-21T14:06:34.066+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "GetSKUService", 
                  wsdlLocation = "file:/home/stoykov/tmp/workspace/WebServicePMDM/src/main/resources/GetSKU.wsdl",
                  targetNamespace = "http://www.kohls.com/Concrete_Wsdl/GetSKU/v1") 
public class GetSKUService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.kohls.com/Concrete_Wsdl/GetSKU/v1", "GetSKUService");
    public final static QName HTTPConnection = new QName("http://www.kohls.com/Concrete_Wsdl/GetSKU/v1", "HTTPConnection");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/stoykov/tmp/workspace/WebServicePMDM/src/main/resources/GetSKU.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetSKUService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/stoykov/tmp/workspace/WebServicePMDM/src/main/resources/GetSKU.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetSKUService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetSKUService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetSKUService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GetSKUService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GetSKUService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GetSKUService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GetSKUPort
     */
    @WebEndpoint(name = "HTTPConnection")
    public GetSKUPort getHTTPConnection() {
        return super.getPort(HTTPConnection, GetSKUPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetSKUPort
     */
    @WebEndpoint(name = "HTTPConnection")
    public GetSKUPort getHTTPConnection(WebServiceFeature... features) {
        return super.getPort(HTTPConnection, GetSKUPort.class, features);
    }

}