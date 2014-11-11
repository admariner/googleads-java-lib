
package com.google.api.ads.dfp.jaxws.v201411;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CustomFieldService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201411/CustomFieldService?wsdl")
public class CustomFieldService
    extends Service
{

    private final static URL CUSTOMFIELDSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMFIELDSERVICE_EXCEPTION;
    private final static QName CUSTOMFIELDSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201411", "CustomFieldService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201411/CustomFieldService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMFIELDSERVICE_WSDL_LOCATION = url;
        CUSTOMFIELDSERVICE_EXCEPTION = e;
    }

    public CustomFieldService() {
        super(__getWsdlLocation(), CUSTOMFIELDSERVICE_QNAME);
    }

    public CustomFieldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CustomFieldServiceInterface
     */
    @WebEndpoint(name = "CustomFieldServiceInterfacePort")
    public CustomFieldServiceInterface getCustomFieldServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CustomFieldServiceInterfacePort"), CustomFieldServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomFieldServiceInterface
     */
    @WebEndpoint(name = "CustomFieldServiceInterfacePort")
    public CustomFieldServiceInterface getCustomFieldServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201411", "CustomFieldServiceInterfacePort"), CustomFieldServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMFIELDSERVICE_EXCEPTION!= null) {
            throw CUSTOMFIELDSERVICE_EXCEPTION;
        }
        return CUSTOMFIELDSERVICE_WSDL_LOCATION;
    }

}
