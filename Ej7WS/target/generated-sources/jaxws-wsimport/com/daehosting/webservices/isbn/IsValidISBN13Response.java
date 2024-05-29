
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
 *         &lt;element name="IsValidISBN13Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isValidISBN13Result"
})
@XmlRootElement(name = "IsValidISBN13Response")
public class IsValidISBN13Response {

    @XmlElement(name = "IsValidISBN13Result")
    protected boolean isValidISBN13Result;

    /**
     * Obtiene el valor de la propiedad isValidISBN13Result.
     * 
     */
    public boolean isIsValidISBN13Result() {
        return isValidISBN13Result;
    }

    /**
     * Define el valor de la propiedad isValidISBN13Result.
     * 
     */
    public void setIsValidISBN13Result(boolean value) {
        this.isValidISBN13Result = value;
    }

}
