//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CHARACTERISTICS_NEWDISCIPLINETALENTCOSTDISCIPLINE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CHARACTERISTICS_NEWDISCIPLINETALENTCOSTDISCIPLINE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COST" type="{http://earthdawn.com/characteristics}CHARACTERISTICS_COST" maxOccurs="5" minOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CHARACTERISTICS_NEWDISCIPLINETALENTCOSTDISCIPLINE", namespace = "http://earthdawn.com/characteristics", propOrder = {
    "cost"
})
public class CHARACTERISTICSNEWDISCIPLINETALENTCOSTDISCIPLINE {

    @XmlElement(name = "COST", required = true)
    protected List<CHARACTERISTICSCOST> cost;

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CHARACTERISTICSCOST }
     * 
     * 
     */
    public List<CHARACTERISTICSCOST> getCOST() {
        if (cost == null) {
            cost = new ArrayList<CHARACTERISTICSCOST>();
        }
        return this.cost;
    }

}