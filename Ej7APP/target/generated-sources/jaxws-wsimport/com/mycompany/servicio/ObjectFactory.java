
package com.mycompany.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServicioPrincipal_QNAME = new QName("http://servicio.mycompany.com/", "ServicioPrincipal");
    private final static QName _ServicioPrincipalResponse_QNAME = new QName("http://servicio.mycompany.com/", "ServicioPrincipalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicioPrincipal }
     * 
     */
    public ServicioPrincipal createServicioPrincipal() {
        return new ServicioPrincipal();
    }

    /**
     * Create an instance of {@link ServicioPrincipalResponse }
     * 
     */
    public ServicioPrincipalResponse createServicioPrincipalResponse() {
        return new ServicioPrincipalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioPrincipal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.mycompany.com/", name = "ServicioPrincipal")
    public JAXBElement<ServicioPrincipal> createServicioPrincipal(ServicioPrincipal value) {
        return new JAXBElement<ServicioPrincipal>(_ServicioPrincipal_QNAME, ServicioPrincipal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioPrincipalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.mycompany.com/", name = "ServicioPrincipalResponse")
    public JAXBElement<ServicioPrincipalResponse> createServicioPrincipalResponse(ServicioPrincipalResponse value) {
        return new JAXBElement<ServicioPrincipalResponse>(_ServicioPrincipalResponse_QNAME, ServicioPrincipalResponse.class, null, value);
    }

}
