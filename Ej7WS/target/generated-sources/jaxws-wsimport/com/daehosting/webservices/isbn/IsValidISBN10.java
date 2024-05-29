
package com.daehosting.webservices.isbn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sisbn"
})
@XmlRootElement(name = "IsValidISBN10")
public class IsValidISBN10 {

    @XmlElement(name = "sISBN", required = true)
    protected String sisbn;

    /**
     * Obtiene el valor de la propiedad sisbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISBN() {
        return sisbn;
    }

    /**
     * Define el valor de la propiedad sisbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISBN(String value) {
        this.sisbn = value;
    }

}
