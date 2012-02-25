//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ITEM_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ITEM_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="used" type="{http://earthdawn.com/datatypes}yesno_type" default="yes" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" default="self" />
 *       &lt;attribute name="kind" type="{http://earthdawn.com/datatypes}itemkind_type" default="undefined" />
 *       &lt;attribute name="virtual" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *       &lt;attribute name="blooddamage" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="depatterningrate" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="bookref" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="price" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ITEM_type")
@XmlSeeAlso({
    ARMORType.class,
    WEAPONType.class,
    AMMUNITIONType.class,
    MAGICITEMType.class,
    COINSType.class
})
public class ITEMType {

    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected float weight;
    @XmlAttribute
    protected YesnoType used;
    @XmlAttribute
    protected String location;
    @XmlAttribute
    protected ItemkindType kind;
    @XmlAttribute
    protected YesnoType virtual;
    @XmlAttribute
    protected Integer blooddamage;
    @XmlAttribute
    protected Integer depatterningrate;
    @XmlAttribute
    protected String bookref;
    @XmlAttribute
    protected Integer price;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getUsed() {
        if (used == null) {
            return YesnoType.YES;
        } else {
            return used;
        }
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setUsed(YesnoType value) {
        this.used = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        if (location == null) {
            return "self";
        } else {
            return location;
        }
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link ItemkindType }
     *     
     */
    public ItemkindType getKind() {
        if (kind == null) {
            return ItemkindType.UNDEFINED;
        } else {
            return kind;
        }
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemkindType }
     *     
     */
    public void setKind(ItemkindType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the virtual property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getVirtual() {
        if (virtual == null) {
            return YesnoType.NO;
        } else {
            return virtual;
        }
    }

    /**
     * Sets the value of the virtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setVirtual(YesnoType value) {
        this.virtual = value;
    }

    /**
     * Gets the value of the blooddamage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBlooddamage() {
        if (blooddamage == null) {
            return  0;
        } else {
            return blooddamage;
        }
    }

    /**
     * Sets the value of the blooddamage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlooddamage(Integer value) {
        this.blooddamage = value;
    }

    /**
     * Gets the value of the depatterningrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDepatterningrate() {
        if (depatterningrate == null) {
            return  0;
        } else {
            return depatterningrate;
        }
    }

    /**
     * Sets the value of the depatterningrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepatterningrate(Integer value) {
        this.depatterningrate = value;
    }

    /**
     * Gets the value of the bookref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookref() {
        if (bookref == null) {
            return "";
        } else {
            return bookref;
        }
    }

    /**
     * Sets the value of the bookref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookref(String value) {
        this.bookref = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrice() {
        if (price == null) {
            return  0;
        } else {
            return price;
        }
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

}
