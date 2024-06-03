
package com.mycompany.tp7arquitecturasw.ej4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.tp7arquitecturasw.ej4 package. 
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

    private final static QName _ServicioPaisesResponse_QNAME = new QName("http://ej4.tp7arquitecturasw.mycompany.com/", "ServicioPaisesResponse");
    private final static QName _ServicioPaises_QNAME = new QName("http://ej4.tp7arquitecturasw.mycompany.com/", "ServicioPaises");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.tp7arquitecturasw.ej4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicioPaisesResponse }
     * 
     */
    public ServicioPaisesResponse createServicioPaisesResponse() {
        return new ServicioPaisesResponse();
    }

    /**
     * Create an instance of {@link ServicioPaises }
     * 
     */
    public ServicioPaises createServicioPaises() {
        return new ServicioPaises();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioPaisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej4.tp7arquitecturasw.mycompany.com/", name = "ServicioPaisesResponse")
    public JAXBElement<ServicioPaisesResponse> createServicioPaisesResponse(ServicioPaisesResponse value) {
        return new JAXBElement<ServicioPaisesResponse>(_ServicioPaisesResponse_QNAME, ServicioPaisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicioPaises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej4.tp7arquitecturasw.mycompany.com/", name = "ServicioPaises")
    public JAXBElement<ServicioPaises> createServicioPaises(ServicioPaises value) {
        return new JAXBElement<ServicioPaises>(_ServicioPaises_QNAME, ServicioPaises.class, null, value);
    }

}
