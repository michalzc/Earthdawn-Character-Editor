//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_ATTRIBUTE"/>
 *         &lt;element name="SPELLLEGENDPOINTCOST" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="THREADITEMDOSTACK" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
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
    "attribute",
    "spelllegendpointcost",
    "threaditemdostack"
})
@XmlRootElement(name = "OPTIONALRULES", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULES {

    @XmlElement(name = "ATTRIBUTE", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULESATTRIBUTE attribute;
    @XmlElement(name = "SPELLLEGENDPOINTCOST", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType spelllegendpointcost;
    @XmlElement(name = "THREADITEMDOSTACK", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType threaditemdostack;

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULESATTRIBUTE }
     *     
     */
    public OPTIONALRULESATTRIBUTE getATTRIBUTE() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULESATTRIBUTE }
     *     
     */
    public void setATTRIBUTE(OPTIONALRULESATTRIBUTE value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the spelllegendpointcost property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getSPELLLEGENDPOINTCOST() {
        return spelllegendpointcost;
    }

    /**
     * Sets the value of the spelllegendpointcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setSPELLLEGENDPOINTCOST(OPTIONALRULEType value) {
        this.spelllegendpointcost = value;
    }

    /**
     * Gets the value of the threaditemdostack property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getTHREADITEMDOSTACK() {
        return threaditemdostack;
    }

    /**
     * Sets the value of the threaditemdostack property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setTHREADITEMDOSTACK(OPTIONALRULEType value) {
        this.threaditemdostack = value;
    }

}
