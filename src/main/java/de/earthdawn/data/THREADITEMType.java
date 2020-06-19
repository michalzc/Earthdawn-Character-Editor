//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THREADITEM_type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="THREADITEM_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://earthdawn.com/datatypes}MAGICITEM_type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ARMOR" type="{http://earthdawn.com/datatypes}ARMOR_type" minOccurs="0"/&gt;
 *         &lt;element name="SHIELD" type="{http://earthdawn.com/datatypes}SHIELD_type" minOccurs="0"/&gt;
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" minOccurs="0"/&gt;
 *         &lt;element name="THREADRANK" type="{http://earthdawn.com/datatypes}THREADRANK_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="weaventhreadrank" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" /&gt;
 *       &lt;attribute name="maxthreads" type="{http://earthdawn.com/datatypes}unsigned_int" default="2" /&gt;
 *       &lt;attribute name="lpcostgrowth" type="{http://earthdawn.com/datatypes}unsigned_int" default="5" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THREADITEM_type", propOrder = {
    "armor",
    "shield",
    "weapon",
    "threadrank"
})
public class THREADITEMType
    extends MAGICITEMType
{

    @XmlElement(name = "ARMOR")
    protected ARMORType armor;
    @XmlElement(name = "SHIELD")
    protected SHIELDType shield;
    @XmlElement(name = "WEAPON")
    protected WEAPONType weapon;
    @XmlElement(name = "THREADRANK")
    protected List<THREADRANKType> threadrank;
    @XmlAttribute(name = "weaventhreadrank")
    protected Integer weaventhreadrank;
    @XmlAttribute(name = "maxthreads")
    protected Integer maxthreads;
    @XmlAttribute(name = "lpcostgrowth")
    protected Integer lpcostgrowth;

    /**
     * Gets the value of the armor property.
     *
     * @return
     *     possible object is
     *     {@link ARMORType }
     *
     */
    public ARMORType getARMOR() {
        return armor;
    }

    /**
     * Sets the value of the armor property.
     *
     * @param value
     *     allowed object is
     *     {@link ARMORType }
     *
     */
    public void setARMOR(ARMORType value) {
        this.armor = value;
    }

    /**
     * Gets the value of the shield property.
     *
     * @return
     *     possible object is
     *     {@link SHIELDType }
     *
     */
    public SHIELDType getSHIELD() {
        return shield;
    }

    /**
     * Sets the value of the shield property.
     *
     * @param value
     *     allowed object is
     *     {@link SHIELDType }
     *
     */
    public void setSHIELD(SHIELDType value) {
        this.shield = value;
    }

    /**
     * Gets the value of the weapon property.
     *
     * @return
     *     possible object is
     *     {@link WEAPONType }
     *
     */
    public WEAPONType getWEAPON() {
        return weapon;
    }

    /**
     * Sets the value of the weapon property.
     *
     * @param value
     *     allowed object is
     *     {@link WEAPONType }
     *
     */
    public void setWEAPON(WEAPONType value) {
        this.weapon = value;
    }

    /**
     * Gets the value of the threadrank property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadrank property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTHREADRANK().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THREADRANKType }
     *
     *
     */
    public List<THREADRANKType> getTHREADRANK() {
        if (threadrank == null) {
            threadrank = new ArrayList<THREADRANKType>();
        }
        return this.threadrank;
    }

    /**
     * Gets the value of the weaventhreadrank property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getWeaventhreadrank() {
        if (weaventhreadrank == null) {
            return  0;
        } else {
            return weaventhreadrank;
        }
    }

    /**
     * Sets the value of the weaventhreadrank property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWeaventhreadrank(Integer value) {
        this.weaventhreadrank = value;
    }

    /**
     * Gets the value of the maxthreads property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMaxthreads() {
        if (maxthreads == null) {
            return  2;
        } else {
            return maxthreads;
        }
    }

    /**
     * Sets the value of the maxthreads property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMaxthreads(Integer value) {
        this.maxthreads = value;
    }

    /**
     * Gets the value of the lpcostgrowth property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getLpcostgrowth() {
        if (lpcostgrowth == null) {
            return  5;
        } else {
            return lpcostgrowth;
        }
    }

    /**
     * Sets the value of the lpcostgrowth property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setLpcostgrowth(Integer value) {
        this.lpcostgrowth = value;
    }

}