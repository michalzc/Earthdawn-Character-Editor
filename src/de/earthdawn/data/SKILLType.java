//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.12 at 07:29:09 PM MEZ 
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKILL_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SKILL_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}CAPABILITY_type">
 *       &lt;sequence>
 *         &lt;element name="RANK" type="{http://earthdawn.com/datatypes}RANK_type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SKILL_type", propOrder = {
    "rank"
})
@XmlSeeAlso({
    TALENTType.class
})
public class SKILLType
    extends CAPABILITYType
{

    @XmlElement(name = "RANK", required = true)
    protected RANKType rank;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link RANKType }
     *     
     */
    public RANKType getRANK() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link RANKType }
     *     
     */
    public void setRANK(RANKType value) {
        this.rank = value;
    }

}
