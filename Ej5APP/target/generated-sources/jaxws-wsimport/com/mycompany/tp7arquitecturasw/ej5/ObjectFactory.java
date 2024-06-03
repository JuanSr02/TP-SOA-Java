
package com.mycompany.tp7arquitecturasw.ej5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.tp7arquitecturasw.ej5 package. 
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

    private final static QName _IngresarLetraResponse_QNAME = new QName("http://ej5.tp7arquitecturasw.mycompany.com/", "ingresarLetraResponse");
    private final static QName _SetKResponse_QNAME = new QName("http://ej5.tp7arquitecturasw.mycompany.com/", "setKResponse");
    private final static QName _IngresarLetra_QNAME = new QName("http://ej5.tp7arquitecturasw.mycompany.com/", "ingresarLetra");
    private final static QName _SetK_QNAME = new QName("http://ej5.tp7arquitecturasw.mycompany.com/", "setK");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.tp7arquitecturasw.ej5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IngresarLetraResponse }
     * 
     */
    public IngresarLetraResponse createIngresarLetraResponse() {
        return new IngresarLetraResponse();
    }

    /**
     * Create an instance of {@link SetKResponse }
     * 
     */
    public SetKResponse createSetKResponse() {
        return new SetKResponse();
    }

    /**
     * Create an instance of {@link SetK }
     * 
     */
    public SetK createSetK() {
        return new SetK();
    }

    /**
     * Create an instance of {@link IngresarLetra }
     * 
     */
    public IngresarLetra createIngresarLetra() {
        return new IngresarLetra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarLetraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej5.tp7arquitecturasw.mycompany.com/", name = "ingresarLetraResponse")
    public JAXBElement<IngresarLetraResponse> createIngresarLetraResponse(IngresarLetraResponse value) {
        return new JAXBElement<IngresarLetraResponse>(_IngresarLetraResponse_QNAME, IngresarLetraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej5.tp7arquitecturasw.mycompany.com/", name = "setKResponse")
    public JAXBElement<SetKResponse> createSetKResponse(SetKResponse value) {
        return new JAXBElement<SetKResponse>(_SetKResponse_QNAME, SetKResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarLetra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej5.tp7arquitecturasw.mycompany.com/", name = "ingresarLetra")
    public JAXBElement<IngresarLetra> createIngresarLetra(IngresarLetra value) {
        return new JAXBElement<IngresarLetra>(_IngresarLetra_QNAME, IngresarLetra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ej5.tp7arquitecturasw.mycompany.com/", name = "setK")
    public JAXBElement<SetK> createSetK(SetK value) {
        return new JAXBElement<SetK>(_SetK_QNAME, SetK.class, null, value);
    }

}
