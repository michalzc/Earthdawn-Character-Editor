//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CALCULATEDLEGENDPOINTS_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALCULATEDLEGENDPOINTS_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="attributes" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="disciplinetalents" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="optionaltalents" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="knacks" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="skills" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="spells" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="karma" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="magicitems" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="total" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CALCULATEDLEGENDPOINTS_type", namespace = "http://earthdawn.com/character")
public class CALCULATEDLEGENDPOINTSType {

    @XmlAttribute
    protected Integer attributes;
    @XmlAttribute
    protected Integer disciplinetalents;
    @XmlAttribute
    protected Integer optionaltalents;
    @XmlAttribute
    protected Integer knacks;
    @XmlAttribute
    protected Integer skills;
    @XmlAttribute
    protected Integer spells;
    @XmlAttribute
    protected Integer karma;
    @XmlAttribute
    protected Integer magicitems;
    @XmlAttribute
    protected Integer total;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAttributes() {
        if (attributes == null) {
            return  0;
        } else {
            return attributes;
        }
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributes(Integer value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the disciplinetalents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDisciplinetalents() {
        if (disciplinetalents == null) {
            return  0;
        } else {
            return disciplinetalents;
        }
    }

    /**
     * Sets the value of the disciplinetalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisciplinetalents(Integer value) {
        this.disciplinetalents = value;
    }

    /**
     * Gets the value of the optionaltalents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getOptionaltalents() {
        if (optionaltalents == null) {
            return  0;
        } else {
            return optionaltalents;
        }
    }

    /**
     * Sets the value of the optionaltalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptionaltalents(Integer value) {
        this.optionaltalents = value;
    }

    /**
     * Gets the value of the knacks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getKnacks() {
        if (knacks == null) {
            return  0;
        } else {
            return knacks;
        }
    }

    /**
     * Sets the value of the knacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKnacks(Integer value) {
        this.knacks = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSkills() {
        if (skills == null) {
            return  0;
        } else {
            return skills;
        }
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkills(Integer value) {
        this.skills = value;
    }

    /**
     * Gets the value of the spells property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpells() {
        if (spells == null) {
            return  0;
        } else {
            return spells;
        }
    }

    /**
     * Sets the value of the spells property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpells(Integer value) {
        this.spells = value;
    }

    /**
     * Gets the value of the karma property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getKarma() {
        if (karma == null) {
            return  0;
        } else {
            return karma;
        }
    }

    /**
     * Sets the value of the karma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKarma(Integer value) {
        this.karma = value;
    }

    /**
     * Gets the value of the magicitems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMagicitems() {
        if (magicitems == null) {
            return  0;
        } else {
            return magicitems;
        }
    }

    /**
     * Sets the value of the magicitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMagicitems(Integer value) {
        this.magicitems = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTotal() {
        if (total == null) {
            return  0;
        } else {
            return total;
        }
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
